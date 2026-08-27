import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);
    Zufallszahl Z= new Zufallszahl();
    Rechnung R =new Rechnung();
    int Score=0, erg, Aufgabe=0;
    for(int i=0;i<10;i++) {
        int a = Z.z1();
        int b =Z.z2();
        IO.println("Sie habem "+Score+" Punkte");
        switch (R.z1()) {
            case 1,2->{
                IO.println(Aufgabe+")   "+a+" * "+b+" =");
                erg = sc.nextInt();
                if (R.mult(a,b,erg)) Score +=richtig();
                else Score+=falsch();
            }
            case 3->{
                IO.println(Aufgabe+")   "+a+" + "+b+" =");
                erg = sc.nextInt();
                if (R.add(a,b,erg))Score +=richtig();
                else Score += falsch();
            }
            case 4->{
                IO.println(Aufgabe+")   "+a+" - "+b+" =");
                erg = sc.nextInt();
                if (R.minus1(a,b,erg))Score +=richtig();
                else Score += falsch();
            }
            case 5->{
                IO.println(Aufgabe+")   "+b+" - "+a+" =");
                erg = sc.nextInt();
                if (R.minus2(a,b,erg))Score +=richtig();
                else Score += falsch();
            }
            case 6 -> {
                a=Z.z3();
                IO.println(Aufgabe+")   "+a+"!");
                erg= sc.nextInt();
                if (R.fak(a,erg))Score +=richtig();
                else Score += falsch();
            }
        }Aufgabe++;
    }
    IO.print("Sie haben einen Punktestand von "+Score+" erreicht.");
    if(Score>0)IO.print(" Sie sind nicht komplett behindert!");
    else IO.print(" Sie sind eine Schande für die Menschheit!");
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
        int min = 1, max = 5;
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}
int richtig(){
    IO.println("Rivhtig Supiii! Du bekommst 10 Punkte");
    return 10;
}
int falsch(){
    IO.println("Faaaaalsch du Opfer. Minus 10 Punkte");
    return -10;
}