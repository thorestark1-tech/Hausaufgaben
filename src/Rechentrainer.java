import static java.lang.System.out;
import java.util.*;
final String RED="\u001B[31m"; //globale variabele ANSI code um out rot zu machen (hab ich von c++)
final String GREEN="\u001B[32m";//sollte grün sein
final String ORANGE="\u001B[33m";//dachte das wäre gelb lol
final String DEFAULT = "\u001B[0m";//ANSI/ASCII um den text wieder auf default farbe zu machen
boolean falsch=false;
Random r=new Random();

void main() {
        Scanner sc = new Scanner(System.in);
        Zufallszahl Z = new Zufallszahl();
        Rechnung R = new Rechnung();
//    int value=10;
//    Z.rand(value);
        int Score = 0, erg, Aufgabe = 0;
        for (int i = 1; i <= 10; i++) {
            int a = Z.z1();
            int b = Z.z2();
            Aufgabe++;
            out.println("Sie habem " + Score + " Punkte");
                switch (R.z1()) {
                    case 1, 2, 3, 4 -> {
                        out.println(Aufgabe + ")   " + a + " * " + b + " =");
                        erg=R.mult(a, b);
                    }
                    case 5, 6 -> {
                        out.println(Aufgabe + ")   " + a + " + " + b + " =");
                        erg=R.add(a, b);
                    }
                    case 7 -> {
                        out.println(Aufgabe + ")   " + a + " - " + b + " =");
                        erg=R.minus1(a, b);

                    }
                    case 8 -> {
                        out.println(Aufgabe + ")   " + b + " - " + a + " =");
                        erg=R.minus2(a, b);

                    }
                    case 9 -> {
                        a = Z.z3();
                        out.println(Aufgabe + ")   " + a + "!");
                        erg=R.fak(a);

                    }
                    default -> {
                        a = Z.z3();
                        b = Z.z4();
                        out.println(Aufgabe + ")   Die Summe aller i von " + b + " bis " + a);
                        erg=R.sujm(a, b);
                    }
                }
                boolean x=true;
                int ein;
                while(x){
                    ein=sc.nextInt();
                    if(erg==ein) {
                        Score+=richtig();
                        x=false;
                    }
                    else Score+=falsch();
                }
            }

        if (Score >= 100) {
            out.print("Sie haben einen Punktestand von " + ORANGE + Score + DEFAULT + " erreicht. ");
            out.print("Meine Güte, ssie sind ja ein Genie!! ");
        } else if (Score > 0) {
            out.print("Sie haben einen Punktestand von " + GREEN + Score + DEFAULT + " erreicht. ");
            out.print("Sie sind nicht komplett behindert! ");
        } else {
            out.print("Sie haben einen Punktestand von " + RED + Score + DEFAULT + " erreicht. ");
            out.print("Sie sind eine Schande für die Menschheit! ");
        }
        if (!falsch) out.print("Keine fahler, gut gemacht! ");
}

    public static class Zufallszahl {
        int z1() {
            int min = 1, max = 10;
            return (int) (Math.random() * (max - min + 1)) + min;
        }

        int z2() {
            int min = 1, max = 10;
            return (int) (Math.random() * (max - min + 1)) + min;
        }

        int z3() {
            int min = 3, max = 8;
            return (int) (Math.random() * (max - min + 1)) + min;
        }

        int z4() {
            int min = 0, max = 3;
            return (int) (Math.random() * (max - min + 1)) + min;
        }
//    void rand(int value){
//        final int result=2*value;
//
//    }// log point ist bei debug run als string und

    }

    @SuppressWarnings("SameReturnValue")
    int richtig() {
        out.println("Rivhtig Supiii! Du bekommst 10 Punkte. (+20 bei Fakultät, Summe)");
        return 10;
    }

    int falsch() {
        out.println("Faaaaalsch du Opfer. Minus 20 Punkte. (-40 bei Additoutn)\nProbier nochmal.");
        falsch = true;
        return -20;
     }


