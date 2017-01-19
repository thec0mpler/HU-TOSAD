import generator.Manager;
import generator.oracle.OracleManager;
import model.BusinessRule;
import model.BusinessRules.AttributeRange;

import java.util.ArrayList;
import java.util.List;

public class GeneratorTest {
    public static void main(String[] args) throws Exception {
        Manager manager = new OracleManager();

        List<BusinessRule> businessRuleList = new ArrayList<>();
        businessRuleList.add(new AttributeRange("products", "constraint_name", "price", false, 12, 15));

        System.out.println(
                manager.generate(businessRuleList)
        );
    }
}
