import java.util.Scanner;

public class quiz_progi {
    public static void main(String[] args) {
        System.out.println("Találd ki melyik gyümölcsre gondoltam");
        System.out.println("körte, banán, narancs, alama, szeder, eper, málna");

        String kulcsszo = "alma";
        boolean futas = true;
        int talalat = 0;
        int pontszam = 0;

        Scanner bemenet = new Scanner(System.in);

        while (futas) {
            String text = bemenet.nextLine();

            switch (text) {
                case "körte":
                    System.out.println("nem a körtére gondoltam");
                    break;
                case  "banán":
                    System.out.println("nem a banánra gondoltam");
                    break;
                case  "narancs":
                    System.out.println("nem a narancsra gondoltam");
                    break;
                case  "alma":
                    System.out.println("nem a almára gondoltam");
                    break;
                case  "szeder":
                    System.out.println("nem a szederre gondoltam");
                    break;
                case  "eper":
                    System.out.println("nem a eperre gondoltam");
                    break;
                case  "málna":
                    System.out.println("igen, a málnára gondoltam");
                    pontszam++;
                    futas = false;
                    break;
                default:
                    System.out.println("ez nincs benne a listába");
            }
            talalat++;
            if(talalat ==2) {
                System.out.println("csak kettő lehet telálgatni, sajnálom a pontszámod: zéró");
                futas = false;

            }
        }
        System.out.println("------------------------------------------");

        futas = true;

        System.out.println("Találd ki, melyik tudósra gondolok!");
        System.out.println("neumann, wigner, szilárd, teller");

        kulcsszo = "teller";
        futas = true;
        talalat = 0;

        while (futas) {
            String text = bemenet.nextLine();

            switch (text) {
                case "neumann":
                    System.out.println("nem a Neumannra gondoltam");
                    break;
                case "wigner":
                    System.out.println("nem a wignerre gondoltam");
                    break;
                case "szilárd":
                    System.out.println("nem a Szilárdra gondoltam");
                    break;
                case "teller":
                    System.out.println("Igen, Teller Edére gondoltam");
                    pontszam++;
                    futas= false;
                    break;
                default:
                    System.out.println("ez nincs benne a listába");
            }
            talalat++;
            if(talalat == 2) {
                System.out.println("csak kettő lehet telálgatni, sajnálom a pontszmámod: zéró");
                futas = false;
            }

        }
        System.out.println("a pontszámod: " + pontszam);
        System.out.println("Játszol még egyet??");
    }
}
