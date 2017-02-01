import org.hu.brg.generator.oracle.InterEntityCompareGenerator;
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

        BusinessRule rule6 = new InterEntityCompare(6, "Prijs", "table1", "t_naam", "table1", "prijs", "id", ">=", "table2", "prijs_max", "id_2");
        InterEntityCompareGenerator iecg = new InterEntityCompareGenerator();
        System.out.println(iecg.getOutput(rule6));
    }
}
