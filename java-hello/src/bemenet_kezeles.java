import java.util.Scanner;

public class bemenet_kezeles {

    public static void main(String[] args) {

        System.out.println("Hogy hínak?");
        Scanner bemenet = new Scanner(System.in);

        String nev = bemenet.nextLine();
        System.out.println("Szia "+nev);
        System.out.println("Hány éves vagy "+nev+"?");

        String ev = bemenet.nextLine();

        if(Integer.parseInt(ev) < 18)
            System.out.println("Ne igyál még alkoholt!");
        else
            System.out.println("Gyere koccintsunk!");
    }
}

//  https://www.youtube.com/watch?v=1XCeTrsVBj8&list=PLUnQJ5ZQoqQIfw1U4Tml10PlpcBS1KiGs&index=12