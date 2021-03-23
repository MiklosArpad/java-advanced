package streampractise;

public class Woman {
    private String name;
    private int age;
    private double weight;

    public Woman(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name + " " + age + " éves és " + weight + " kg.";
    }
}
