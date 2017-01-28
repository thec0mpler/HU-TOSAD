import org.hu.brg.model.BusinessRule;
import org.hu.brg.model.business_rule.AttributeCompare;
import org.hu.brg.model.business_rule.AttributeList;
import org.hu.brg.model.business_rule.AttributeRange;

public class Main {
    public static void main(String[] args) {
        BusinessRule rule1 = new AttributeRange("Test", "constr_test", "prijs", false, 12, 15);
        BusinessRule rule2 = new AttributeCompare("Test", "constr_test", "prijs", "LOL", 15.5);
        BusinessRule rule3 = new AttributeList("Test", "constr_test", "prijs", true, new String[] {"test1", "test2", "test2"});

        System.out.println(rule1.getSQL());
        System.out.println();
        System.out.println(rule2.getSQL());
        System.out.println();
        System.out.println(rule3.getSQL());
    }
}
