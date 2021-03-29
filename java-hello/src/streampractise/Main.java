package streampractise;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        var women = List.of(
                new Woman("Csenge", 21, 56),
                new Woman("Viktória", 32, 75),
                new Woman("Kinga", 45, 89),
                new Woman("Lizett", 22, 67),
                new Woman("Krisztina", 34, 140),
                new Woman("Kata", 22, 67),
                new Woman("Lujza", 48, 140),
                new Woman("Lizett", 42, 54),
                new Woman("Léna", 74, 30)
        );

        // 1) Osszegzés tétel
        var sumAge = women.stream()
                .mapToInt(Woman::getAge)
                .sum();

        var sumWeight = women.stream()
                .mapToDouble(Woman::getWeight)
                .sum();

        System.out.println(sumAge);
        System.out.println(sumWeight);

        // 2) Átlagolás tétel
        var avgAge = women.stream()
                .mapToInt(Woman::getAge)
                .average();

        var avgWeight = women.stream()
                .mapToDouble(Woman::getWeight)
                .average();

        System.out.println(avgAge.isPresent() ? avgAge.getAsDouble() : "Üres");
        System.out.println(avgWeight.isPresent() ? avgWeight.getAsDouble() : "Üres");

        // 3) Min, Max
        var maxWeight = women.stream()
                .mapToDouble(Woman::getWeight)
                .max();

        /*if (maxWeight.isPresent()) {
            System.out.println(maxWeight.getAsInt());
        } else {
            System.out.println("Üres");
        }*/

        System.out.println(maxWeight.isPresent() ? maxWeight.getAsDouble() : "Üres");

        // 4) Megszámlálás tétel

        var girlsCountOverThirty = women.stream()
                .filter(w -> w.getAge() > 30)
                .count();

        // TODO: Hány 4ö kg feletti nő van a listában ?

        var girlsCountOverForty = women.stream()
                .filter(w -> w.getAge() > 40)
                .count();

        // 5) Kiválogatás tétel

        // Osszes L betűvel kezdődő nő, aki 40nél idősebb, 50 kgnál nehezebb
        var x = women.stream()
                .filter(w -> w.getName().startsWith("L"))
                .filter(w -> w.getAge() > 40)
                .filter(w -> w.getWeight() > 50)
                .collect(Collectors.toList());  // ezzel alakítjul vissza listává

        x.forEach(System.out::println);
        //x.forEach(element -> System.out.println(element));

        // Egyéb Stream metódusokat nézzünk

        Optional<Woman> optObj = Optional.of(new Woman("Lizett", 12, 123));
        Optional<Woman> optW = Optional.ofNullable(null);

        System.out.println(optW.isPresent() ? optW.get() : "Üres nő");

    }

    private static boolean isOverThirty(Woman woman) {
        return woman.getAge() > 30;
    }
}

