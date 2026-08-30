import java.util.Scanner;

public class Schleifen {
    static final String RED = "\u001B[31m"; //globale variabele ANSI code um IO rot zu machen (hab ich von c++)
    static final String DEFAULT = "\u001B[0m";//ANSI/ASCII um den text wieder auf default farbe zu machen

    void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("Willst du die erste Aufgabe ueberspringen? (y)");
        char ueberspringen = sc.next().toLowerCase().charAt(0);
        char again = 'y';
        while (ueberspringen != 'y' && again == 'y') {
            Aufgabe1(sc);
            IO.println("Again? (y/n)");
            again = sc.next().toLowerCase().charAt(0);
        }
        again = 'y';
        IO.println("Willst du die zweite Aufgabe ueberspringen? (y)");
        ueberspringen = sc.next().toLowerCase().charAt(0);
        while (ueberspringen != 'y' && again == 'y') {
            Aufgabe2(sc);
            IO.println("Again? (y/n)");
            again = sc.next().toLowerCase().charAt(0);
        }
        again = 'y';
        IO.println("Willst du die dritte Aufgabe ueberspringen? (y)");
        ueberspringen = sc.next().toLowerCase().charAt(0);
        while (ueberspringen != 'y' && again == 'y') {
            Aufgabe3(sc);
            IO.println("Again? (y/n)");
            again = sc.next().toLowerCase().charAt(0);
        }
        AufgabeZ mf = new AufgabeZ(); //aufrufen von public voif klasse

        again = 'y';
        IO.println("Willst du die Zusatzaufgabe a (Division) ueberspringen? (y)");
        ueberspringen = sc.next().toLowerCase().charAt(0);
        while (ueberspringen != 'y' && again == 'y') {
            mf.Aufgabea(sc);
            IO.println("Again? (y/n)");
            again = sc.next().toLowerCase().charAt(0);
        }
        again = 'y';
        IO.println("Willst du die Zusatzaufgabe c (Ziffermn) ueberspringen? (y)");
        ueberspringen = sc.next().toLowerCase().charAt(0);
        while (ueberspringen != 'y' && again == 'y') {
            mf.Aufgabec(sc);
            IO.println("Again? (y/n)");
            again = sc.next().toLowerCase().charAt(0);
        }
        again = 'y';
        IO.println("Willst du die Zusatzaufgabe f (fakultaet) ueberspringen? (y)");
        ueberspringen = sc.next().toLowerCase().charAt(0);

        while (ueberspringen != 'y' && again == 'y') {
            mf.Aufgabef(sc); //funktion teil der klasse, kann man auch unterr die selbe klasse machen
            IO.println("Again? (y/n)");
            again = sc.next().toLowerCase().charAt(0);
        }
    }

    void Aufgabe1(Scanner sc) {
        IO.println("Lies eine ganze positive Zahl ein.");
        int n = sc.nextInt();
        int erg = 0;
        String gerade;
        if (n % 2 == 0) gerade = "gerade";
        else gerade = "ungerade";

        for (int i = 1; i <= n; i++) {
            erg += i;
        }
        IO.println("Summe von i=0 zu " + n + " ist gleich " + erg);
        IO.println("Deine Zahl ist " + gerade);

    }

    void Aufgabe2(Scanner sc) {
        IO.println("Lies eine ganze positive Zahl ein.");
        int n = sc.nextInt();
        for (int i = 0; i < n - 1; i += 2) IO.println(i);
    }

    void Aufgabe3(Scanner sc) {
        IO.println("Lies zwei Zahlen ein.");
        int z1 = sc.nextInt(), z2 = sc.nextInt();
        int prod1 = z1;
        int erg = 0;
        if (z1 >= 0) for (; z1 > 0; z1--) erg += z2;
        IO.println(prod1 + " * " + z2 + " = " + erg);
    }


    public static class AufgabeZ {

        void Aufgabea(Scanner sc) {
            IO.println("Lies zwei ganze positive Zahlen ein.");
            int a = sc.nextInt(), b = sc.nextInt();
            int erg = a / b;
            IO.println(a + " passt " + RED + erg + DEFAULT + " in " + b + " rein."); //
            erg = a % b;
            IO.println("Der Rest ist " + erg);
        }
        void Aufgabec(Scanner sc){
            IO.println("Lies eine ganze Zahl ein.");
            int zahl = sc.nextInt();
            int anzahl=0;

            if(zahl<0) zahl=zahl *(-1);
            if (zahl==0) anzahl=1;
            else{
                while (zahl>0){
                    zahl /=10;
                    anzahl++;
                }
            }
            IO.println("Deine Zahl hat "+anzahl+" Ziffern.");
            char aufgabed;
            IO.println("Willsut du Zusatzaufgabe 2.5 (Quersumme) machen? (y/n)");
            aufgabed = sc.next().toLowerCase().charAt(0);
            if(aufgabed=='y') {
                int quersumme = Aufgabed(zahl);
                IO.println("Die Quersumme deiner Zahl beträgt " + quersumme);
            }
        }
        public int Aufgabed(int zahl){
            int summe=0;
            if(zahl<0) zahl=zahl *(-1);
            if (zahl==0) return summe;
            else{
                while (zahl>0){
                    summe=zahl%10;
                    zahl/=10;
                }
            }
            return summe;
        }
        public void Aufgabef(Scanner sc) {
            IO.println("Lies eine ganze positive Zahl ein.");
            int n = sc.nextInt(), erg = 1;
            for (int i = 1; n >= i; i++) erg *= i;
            IO.println(n + "! = " + erg);
        }

    }
}