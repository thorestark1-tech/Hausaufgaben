
void main() {
    Scanner sc = new Scanner(System.in);
    int geburtsjahr = 2000;
    int geburtsmonat =3;
    int geburtstag = 29;
    int versuche=jahr(geburtsjahr,sc);
    versuche+=monat(geburtsmonat,sc);
    versuche+=tag(geburtstag,sc);
    IO.println("Gut gemacht. Sie haben "+versuche+" Versuche gebraucht.");
    IO.println("Ich habe am "+geburtstag+"."+geburtsmonat+"."+geburtsjahr+" Geburtstag");
}
int jahr(int geburtsjahr,Scanner sc){
    int tipp;
    int versuche =0;
    do {
        IO.print("Rate das Geburtsjahr: ");
        tipp = sc.nextInt();
        if (tipp < geburtsjahr) {
            IO.println("Zu früh");

        } else if (tipp > geburtsjahr) {
            IO.println("Zu spät");

        } else {
            IO.println("Richtig geraten!\n");
        }
        versuche++;
    } while (tipp != geburtsjahr);
    return versuche;
}
int monat(int geburtsmonat, Scanner sc){
        int tipp;
        int versuche=0;
    do {
        IO.print("Rate den Geburtsmonat: ");
        tipp = sc.nextInt();
        if (tipp < geburtsmonat) {
            IO.println("Zu früh");
        } else if (tipp > geburtsmonat) {
            IO.println("Zu spät");
        } else {
            IO.println("Richtig geraten!\n");
            versuche--;
        }
        versuche++;
    } while (tipp != geburtsmonat);
    return versuche;
}
int tag(int geburtstag, Scanner sc){
    int tipp;
    int versuche =0;
    do {
        IO.print("Rate den Geburtstag: ");
        tipp = sc.nextInt();
        if (tipp < geburtstag) {
            IO.println("Zu früh");
        } else if (tipp > geburtstag) {
            IO.println("Zu spät");
        } else {
            IO.println("Richtig geraten!\n");
            versuche--;
        }
        versuche++;
    } while (tipp != geburtstag);
    return versuche;
}