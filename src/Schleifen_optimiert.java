import static java.lang.System.out;
import java.util.Scanner;

public class Schleifen_optimiert {
    Scanner sc= new Scanner(System.in);
    void main(){
        Schleifen_optimiert SO = new Schleifen_optimiert();
        SO.Aufgabe_Ausfuehren(1);
        SO.Aufgabe_Ausfuehren(2);
        SO.Aufgabe_Ausfuehren(3);
        SO.Aufgabe_Ausfuehren(4);
        SO.Aufgabe_Ausfuehren(5);
        Aufgabe_Ausfuehren(6);
    }

    void Aufgabe_Ausfuehren(int a){
        Schleifen S =new Schleifen();
        Schleifen.AufgabeZ S_f =new Schleifen.AufgabeZ();
        if(a<=3)out.println("Willst du die Aufgabe "+a+". ueberspringen? (y/n)");
        else out.println("Willst du die "+(a-3)+". Zusatzaufgabe ueberspringen? (y/n)");
        char ueberspringen = sc.next().toLowerCase().charAt(0);
        char again = 'y';
        if(ueberspringen=='y') return;
        while(again=='y') {
            switch (a){
                case 1 -> S.Aufgabe1(sc);
                case 2-> S.Aufgabe2(sc);
                case 3-> S.Aufgabe3(sc);
                case 4-> S_f.Aufgabea(sc);
                case 5->S_f.Aufgabec(sc);
                case 6->S_f.Aufgabef(sc);
            }
            out.println("Again? (y/n)");
            again = sc.next().toLowerCase().charAt(0);
        }
    }
}


