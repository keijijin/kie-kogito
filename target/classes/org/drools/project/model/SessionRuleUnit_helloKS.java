package org.drools.project.model;

import org.kie.kogito.rules.KieRuntimeBuilder;
import org.kie.kogito.rules.units.SessionData;
import org.kie.kogito.rules.units.SessionRuleUnitInstance;
import org.kie.kogito.rules.units.SessionUnit;

@javax.inject.Singleton()
@javax.inject.Named("helloKS")
public class SessionRuleUnit_helloKS extends SessionUnit {

    @javax.inject.Inject()
    KieRuntimeBuilder runtimeBuilder;

    @Override
    public SessionRuleUnitInstance createInstance(SessionData memory, String name) {
        return new SessionRuleUnitInstance(this, memory, runtimeBuilder.newKieSession("helloKS"));
    }
}
