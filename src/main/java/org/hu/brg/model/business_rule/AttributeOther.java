package org.hu.brg.model.business_rule;

import org.hu.brg.model.BusinessRule;

/**
 * Created by lap on 28-1-2017.
 */
public class AttributeOther extends BusinessRule {
    private String constraint;
    private boolean negation;
    private String attribute;
    private int beginPosition;
    private int endPosition;
    private String firstValue;
    private String secondValue;

    public AttributeOther(int id, String ruleName, String table, String constraint, String attribute, int beginPosition, int endPosition, boolean negation, String firstValue, String secondValue) {
        super(id, ruleName, table);
        code = "AOTH";
        this.constraint = constraint;
        this.negation = negation;
        this.attribute = attribute;
        this.beginPosition = beginPosition;
        this.endPosition = endPosition;
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public String getConstraint() {
        return constraint;
    }

    public void setConstraint(String constraint) {
        this.constraint = constraint;
    }

    public boolean isNegation() {
        return negation;
    }

    public void setNegation(boolean negation) {
        this.negation = negation;
    }

    @Override
    public String getAttribute() {
        return attribute;
    }

    @Override
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public int getBeginPosition() {
        return beginPosition;
    }

    public void setBeginPosition(int beginPosition) {
        this.beginPosition = beginPosition;
    }

    public int getEndPosition() {
        return endPosition;
    }

    public void setEndPosition(int endPosition) {
        this.endPosition = endPosition;
    }

    public String getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(String firstValue) {
        this.firstValue = firstValue;
    }

    public String getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(String secondValue) {
        this.secondValue = secondValue;
    }

    @Override
    public String getSQL() {
        String result = "";
        if (!negation) {
            result = "NOT ";
        } else {
            result = "";
        }

        String sql = "ALTER TABLE " + super.getTable() + "\n" +
                "ADD CONSTRAINT " + constraint + "\n" +
                "CHECK (SUBSTR(" + attribute + ", " +
                beginPosition + ", " + endPosition + ") " + result + "BETWEEN ('"
                + firstValue + "' AND '" + secondValue + "');";
        return sql;
    }
}
