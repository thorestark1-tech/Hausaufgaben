
import java.util.Scanner;

void main (){
        int Gewicht = 70;
        double Groesse = 1.75;
        double bmi = rechner(Groesse, Gewicht);
        IO.println("Sie koennen hier ihren BMI berechnen lassen  und einteilen lassen.\n");
        IO.println("Bei "+Gewicht+"kg und einer Groesse von "+ Groesse);
        String einordnung = klasse(bmi);
        Ausgabe(bmi, einordnung);
        Scanner sc = new Scanner(System.in); //hier ist ein problem, das scanner die lokaöe schreibweise benutzt
        IO.println("Wie viel wiegen Sie (in kg)?");
        Gewicht = sc.nextInt();
        IO.println("Wie gross sind Sie (in m)?");
        String eingabe = sc.next(); //weil die lokale Schreibweise z.B. 1,7 anstatt 1.7 ist, muss ich das verändern da der rest mit . rechnet
        eingabe = eingabe.replace(',','.'); //hier replace ich das , mit einem .
        Groesse = Double.parseDouble(eingabe); //double.parseDouble() wandelt einen String in einen Double um
        bmi = rechner(Groesse, Gewicht);
        einordnung = klasse(bmi);
        Ausgabe(bmi, einordnung);

}
 double rechner(double Groesse, int Gewicht){
    return Gewicht/(Groesse*Groesse);
}
 String klasse (double bmi){
    if (bmi >= 40) return  "Adipositas / Fettsucht Grad III";
    if (bmi >= 35) return"Adipositas / Fettsucht Grad II";
    if (bmi>= 30) return "Adipositas / Fettsucht Grad I";
    if (bmi >= 25) return "Uebergewicht";
    if (bmi>= 19)return  "Normalgewicht";
    return  "Unterrgewicht";
}
void Ausgabe(double bmi, String einordnung){
    IO.println("BMI: "+bmi);
    IO.println("was sie laut der WHO in "+ einordnung+" einordnet.\n");
}