package Szemelyek;

public class Szemely {

    //private int eletkor;  // Acces Conrol Modifier - Hozzáférési kontroll módosítók
    int eletkor;
    int magassag;
    int testsuly;
    // protected int testsuly;  // Acces Conrol Modifier - Hozzáférési kontroll módosítók
    int iq;

    String neme;
    String hajszin;
    String szemszin;

    boolean hazas;

    Szemely(int eletkor, int iq, String neme) {
        this.eletkor = eletkor;
        this.iq = iq;
        this.neme = neme;

        //System.out.println("Ez az üzenet a Személy konstruktorból!!");

    }
    void irdKi() {
        System.out.println("Valami, csak, hogy lássuk, jól műkszik");
    }
}
