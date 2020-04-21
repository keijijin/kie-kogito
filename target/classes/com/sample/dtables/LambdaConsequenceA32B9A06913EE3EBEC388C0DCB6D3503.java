package com.sample.dtables;

import static com.sample.dtables.RulesB1795019E0BB21C81CEDB82F349EE62D.*;
import com.sample.model.Message;
import com.sample.dtables.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequenceA32B9A06913EE3EBEC388C0DCB6D3503 implements org.drools.model.functions.Block2<org.drools.model.Drools, com.sample.model.Message> {

    INSTANCE;

    public static final String EXPRESSION_HASH = "4B5A6FA3BC4D2426968598EC835E063F";

    private final org.drools.model.BitMask mask_m = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataB1795019E0BB21C81CEDB82F349EE62D.com_sample_model_Message_Metadata_INSTANCE, "message");

    @Override()
    public void execute(org.drools.model.Drools drools, com.sample.model.Message m) throws java.lang.Exception {
        {
            System.out.println(m.getMessage());
            m.setMessage("Goodbye cruel world");
            drools.update(m, mask_m);
            m.setStatus(Message.GOODBYE);
            drools.update(m, mask_m);
        }
    }
}
