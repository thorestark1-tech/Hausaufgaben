import java.util.Scanner;
import static java.lang.System.out;

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
        if(a<=3)out.println("Willst du die Aufgabe "+a+". ueberspringen? (y/n)");
        else out.println("Willst du die "+(a-3)+". Zusatzaufgabe ueberspringen? (y/n)");
        char ueberspringen = sc.next().toLowerCase().charAt(0);
        char again = 'y';
        if(ueberspringen=='y') return;
        while(again=='y') {
            if (a == 1) V.A1(sc);
            if (a == 2) V.A2(sc);
            if (a == 3) V.A3(sc);
            if (a == 4) V.Zd(sc);
            out.println("Again? (y/n)");
            again = sc.next().toLowerCase().charAt(0);
        }
    }
}
