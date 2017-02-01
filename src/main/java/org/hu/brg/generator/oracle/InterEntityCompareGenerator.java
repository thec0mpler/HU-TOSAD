package org.hu.brg.generator.oracle;

import org.hu.brg.generator.DatabaseType;
import org.hu.brg.generator.Generator;
import org.hu.brg.model.BusinessRule;
import org.hu.brg.model.business_rule.AttributeRange;
import org.hu.brg.model.business_rule.InterEntityCompare;

/**
 * Created by lap on 1-2-2017.
 */
public class InterEntityCompareGenerator extends Generator {
    public InterEntityCompareGenerator() {
        super(DatabaseType.Oracle);
    }

    @Override
    public boolean canHandle(BusinessRule businessRule) {
        return businessRule instanceof InterEntityCompare;
    }

    @Override
    public String getOutput(BusinessRule businessRule) {
        InterEntityCompare rule = (InterEntityCompare) businessRule;

        String sql = "CREATE OR REPLACE TRIGGER " + rule.getTriggerName() +
                        "\nBEFORE INSERT OR UPDATE\n" +
                        "ON " + rule.getTable() +
                        "\nFOR EACH ROW\n" +
                        "DECLARE\n" +
                            "\tv_passed BOOLEAN;\n" +
                            "\tv_value1 NUMBER;\n" +
                            "\tv_value2 NUMBER;\n" +
                        "BEGIN\n" +
                            "\t v_value1 := :NEW." + rule.getFirstColumn() +
                            "\n\t v_value2 := SELECT " + rule.getSecondColumn() + " FROM " + rule.getSecondColumn() +
                            "\n\t\t WHERE " + rule.getFirstRelation() + " = :NEW." + rule.getSecondRelation() + ";" +

                            "\n\n\t SELECT " + rule.getSecondColumn() + " FROM " + rule.getSecondTable() +
                                "\n\t WHERE " + rule.getFirstRelation() + " :NEW." + rule.getSecondRelation() + ";" +

                            "\n\n\t v_passed := v_value1 " + rule.getOperator() + " v_value2;" +

                            "\n\n\t if v_passed is false then\n" +
                            "\t\t raise_application_error(-20000, 'SQL query is niet gegenereerd');" +
                        "\nEND;";
        return sql;
    }
}
