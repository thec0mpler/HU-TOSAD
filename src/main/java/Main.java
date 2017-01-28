import org.hu.brg.model.BusinessRule;
import org.hu.brg.model.business_rule.AttributeCompare;
import org.hu.brg.model.business_rule.AttributeList;
import org.hu.brg.model.business_rule.AttributeRange;

public class Main {
    public static void main(String[] args) {
        BusinessRule rule2 = new AttributeCompare(2, "Prijs verglijking", "Test", "constr_test", "prijs", ">", 15.5);
        BusinessRule rule3 = new AttributeList(3, "Prijs verglijking","Test", "constr_test", "prijs", false, new String[] {"test1", "test2", "test2"});
        BusinessRule rule1 = new AttributeRange(1, "Prijs vergelijking","Test", "constr_test", "prijs", false, 12, 15);

        System.out.println(rule1.getId() + " " + rule1.getCode() + " " + rule1.getRuleName());
        System.out.println(rule1.getSQL());
        System.out.println();
        System.out.println(rule2.getId() + " " + rule2.getCode() + " " + rule2.getRuleName());
        System.out.println(rule2.getSQL());
        System.out.println();
        System.out.println(rule3.getId() + " " + rule3.getCode() + " " + rule3.getRuleName());
        System.out.println(rule3.getSQL());
    }
}
