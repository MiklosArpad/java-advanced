

public class while_dowhile_loop {

    public static void main(String[] args) {

        boolean futas = true;
        int szamlalo = 0;

        while (futas) {
            System.out.println("Infinity");
            if (szamlalo == 6)
                futas = false;
            szamlalo++;
        }

        boolean futas2 = true;
        int szamlalo2 = 0;

        do{
            System.out.println("hamburger");
            if(szamlalo2 == 12)
                break;
            szamlalo2++;
        }
        while (futas2);

    }
}