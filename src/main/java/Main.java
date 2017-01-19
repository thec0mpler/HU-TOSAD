<<<<<<< HEAD
import generator.Manager;
import generator.oracle.OracleManager;
import model.BusinessRule;
import model.business_rule.AttributeRange;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
=======
import model.BusinessRule;
import model.BusinessRules.AttributeRange;

public class Main {
    public static void main(String[] args) {
        BusinessRule rule1 = new AttributeRange("Test", "constr_test", "prijs", false, 12, 15);
>>>>>>> 3b48e2e1253a42b456bfc4c119bb107e80363a1f

        System.out.println(rule1);
    }
}
