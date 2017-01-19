package model.business_rule;

import model.BusinessRule;
import model.Operator;

public class AttributeRange extends BusinessRule {
    private int minValue;
    private int maxValue;
    private Operator operator;

    public AttributeRange() {
        super();
    }

    public int getMinValue() {
        return minValue;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}
