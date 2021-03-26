public class tombok_arrays {
    public static void main(String[] args) {


        int[] tomb1 = new int[10];
        int[] tomb2 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        tomb2[0] = 20;

        for(int i=0; i<tomb1.length; i++) {
            System.out.print(tomb1[i] + " ");
        }
        System.out.println();

        for(int i=0; i<tomb2.length; i++) {
            System.out.print(tomb2[i] + " ");
        }

        System.out.println();

        String[] nevek = new String[] {"Bözsi", "Juci", "Évi", "Virág", "Dóri"};

        nevek[4] = "Anikó";

        for (int i=0; i<nevek.length; i++) {
            System.out.println(nevek[i]+ " ");
        }
    }
}


