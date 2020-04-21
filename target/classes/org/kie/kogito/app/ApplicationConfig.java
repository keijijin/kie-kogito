package org.kie.kogito.app;

import org.kie.kogito.process.ProcessConfig;
import org.kie.kogito.process.ProcessEventListenerConfig;
import org.kie.kogito.process.WorkItemHandlerConfig;
import org.kie.kogito.rules.RuleConfig;
import org.kie.kogito.rules.RuleEventListenerConfig;
import org.kie.kogito.uow.UnitOfWorkManager;

@javax.inject.Singleton()
public class ApplicationConfig implements org.kie.kogito.Config {

    protected ProcessConfig processConfig;

    protected RuleConfig ruleConfig;

    private org.kie.kogito.rules.RuleEventListenerConfig defaultRuleEventListenerConfig = new org.drools.core.config.DefaultRuleEventListenerConfig();

    @javax.inject.Inject()
    javax.enterprise.inject.Instance<org.kie.kogito.rules.RuleEventListenerConfig> ruleEventListenerConfig;

    @Override
    public ProcessConfig process() {
        return processConfig;
    }

    @Override
    public RuleConfig rule() {
        return ruleConfig;
    }

    protected org.kie.kogito.rules.RuleEventListenerConfig extract_ruleEventListenerConfig() {
        if (ruleEventListenerConfig.isUnsatisfied() == false)
            return ruleEventListenerConfig.get();
        else
            return defaultRuleEventListenerConfig;
    }

    public org.kie.kogito.Addons addons() {
        return new org.kie.kogito.Addons(java.util.Arrays.asList());
    }

    @javax.annotation.PostConstruct()
    public void init() {
        processConfig = null;
        ruleConfig = new org.drools.core.config.StaticRuleConfig(extract_ruleEventListenerConfig());
    }
}
