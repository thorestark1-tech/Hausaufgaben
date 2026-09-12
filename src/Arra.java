import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.out;

public class Arra {
    Scanner sc = new Scanner(System.in);
    void main() {
        wuerfel();
        A1();
        
        int[] a = {1, -2, 5, -7, -3, 8};
        out.println("Negative Zahlen: " + A2(a));
        out.println(Arrays.toString(negative(A2(a),a)));
        A3();
        A4();
    }

    void A1() {
        int[] b = new int[5];
        int[] a = {1, 2, 3, 4, 5, 6};

        out.println("Array a:");
        out.println(Arrays.toString(a));

        out.println("Array b:");
        out.println(Arrays.toString(b));
        b = a;

        out.println("Nach b = a:");

        out.println("Array a:");
        ausgenen(a);

        out.println("Array b:");
        ausgenen(b);
    }

    int A2(int[] a) {
        int anzahl = 0;

        for (int j : a) {

            if (j < 0) {
                anzahl++;
            }
        }

        return anzahl;
    }
    int []negative(int anzahl, int []a){
        int[] neg= new int[anzahl];
        int stufe=0;
        for(int j:a){
            if (j<0) {
                neg[stufe]=j;
                stufe++;
            }
        }
        return neg;
    }

    void A3() {

        int[] zahlen = new int[10];
        
        for (int i = 0; i < zahlen.length; i++) {
            zahlen[i] = (int) (Math.random() * 21) - 10;
        }

        out.println("Array:");
        out.println(Arrays.toString(zahlen));

        out.print("Welche Zahl soll gesucht werden? ");
        int gesucht = sc.nextInt();
        boolean gefunden = false;

        for (int i = 0; i < zahlen.length; i++) {

            if (zahlen[i] == gesucht) {
                out.println("Zahl gefunden an Position: " + i);
                gefunden = true;
            }
        }

        if (!gefunden) {
            out.println("Zahl nicht gefunden.");
        }
        int kleinste = zahlen[0];

        for (int i = 1; i < zahlen.length; i++) {

            if (zahlen[i] < kleinste) {
                kleinste = zahlen[i];
            }
        }

        out.println("Kleinste Zahl: " + kleinste);
    }

    void A4() {

        out.print("Wie viele Werte möchtest du eingeben? ");
        int anzahl = sc.nextInt();

        float summe = 0;
        float kleinste = 0;
        float groesste = 0;

        for (int i = 0; i < anzahl; i++) {

            out.print("Wert " + (i + 1) + ": ");
            float wert = sc.nextFloat();

            summe += wert;

            if (i == 0) {
                kleinste = wert;
                groesste = wert;
            } else {

                if (wert < kleinste) {
                    kleinste = wert;
                }

                if (wert > groesste) {
                    groesste = wert;
                }
            }
        }

        float A4 = summe / anzahl;

        out.println("Milltelwert: " + A4);
        out.println("Kleinster Wert: " + kleinste);
        out.println("Größter Wert: " + groesste);
    }
    void ausgenen(int[] a) {
        for (int i = 0; i < a.length; i++) {
            out.print(a[i] + " ");
        }
        out.println();
    }
    void wuerfel(){
        out.println("Wie viele wuerfel sollen geworfen werden?");
        int a =100;
        a= sc.nextInt();
        int[] w=new int[a];
        for (int j = 0; j < w.length; j++) w[j] = (int)(Math.random() * 6) + 1;

        for (int i = 1; i <= 6; i++) {
            out.println(i + ": " + anzahlZahl(i, w)*100.00/a+"%");
            out.println(i + ": " + anzahlZahl(i, w));
        }
    }
    int anzahlZahl(int a,int[]b){
        int anzahl=0;
        for (int j : b) {
            if (j == a) {
                anzahl++;
            }
        }
        return anzahl;
    }
}