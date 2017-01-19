import model.BusinessRule;
import model.BusinessRules.AttributeRange;

public class Main {
    public static void main(String[] args) {
        BusinessRule rule1 = new AttributeRange("Test", "constr_test", "prijs", false, 12, 15);

        System.out.println(rule1);
    }
}
