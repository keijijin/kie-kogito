package com.sample.dtables;

import static com.sample.dtables.RulesB1795019E0BB21C81CEDB82F349EE62D.*;
import com.sample.model.Message;
import com.sample.dtables.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequenceFCB10C0939E16EFF940D75562BDD89BB implements org.drools.model.functions.Block1<com.sample.model.Message> {

    INSTANCE;

    public static final String EXPRESSION_HASH = "0437F89BD73C77A5DE39988EFDE66A20";

    @Override()
    public void execute(com.sample.model.Message m) throws java.lang.Exception {
        {
            System.out.println(m.getMessage());
        }
    }
}
