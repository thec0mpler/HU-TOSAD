import org.hu.brg.generator.Manager;
import org.hu.brg.generator.oracle.OracleManager;
import org.hu.brg.model.BusinessRule;
import org.hu.brg.model.business_rule.AttributeRange;

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
