package model;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private String name;
    private List<BusinessRuleType> businessRoleTypes = new ArrayList<>();

    public Category() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BusinessRuleType> getBusinessRoleTypes() {
        return businessRoleTypes;
    }

    public void setBusinessRoleTypes(List<BusinessRuleType> businessRoleTypes) {
        this.businessRoleTypes = businessRoleTypes;
    }
}