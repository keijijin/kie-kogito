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
import org.drools.model.Model;

public class RulesB1795019E0BB21C81CEDB82F349EE62D implements Model {

    public final static DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern(DateUtils.getDateFormatMask(),
                                                                                            Locale.ENGLISH);

    @Override
    public String getName() {
        return "com.sample.dtables";
    }

    public static Date string_2_date(String s) {
        return GregorianCalendar.from(LocalDate.parse(s,
                                                      DATE_TIME_FORMATTER).atStartOfDay(ZoneId.systemDefault()))
                                .getTime();
    }

    @Override
    public List<org.drools.model.EntryPoint> getEntryPoints() {
        return Collections.emptyList();
    }

    @Override
    public List<org.drools.model.Global> getGlobals() {
        return globals;
    }

    @Override
    public List<org.drools.model.TypeMetaData> getTypeMetaDatas() {
        return typeMetaDatas;
    }

    List<org.drools.model.Global> globals = Collections.emptyList();

    List<org.drools.model.TypeMetaData> typeMetaDatas = Collections.emptyList();

    /**
     * With the following expression ID:
     * org.drools.modelcompiler.builder.generator.DRLIdGenerator@1eeb5d81
     */
    @Override
    public List<org.drools.model.Rule> getRules() {
        return rules;
    }

    public List<Rule> getRulesList() {
        return Arrays.asList(RulesB1795019E0BB21C81CEDB82F349EE62DRuleMethods0.rule_HelloWorld__11(),
                             RulesB1795019E0BB21C81CEDB82F349EE62DRuleMethods0.rule_HelloWorld__12());
    }

    List<org.drools.model.Rule> rules = getRulesList();

    @Override
    public List<org.drools.model.Query> getQueries() {
        return java.util.Collections.emptyList();
    }
}
