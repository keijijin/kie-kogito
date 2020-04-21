# KieSessionをKogitoで使う

このプロジェクトは、Quarkus＆KogitoでKie(Knowledge Is Everything)セッションを動かす手順を紹介したものです。

[Quarkusについて](https://quarkus.io)

[Kogitoについて](https://kogito.kie.org)

## ルールエンジン起動の手順

1. kmodule.xmlの定義

   - Sample.xlsをsrc/main/resourcesの下のcom/sampleディレクトリに作成する。
   - com.sampleを参照する以下のようなkmodule.xmlをsrc/main/resourcesフォルダ下の”METAーINF”フォルダに作成する。
  
  ```vb
<?xml version="1.0" encoding="UTF-8"?>
<kmodule xmlns="http://www.drools.org/xsd/kmodule">
    <kbase name="helloKB" packages="com.sample">
        <ksession name="helloKS"/>
    </kbase>
</kmodule>
  ```
_セッション名にハイフン（-）を入れたら、エラーが発生して動かなかった。ハマる。。。_


2. リソースクラスの作成

  - http://localhost:8080/hello/{message}/{status}をエンドポイントとして、ルールを起動する処理を記述する。MessageRuntimeResource.java

```
@Path("/hello/{message}/{status}")
public class MessageRuntimeResource {

    @Inject
    KieRuntimeBuilder runtimeBuilder;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Message sayHello(@PathParam("message") String message, @PathParam("status") int status) {
        KieSession ksession = runtimeBuilder.newKieSession("helloKS");
        Message msg = new Message(message, status);
        ksession.insert(msg);
        ksession.fireAllRules();
        return msg;
    }
}
```

**これだけ。**

~~期待していたupdate(m);は効いていないみたい。~~
Messageクラスに、@ClassReactiveアノテーションを付けると、update(m);は有効になる。

***

## サンプルプログラムの起動について

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```
./mvnw quarkus:dev
```

## Packaging and running the application

The application can be packaged using `./mvnw package`.
It produces the `kiesession-hello-1.0.0-SNAPSHOT-runner.jar` file in the `/target` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/lib` directory.

The application is now runnable using `java -jar target/kiesession-hello-1.0.0-SNAPSHOT-runner.jar`.

## Creating a native executable

You can create a native executable using: 

`./mvnw package -Pnative`.

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: 

`./mvnw package -Pnative -Dquarkus.native.container-build=true`.

You can then execute your native executable with: 

`./target/kiesession-hello-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/building-native-image.