import java.util.*;
import java.util.stream.Collectors;

// Bogie class
class Bogie {
    private String name;
    private int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}

public class UC13_PerformanceComparison {
    public static void main(String[] args) {

        // Step 1: Create test data
        List<Bogie> bogies = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            bogies.add(new Bogie("Bogie" + i, (i % 100) + 1));
        }

        // ---------------- LOOP BASED ----------------
        long startLoop = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.getCapacity() > 50) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // ---------------- STREAM BASED ----------------
        long startStream = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.getCapacity() > 50)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // Step 4: Display results
        System.out.println("Loop Time (ns): " + loopTime);
        System.out.println("Stream Time (ns): " + streamTime);
    }
}