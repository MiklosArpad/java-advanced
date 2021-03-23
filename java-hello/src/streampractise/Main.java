package streampractise;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        var women = List.of(
                new Woman("Csenge", 21, 56),
                new Woman("Viktória", 32, 75),
                new Woman("Kinga", 45, 89),
                new Woman("Lizett", 22, 67)
        );

        // 1) Osszegzés tétel
        var sumAge = women.stream()
                .mapToInt(Woman::getAge)
                .sum();
    }
}

