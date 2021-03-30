package Szemelyek;

public class Alkalmazott extends Szemely{

    Alkalmazott(int eletkor, int iq, String neme) {
        super(eletkor, iq, neme);


    }
    int id;
    int tapasztalatiTudas;

    String beosztas;
    String vegzettseg;

    boolean joMunkaero;
    boolean angol;
    boolean nemet;

    void irdKi() {
        System.out.println("Ezen is látszódjon, hogy jó");
        super.irdKi();
    }
}
