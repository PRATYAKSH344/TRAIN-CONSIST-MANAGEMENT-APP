import java.util.*;

// Goods Bogie class
class GoodsBogie {
    private String type;   // Cylindrical / Box
    private String cargo;  // Petroleum / Coal / etc.

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return type + " Bogie carrying " + cargo;
    }
}

public class UC12_SafetyCheck {
    public static void main(String[] args) {

        // Step 1: Create list of goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Box", "Coal"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));

        // Step 2: Apply safety rules using allMatch
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        // Rule: If Cylindrical → only Petroleum allowed
                        !(b.getType().equalsIgnoreCase("Cylindrical")
                                && !b.getCargo().equalsIgnoreCase("Petroleum"))
                );

        // Step 3: Display result
        if (isSafe) {
            System.out.println("Train is SAFETY COMPLIANT ✅");
        } else {
            System.out.println("Train is NOT SAFE ❌");
        }
    }
}