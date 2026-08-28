import java.util.Scanner;

public class Verzeigungen_optimiert {
    void main(){
        Verzeigungen_optimiert VO=new Verzeigungen_optimiert();
        Scanner sc = new Scanner(System.in);
        VO.Aufgabe_Ausfuehren(sc,1);
        VO.Aufgabe_Ausfuehren(sc,2);
        VO.Aufgabe_Ausfuehren(sc,3);
        VO.Aufgabe_Ausfuehren(sc,4);
    }

    void Aufgabe_Ausfuehren(Scanner sc, int a){
        Verzweigungen V = new Verzweigungen();
        IO.println("Willst du die Aufgabe "+a+" ueberspringen?");
        char ueberspringen = sc.next().toLowerCase().charAt(0);
        char again = 'y';
        if(ueberspringen=='y') return;
        while(again=='y') {
            if (a == 1) V.A1(sc);
            if (a == 2) V.A2(sc);
            if (a == 3) V.A3(sc);
            if (a == 4) V.Zd(sc);
            IO.println("Again? (y/n)");
            again = sc.next().toLowerCase().charAt(0);
        }
    }
}
