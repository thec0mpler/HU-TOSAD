package org.hu.brg.model.business_rule;

import org.hu.brg.model.BusinessRule;

/**
 * Created by lap on 28-1-2017.
 */
public class AttributeOther extends BusinessRule {

    public AttributeOther(int id, String ruleName, String table) {
        super(id, ruleName, table);
    }

    @Override
    public String getSQL() {
        return null;
    }
}
