package org.hu.brg.model.business_rule;

import org.hu.brg.model.BusinessRule;

/**
 * Created by farshid on 1/30/17. ja man
 */
public class InterEntityCompare extends BusinessRule{
    private String constraint;
    private String table;
    private String attribute;   // OR column
    private ...... checkColumn; // ??
    private ...... checkTable;  // ??
    private String operator;
    private double value;       // Optional

    public InterEntityCompare(int id, String ruleName,
                              String table, String constraint, String attribute,
                              String operator, double valu) {
        super(id, ruleName, table);
        this.code = "ICMP";         // moet hier this??

        this.constraint = constraint;
        this.table = table;
        this.attribute = attribute;
        this.checkColumn = checkColumn;
        this.checkTAble = checkTable;
        this.operator = operator;
        this.value = value;
    }

    public String getConstraint(){
            return constraint;
    }

    public void setConstraint(String constraint){
            this.constraint = constraint;
    }

    @Override
    public String getTable() {
        return table;
    }

    @Override
    public void setTable(String table) {
        this.table = table;
    }

    @Override
    public String getAttribute() {
        return attribute;
    }

    @Override
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
}
