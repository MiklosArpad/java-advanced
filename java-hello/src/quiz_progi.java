import java.util.Scanner;

public class quiz_progi {
    public static void main(String[] args) {
        System.out.println("Találd ki melyik gyümölcsre gondoltam");
        System.out.println("körte, banán, narancs, alama, szeder, eper, málna");

        String kulcsszo = "alma";
        boolean futas = true;

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
                    futas = false;
                    break;
                default:
                    System.out.println("ez nincs benne a listába");
            }
        }
        System.out.println("ELTALÁLTAD!! Játszol még egyet??");
    }
}
