package com.sample;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sample.model.Message;

import org.kie.api.runtime.KieSession;
import org.kie.kogito.rules.KieRuntimeBuilder;

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