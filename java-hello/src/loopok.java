
public class loopok {
    public static void main(String[] args) {

        //Összegés tétel

        int[] pontok = {2, 3, 5, 1, 1, 2, 3, 1, 1, 2, 4, 1, 3, 3, 2, 6, 3, 2};
        int osszes = 0;

        for (int i = 0; i < pontok.length; i++) {
            osszes += pontok[i];
        }

        System.out.println("Összpontszám: " + osszes);

        // Megszámlálás tétel

        int[] kor = {23, 13, 15, 19, 18, 20, 22, 12, 10, 24, 16, 19, 18, 22, 14};
        int db = 0;

        for(int i=0; i< kor.length; i++) {
            if(kor[i] < 18) {
                db++;
            }
        }
        System.out.println("18 év alatti: fő" + db);

        //Eldöntés tétel

        /*
        String [] szinek = {"piros", "narancs", "cián", "fekete", "kék", "vanilia", "eper"};
        int i = 0;

        while (i<szinek.length && !szinek[i].equals("kék")) {
            i += 1;
        }
        System.out.printf("%s",(i<szinek.length ? "van kék szinünk : nincs kék szinünk"));
        */

        // kiválasztás

        String[] nyelvek = {"Python", "JavaScript", "C#", "Ruby", "Java", "CSS", "SQL"};
        int n = 0;

        while (!nyelvek[n].equals("Java")) {
            n += 1;
        }
        System.out.println("A Java nyelv indexe " + n);

        String[] nevek = {"Liki Pisti", "Patta Nóra", "Pár Zoltán", "Techno Kolos", "Trab Antal", "Am Erika"};
        int nev = 0;
        while (nev<nevek.length && !nevek[nev].equals("Pár Zoltán")) {
            nev += 1;
        }
        System.out.printf("A név index: %d", (nev<nevek.length ? nev : -1));

        // Szétválogatás tétel

        int[] szamok = {9, 6, 22, 1, 17, 30, 13, 25, 22};
        int[] paros = new int[szamok.length];

        int index = 0;

        for (int i=0; i<szamok.length; i++) {
            if(szamok[i] % 2 ==0) {
                paros[index] = szamok[i];
                index += 1;
            }
        }
        //System.out.println("A páros szmok: " + szamok.length);


        // Metszet

        String[] borA = {"Gyümölcsbor", "Almabor", "Ribiszkebor", "Szamócabor"};
        String[] borB = {"Gyümölcsbor", "Egresbor", "Szamócabor", "Szederbor", "Ribiszkebor"};
        String[] jobor = new String[Math.min(borA.length, borB.length)];

        int index2 = 0, j;

        for(int i =0; i<borA.length; i++) {
            j = 0;
            while (j< borB.length && !borA[i].equals(borB[j])) j+= 1;
            if(j < borA.length) {
                jobor[index2] = borA[i];
                index2 +=1;
            }
        }

        // Unio
        /*

        String[] nokiA = {"Nokia 1610", "Nokia 220s", "Nokia 3210", "Nokia 3660"};
        String[] nokiB = {"Nokia 3310", "Nokia 3510", "Nokia 3650", "Nokia 3210"};
        String[] unio = new String[nokiA.length+nokiB.length];

        for (int i =0; i< nokiA.length; i++) { unio[i] = nokiA[i];}
        int index3 = nokiA.length-1;

        for (int j =0; j< nokiB.length; j++)  {
            int i = 0;
            while (i<nokiA.length && !nokiB[j].equals(nokiA[i])) i+= 1;
            if(i>=nokiA.length) {
                unio[index3] = nokiB[j];
                index3 += 1;
            }
        }
        */

       // Maximum kiválasztás

        int[] cm = {163, 192, 174, 177, 165, 169, 205, 188};
        int max = 0;
        for (int i=1; i<cm.length; i++) {
            if(cm[i] > cm[max]) max = i;
        }
        System.out.println("A lehmagasabb ember  , indexe   cm" + cm[max] +  max);


        //Rendezés maximum kiválasztás

        int[] cm2 = {163, 192, 174, 177, 165, 169, 205, 188};
        int max2 = 0;

        for (int x =0; x<cm2.length; x++) {
            max2 = x;

            for (int y=x+1; y<cm2.length; y++) {
                if(cm2[y] > cm2[max2]) max2 =y;
            }
            int valami = cm2[x];
            cm2[x] = cm2[max2];
            cm2[max2] = valami;
        }

        // Buborékrendezés

        int[] cm3 = {163, 192, 174, 177, 165, 169, 205, 188};
        for (int v =cm3.length; v >0; v--) {
            for (int z=0; z< v-1; z++) {
                if(cm3[z] > cm3[z+1]) {
                    int temp = cm3[z];
                    cm3[z] = cm3[z+1];
                    cm3[z+1] = temp;
                }
            }
        }

            // 6._programozási_tételek

            // ettől lefele a 7-es dia



    }
}
