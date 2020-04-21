package com.sample.dtables;

import static com.sample.dtables.RulesB1795019E0BB21C81CEDB82F349EE62D.*;
import com.sample.model.Message;
import com.sample.dtables.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicateD2F87F51596ADCD4259AB5362B13C8D5 implements org.drools.model.functions.Predicate1<com.sample.model.Message> {

    INSTANCE;

    public static final String EXPRESSION_HASH = "5B2A7F681471F99FEF5570F33EA04E89";

    @Override()
    public boolean test(com.sample.model.Message _this) {
        return org.drools.modelcompiler.util.EvaluationUtil.areNumbersNullSafeEquals(_this.getStatus(), Message.GOODBYE);
    }
}
