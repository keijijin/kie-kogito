package com.sample.dtables;

import java.util.*;
import org.drools.model.*;
import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import java.time.*;
import java.time.format.*;
import java.text.*;
import org.drools.core.util.*;
import com.sample.model.Message;
import static com.sample.dtables.RulesB1795019E0BB21C81CEDB82F349EE62D.*;

public class RulesB1795019E0BB21C81CEDB82F349EE62DRuleMethods0 {

    /**
     * Rule name: HelloWorld_11
     */
    public static org.drools.model.Rule rule_HelloWorld__11() {
        final org.drools.model.Variable<com.sample.model.Message> var_m = D.declarationOf(com.sample.model.Message.class,
                                                                                          DomainClassesMetadataB1795019E0BB21C81CEDB82F349EE62D.com_sample_model_Message_Metadata_INSTANCE,
                                                                                          "m");
        final org.drools.model.BitMask mask_m = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataB1795019E0BB21C81CEDB82F349EE62D.com_sample_model_Message_Metadata_INSTANCE,
                                                                                        "message");
        org.drools.model.Rule rule = D.rule("com.sample.dtables",
                                            "HelloWorld_11").build(D.pattern(var_m).expr("C82C7395726E0A34834F642847228053",
                                                                                         com.sample.dtables.LambdaPredicateEECFF64A29437E27B03B7A00EC110523.INSTANCE,
                                                                                         D.reactOn("status")),
                                                                   D.on(var_m).execute(com.sample.dtables.LambdaConsequenceA32B9A06913EE3EBEC388C0DCB6D3503.INSTANCE));
        return rule;
    }

    /**
     * Rule name: HelloWorld_12
     */
    public static org.drools.model.Rule rule_HelloWorld__12() {
        final org.drools.model.Variable<com.sample.model.Message> var_m = D.declarationOf(com.sample.model.Message.class,
                                                                                          DomainClassesMetadataB1795019E0BB21C81CEDB82F349EE62D.com_sample_model_Message_Metadata_INSTANCE,
                                                                                          "m");
        org.drools.model.Rule rule = D.rule("com.sample.dtables",
                                            "HelloWorld_12").build(D.pattern(var_m).expr("D43404F200116FD585567A96803202F0",
                                                                                         com.sample.dtables.LambdaPredicateD2F87F51596ADCD4259AB5362B13C8D5.INSTANCE,
                                                                                         D.reactOn("status")),
                                                                   D.on(var_m).execute(com.sample.dtables.LambdaConsequenceFCB10C0939E16EFF940D75562BDD89BB.INSTANCE));
        return rule;
    }
}
