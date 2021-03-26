import java.util.ArrayList;
import java.util.List;

public class dinamikus_tombok {
    public static void main(String[] args) {



        String[] nevek1 = new String[] {"Bözsi", "Juci", "Évi", "Virág", "Dóri"};   // ezekhez nem adható + elem
        List<String> nevek2 = new ArrayList<String>();                              // ezzel a list sorral lehet alkalmazni
        List<Integer> szam1 = new ArrayList<Integer>();
        List<Float> szam2 = new ArrayList<Float>();
        List<Double> szam3 = new ArrayList<Double>();

        nevek1[4] = "Anikó";

        for (int i=0; i<nevek1.length; i++) {
            nevek2.add(nevek1[i] + " ");

        }
        for (int i=0; i<nevek2.size(); i++) {
            System.out.print(nevek2.get(i) + " ");
        }
        System.out.println();
        nevek2.add("Kati");

        for(int i=0; i<nevek2.size(); i++) {
            System.out.print(nevek2.get(i) + " ");
        }
    }
}
