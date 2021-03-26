public class fuggvenyek_metodusok {

    static String[] nevek = {"Bözsi", "Juci", "Évi", "Virág", "Dóri"};
    static int[] szamok = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {

        int osszeg = plussz(5, 6);
        System.out.println(osszeg);
        System.out.println(hello("Aranka Drága"));

        for (int i=0; i<nevek.length; i++) {
            System.out.println(hello(nevek[i]));
        }

        for (int i=0; i<szamok.length; i++) {
            System.out.println(hatvny(szamok[i]));
        }
        irdAtATombot();
        for (int i=0; i<szamok.length; i++) {
            System.out.println(szamok[i]);
        }
    }
    public static int plussz(int a, int b) {
        return a+b;
    }
    public static String hello(String nev) {
        String koszones = "Hello " + nev;
        return koszones;
    }
    public static int hatvny(int x) {
        return  x * x;
    }
    public static void irdAtATombot() {
        for (int i=0; i<szamok.length; i++) {
            szamok[i] = szamok[i] +3;
        }
    }
}
