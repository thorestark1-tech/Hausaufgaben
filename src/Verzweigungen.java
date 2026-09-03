import java.util.Scanner;
public class Verzweigungen {
    void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("Willst du die erste Aufgabe ueberspringen? (y)");
        char ueberspringen = sc.next().toLowerCase().charAt(0);
        char again = 'y';
        Verzweigungen V=new Verzweigungen();
        
        while (ueberspringen != 'y' && again == 'y') {
            V.A1(sc);
            IO.println("Again? (y/n)");
            again = sc.next().toLowerCase().charAt(0);
        }
        again = 'y';
        IO.println("Willst du die zweite Aufgabe ueberspringen? (y)");
        ueberspringen = sc.next().toLowerCase().charAt(0);
        while (ueberspringen != 'y' && again == 'y') {
            V.A2(sc);
            IO.println("Again? (y/n)");
            again = sc.next().toLowerCase().charAt(0);
        }
        again = 'y';
        IO.println("Willst du die dritte Aufgabe ueberspringen? (y)");
        ueberspringen = sc.next().toLowerCase().charAt(0);
        while (ueberspringen != 'y' && again == 'y') {
            V.A3(sc);
            IO.println("Again? (y/n)");
            again = sc.next().toLowerCase().charAt(0);
        }
        again = 'y';
        IO.println("Willst du die vierte (zusatz d) Aufgabe ueberspringen? (y)");
        ueberspringen = sc.next().toLowerCase().charAt(0);
        while (ueberspringen != 'y' && again == 'y') {
            V.Zd(sc);
            IO.println("Again? (y/n)");
            again = sc.next().toLowerCase().charAt(0);
        }
    }

    void A1(Scanner sc) {
        IO.println("Lies eine Zahl ein: ");
        double zahl = sc.nextDouble();
        String gerade;
        if (zahl % 2 == 0) gerade = "gerade";
        else gerade = "ungerade";
        if (zahl < 0) IO.println("Die Zahl ist negativ.");
        else {
            if (zahl > 0) IO.println("Die Zahl ist positiv.");
            IO.println("Die Zahl ist gleich 0.");
        }
        IO.println("Deine Zahl ist " + gerade);
    }

    void A2(Scanner sc) {
        IO.println("Lies drei Zahlen ein");
        double z1 = sc.nextDouble(), z2 = sc.nextDouble(), z3 = sc.nextDouble();
        if (z1 == z2 && z2 == z3) IO.println("Alle deine Zahlen sind gleich.");
        else if (z1 == z2 || z2 == z3 || z3 == z1) IO.println("Zwei deiner Zahlen sind gleich.");
        else IO.println("Alle deiner Zahlen sind verschieden.");

        if (z1 >= z2 && z2 >= z3) { //ordnen
            System.out.println(z1 + " " + z2 + " " + z3);
        } else if (z1 >= z3 && z3 >= z2) {
            System.out.println(z1 + " " + z3 + " " + z2);
        } else if (z2 >= z1 && z1 >= z3) {
            System.out.println(z2 + " " + z1 + " " + z3);
        } else if (z2 >= z3) {
            System.out.println(z2 + " " + z3 + " " + z1);
        } else if (z1 >= z2) {
            System.out.println(z3 + " " + z1 + " " + z2);
        } else {
            System.out.println(z3 + " " + z2 + " " + z1);
        }
    }

    void A3(Scanner sc) {
        int monat, jahr, tag, maxTage;
        boolean gueltig = false;
        IO.println("Tag: ");
        tag = sc.nextInt();
        IO.println("Monat: ");
        monat = sc.nextInt();
        IO.println("Jahr: ");
        jahr = sc.nextInt();

        switch (monat) {
            case 1, 3, 5, 7,8 ,10, 12 -> maxTage = 31;
            case 4, 6, 9, 11 -> maxTage = 30;
            case 2 -> {
                if ((jahr % 4 == 0 && jahr % 100 != 0) || jahr % 400 == 0) maxTage = 29;
                else maxTage = 28;
            }
            default -> {
                IO.println("Error, ungueltiger Monat (1-12)");
                return;
            }
        }
        if (tag > 0 && tag <= maxTage) gueltig = true;
        if (gueltig) {
            IO.println("Der " + tag + "." + monat + "." + jahr + " ist ein gueltiges Datum");
            Verzweigungen V =new Verzweigungen();
            String wochentag = V.Wochentag(tag, monat, jahr);
            IO.println("Es ist ein " + wochentag);
        } else IO.println("Ungueltiges Datum");

    }

    String Wochentag(int tag, int monat, int jahr) {
        int tage = 0;
        for (int j = 1; j <= jahr; j++) {
            if ((j % 4 == 0 && j % 100 != 0) || j % 400 == 0) {
                tage += 366;
            } else {
                tage += 365;
            }
        }
        for (int m = 1; m < monat; m++) {
            switch (m) {
                case 1, 3, 5, 7, 8, 10, 12 -> tage += 31;
                case 4, 6, 9, 11 -> tage += 30;
                case 2 -> {
                    if ((jahr % 4 == 0 && jahr % 100 != 0) || jahr % 400 == 0) tage += 29;
                    else tage += 28;
                }
            }
        }
        tage += tag - 1;

        return switch (tage % 7) {
            case 1 -> "Montag";
            case 2 -> "Dienstag";
            case 3 -> "Mittwoch";
            case 4 -> "Donnerstag";
            case 5 -> "Freitag";
            case 6 -> "Samstag";
            default -> "Sonntag";
        };
    }

    void Zd(Scanner sc){

        IO.println("1. Linie x1: ");
        double ax1 = sc.nextDouble();
        IO.println("1. Linie x2: ");
        double ax2 = sc.nextDouble();
        IO.println("1. Linie y1: ");
        double ay1 = sc.nextDouble();
        IO.println("1. Linie y2: ");
        double ay2 = sc.nextDouble();
        IO.println("2. Linie x1: ");
        double bx1 = sc.nextDouble();
        IO.println("2. Linie x2: ");
        double bx2 = sc.nextDouble();
        IO.println("2. Linie y1: ");
        double by1 = sc.nextDouble();
        IO.println("2. Linie y2: ");
        double by2 = sc.nextDouble();

        if(ax1==ax2){
            IO.println("Linie 1 ist horizontal.");
        } else if (ay1==ay2) IO.println("Linie 1 ist vertikal.");
        else IO.println("Linie 1 verläuft diagonal.");

        if(bx1==bx2){
            IO.println("Linie 2 ist horizontal.");
        } else if (by1==by2) IO.println("Linie 2 ist vertikal.");
        else IO.println("Linie 2 verläuft diagonal.");
    }

}