package org.hu.brg.model.business_rule;

import org.hu.brg.model.BusinessRule;

/**
 * Created by lap on 28-1-2017.
 */
public class TupleCompare extends BusinessRule {
    private String table;
    private String constraint;
    private String firstAttribute;
    private String operator;
    private String secondAttribute;

    public TupleCompare(int id, String ruleName, String table, String constraint,
                        String firstAttribute, String operator, String secondAttribute) {
        super(id, ruleName, table);
        code = "TCMP";
        this.table = table;
        this.constraint = constraint;
        this.firstAttribute = firstAttribute;
        this.operator = operator;
        this.secondAttribute = secondAttribute;
    }

    public String getFirstAttribute() {
        return firstAttribute;
    }

    public void setFirstAttribute(String firstAttribute) {
        this.firstAttribute = firstAttribute;
    }

    public String getSecondAttribute() {
        return secondAttribute;
    }

    public void setSecondAttribute(String secondAttribute) {
        this.secondAttribute = secondAttribute;
    }

    @Override
    public String getTable() {
        return table;
    }

    @Override
    public void setTable(String table) {
        this.table = table;
    }

    public String getConstraint() {
        return constraint;
    }

    public void setConstraint(String constraint) {
        this.constraint = constraint;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public String getSQL() {
        String[] comparisonOperators = {"!=", "=", "^=", "<>", ">", ">=", "<="};

        String result = "";
        for (String op : comparisonOperators) {
            if (op.equals(operator)) {
                result = operator;
            }
        }

        String sql = "ALTER TABLE " + table + "\n" +
                "ADD CONSTRAINT " + constraint + "\n" +
                "CHECK (" + firstAttribute + " " + operator + " " + secondAttribute + ");";

        if (result.equals("")) {
            return "Failed SQL generation.";
        } else {
            return sql;
        }
    }
}
