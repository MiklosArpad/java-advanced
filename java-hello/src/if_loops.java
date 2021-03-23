public class if_loops {

    public static void main(String[] args) {

        // if kondíciók

        int eletkor = 48;
        if(eletkor < 0) {
            System.out.println("Ez így gáz, mert 0 éves sem vagy");
            System.out.println("De már úton vagy");
        }
        else if ( eletkor > 0 && eletkor < 5)
            System.out.println("Gyerek vagy még");
        else if (eletkor >= 5 && eletkor < 18)
            System.out.println("Még nem vagy felnött");
        else
            System.out.println("Felnőtté váltál, vannak már rendesen kötelleségeid");


        for (int i = 0; i < 7; i++)
            if(i < 5)
                System.out.println("Hello");
            else
                System.out.println("Viszlát");

        for (int i = 0; i < 7 ; i++) {
            System.out.println("külső" +i);
            for (int y = 0; y < 5; y++)
                System.out.println("belső" +y);
        }



    }
}
