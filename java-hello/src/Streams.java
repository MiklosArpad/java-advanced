import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Function;

public class Streams {

    public static void main(String[] args) {
        int[] pontok = {1, 2};

        // Imperatív: leprogramozod hogy valamit szeretnél és azt is hogy hogyan  (HOW)
        int osszes = 0;

        for (int i = 0; i < pontok.length; i++) {
            osszes += pontok[i];
        }

        System.out.println("Összpontszám: " + osszes);

        // Deklarítiv: leprogramozod, hogy mit szeretnel  kapni, de az implementációs vagy a hogyan nem érdekel(WHAT)
        // var sumResult = Arrays.stream(pontok).sum();

        var avgResult = Arrays.stream(pontok).average();

        System.out.println(avgResult.isPresent() ? "Átlég: " + avgResult.getAsDouble() : "Üres a tomb");


    }
}
