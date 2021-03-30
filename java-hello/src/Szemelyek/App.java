package Szemelyek;

public class App {
    public static void main(String[] args) {

        Szemely Monika = new Szemely(25, 105, "nő");
        /*
        Monika.eletkor = 25;
        Monika.iq = 105;
        Monika.hazas = false;
         */

        Szemely Erika = new Szemely(30, 107, "nő");
        /*
        Erika.eletkor= 30;
        Erika.iq = 107;
        Erika.hazas = true;
         */

        System.out.println(Erika.hazas);
        System.out.println(Monika.hazas);


        Alkalmazott Aniko = new Alkalmazott(18, 112, "nő");
        Aniko.eletkor = 18;
        Aniko.hajszin = "barna";
        Aniko.angol = true;
        Aniko.beosztas = "fejleszto";


        Alkalmazott Istvan = new Alkalmazott(34, 109, "férfi");

        Monika.irdKi();
        Istvan.irdKi();






    }
}
