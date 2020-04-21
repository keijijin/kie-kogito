package org.drools.project.model;

import org.drools.model.Model;
import org.kie.api.builder.ReleaseId;
import org.drools.compiler.kproject.ReleaseIdImpl;

public class ProjectModel implements org.drools.modelcompiler.CanonicalKieModuleModel {

    @Override
    public String getVersion() {
        return "0.9.0";
    }

    @Override
    public java.util.List<Model> getModels() {
        return java.util.Arrays.asList(new com.sample.dtables.RulesB1795019E0BB21C81CEDB82F349EE62D());
    }

    public java.util.List<Model> getModelsForKieBase(String kieBaseName) {
        switch (kieBaseName) {
            case "helloKB": return getModels();
        }
        throw new IllegalArgumentException("Unknown KieBase: " + kieBaseName);
    }

    @Override
    public ReleaseId getReleaseId() {
        return new ReleaseIdImpl("dummy", "dummy", "0.0.0");
    }

@Override()
public org.kie.api.builder.model.KieModuleModel getKieModuleModel() {
    org.kie.api.builder.model.KieModuleModel kModuleModel = org.kie.api.KieServices.get().newKieModuleModel();
    org.kie.api.builder.model.KieBaseModel kieBaseModel_helloKB = kModuleModel.newKieBaseModel("helloKB");
    kieBaseModel_helloKB.setEventProcessingMode(org.kie.api.conf.EventProcessingOption.CLOUD);
    kieBaseModel_helloKB.addPackage("com.sample.dtables");
    org.kie.api.builder.model.KieSessionModel kieSessionModel_helloKS = kieBaseModel_helloKB.newKieSessionModel("helloKS");
    kieSessionModel_helloKS.setType(org.kie.api.builder.model.KieSessionModel.KieSessionType.STATEFUL);
    kieSessionModel_helloKS.setClockType(org.kie.api.runtime.conf.ClockTypeOption.get("realtime"));
    return kModuleModel;
}
}