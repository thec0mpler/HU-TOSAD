package org.hu.brg.model.business_rule;

import org.hu.brg.model.BusinessRule;

/**
 * Created by farshid
 */
public class InterEntityCompare extends BusinessRule{
    private String triggerName;
    private String table;
    private String firstColumn;
    private String firstRelation;
    private String operator;
    private String secondTable;
    private String secondColumn;
    private String secondRelation;

    public InterEntityCompare(int id, String ruleName, String table, String triggerName,
                              String table1, String firstColumn, String firstRelation,
                              String operator, String secondTable, String secondColumn, String secondRelation) {
        super(id, ruleName, table);
        this.code = "ICMP";
        this.triggerName = triggerName;
        this.table = table1;
        this.firstColumn = firstColumn;
        this.firstRelation = firstRelation;
        this.operator = operator;
        this.secondTable = secondTable;
        this.secondColumn = secondColumn;
        this.secondRelation = secondRelation;
    }

    public String getTriggerName() {
        return triggerName;
    }

    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    @Override
    public String getTable() {
        return table;
    }

    @Override
    public void setTable(String table) {
        this.table = table;
    }

    public String getFirstColumn() {
        return firstColumn;
    }

    public void setFirstColumn(String firstColumn) {
        this.firstColumn = firstColumn;
    }

    public String getFirstRelation() {
        return firstRelation;
    }

    public void setFirstRelation(String firstRelation) {
        this.firstRelation = firstRelation;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getSecondTable() {
        return secondTable;
    }

    public void setSecondTable(String secondTable) {
        this.secondTable = secondTable;
    }

    public String getSecondColumn() {
        return secondColumn;
    }

    public void setSecondColumn(String secondColumn) {
        this.secondColumn = secondColumn;
    }

    public String getSecondRelation() {
        return secondRelation;
    }

    public void setSecondRelation(String secondRelation) {
        this.secondRelation = secondRelation;
    }
}
