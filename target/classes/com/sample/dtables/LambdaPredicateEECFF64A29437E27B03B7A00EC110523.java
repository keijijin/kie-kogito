package com.sample.dtables;

import static com.sample.dtables.RulesB1795019E0BB21C81CEDB82F349EE62D.*;
import com.sample.model.Message;
import com.sample.dtables.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicateEECFF64A29437E27B03B7A00EC110523 implements org.drools.model.functions.Predicate1<com.sample.model.Message> {

    INSTANCE;

    public static final String EXPRESSION_HASH = "192FC7359B3D274FEABF29F1EC450B59";

    @Override()
    public boolean test(com.sample.model.Message _this) {
        return org.drools.modelcompiler.util.EvaluationUtil.areNumbersNullSafeEquals(_this.getStatus(), Message.HELLO);
    }
}
