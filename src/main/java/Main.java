import org.hu.brg.model.BusinessRule;
import org.hu.brg.model.business_rule.*;

public class Main {
    public static void main(String[] args) {
        BusinessRule rule2 = new AttributeCompare(2, "Prijs verglijking", "Test", "constr_test", "prijs", ">", 15.5);
        BusinessRule rule3 = new AttributeList(3, "Prijs verglijking","Test", "constr_test", "prijs", false, new String[] {"test1", "test2", "test2"});
        BusinessRule rule1 = new AttributeRange(1, "Prijs vergelijking","Test", "constr_test", "prijs", false, 12, 15);
        BusinessRule rule4 = new AttributeOther(4, "Check postcode dat begint met 4 cijfers", "Gegevens", "checkPostcode", "postcode",
                1, 4, true, "1", "9");
        BusinessRule rule5 = new TupleCompare(5, "Check prijs", "Producten", "constr_test", "prijs", ">", "andere_attribuut");


        System.out.println(rule1.getId() + " " + rule1.getCode() + " " + rule1.getRuleName());
        System.out.println(rule1.getSQL());
        System.out.println();
        System.out.println(rule2.getId() + " " + rule2.getCode() + " " + rule2.getRuleName());
        System.out.println(rule2.getSQL());
        System.out.println();
        System.out.println(rule3.getId() + " " + rule3.getCode() + " " + rule3.getRuleName());
        System.out.println(rule3.getSQL());
        System.out.println();
        System.out.println(rule4.getId() + " " + rule4.getCode() + " " + rule4.getRuleName());
        System.out.println(rule4.getSQL());
        System.out.println();
        System.out.println(rule5.getId() + " " + rule5.getCode() + " " + rule5.getRuleName());
        System.out.println(rule5.getSQL());
    }
}
