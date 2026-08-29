import java.util.Scanner;
String RED="\u001B[31m"; //globale variabele ANSI code um IO rot zu machen (hab ich von c++)
String GREEN="\u001B[32m";//sollte grün sein
String ORANGE="\u001B[33m";//dachte das wäre gelb lol
String DEFAULT = "\u001B[0m";//ANSI/ASCII um den text wieder auf default farbe zu machen

void main() {
    Scanner sc = new Scanner(System.in);
    Zufallszahl Z= new Zufallszahl();
    Rechnung R =new Rechnung();
    int Score=0, erg, Aufgabe=0;
    for(int i=1;i<=10;i++) {
        int a = Z.z1();
        int b =Z.z2();
        Aufgabe++;
        IO.println("Sie habem "+Score +" Punkte");
        switch (R.z1()) {
            case 1,2,3,4->{
                IO.println(Aufgabe+")   "+a+" * "+b+" =");
                erg = sc.nextInt();
                if (R.mult(a,b,erg)) Score +=richtig();
                else Score+=falsch();
            }
            case 5,6->{
                IO.println(Aufgabe+")   "+a+" + "+b+" =");
                erg = sc.nextInt();
                if (R.add(a,b,erg))Score +=richtig();
                else Score += 2*falsch();
            }
            case 7->{
                IO.println(Aufgabe+")   "+a+" - "+b+" =");
                erg = sc.nextInt();
                if (R.minus1(a,b,erg))Score +=richtig();
                else Score += falsch();
            }
            case 8->{
                IO.println(Aufgabe+")   "+b+" - "+a+" =");
                erg = sc.nextInt();
                if (R.minus2(a,b,erg))Score +=richtig();
                else Score += falsch();
            }
            case 9 -> {
                a=Z.z3();
                IO.println(Aufgabe+")   "+a+"!");
                erg= sc.nextInt();
                if (R.fak(a,erg))Score +=2*richtig();
                else Score += falsch();
            }
            case 10->{
                a=Z.z3();
                b=Z.z4();
                IO.println(Aufgabe+")   Die Summe aller i von "+b+" bis "+a);
                erg= sc.nextInt();
                if (R.sujm(a,b,erg))Score +=2*richtig();
                else Score += falsch();
            }
        }
    }
    if (Score>=100){
        IO.print("Sie haben einen Punktestand von "+ORANGE+Score+DEFAULT+" erreicht.");
        IO.print(" Meine Güte, ssie sind ja ein Genie!!");
    }
    else if(Score>0){
        IO.print("Sie haben einen Punktestand von "+GREEN+Score+DEFAULT+" erreicht.");
        IO.print(" Sie sind nicht komplett behindert!");
    }
    else {
        IO.print("Sie haben einen Punktestand von "+RED+Score+DEFAULT+" erreicht.");
        IO.print(" Sie sind eine Schande für die Menschheit!");
    }
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

}
int richtig(){
    IO.println("Rivhtig Supiii! Du bekommst 10 Punkte. (+20 bei Fakultät, Summe)");
    return 10;
}
int falsch(){
    IO.println("Faaaaalsch du Opfer. Minus 20 Punkte. (-40 bei Addition)");
    return -20;
}