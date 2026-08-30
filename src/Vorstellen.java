void main() {
    IO.println("Hallo mein sc ist Thore.\nIch bin " + (2026 - 2009) + " Jahre alt.");
    IO.println("Ich habe einen Bruder.");
    IO.println("Wie heißen sie?");
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    IO.println("Sind sie männlich (m) oder weiblich (w)?");
    char Geschlecht = sc.next().charAt(0);
    String Anrede;
    String Geschlecht1;
    if (Geschlecht == 'm') {
        Anrede = "Herr";
        Geschlecht1 = "Männlich";
    } else if (Geschlecht == 'w') {
        Anrede = "Frau";
        Geschlecht1 = "Weiblich";
    } else {
        Anrede = "Person";
        Geschlecht1 = "-----";
    }
    IO.println("Guten Tag " + Anrede + " " + name);
    int Jahr = 2026;
    int Monat = 9;
    int Geburtsjahr, GeburtsMonat, Alter;
    IO.println("In welchen Jahr sind Sie geboren?");
    Geburtsjahr = sc.nextInt();
    IO.println("In welchen Monat sind Sie geboren? (1-12)");
    GeburtsMonat = sc.nextInt();
    Alter = Jahr - Geburtsjahr;
    if (GeburtsMonat > Monat) {
        Alter--;
    }
    boolean Geschwister;
    IO.println("Haben sie Geschwister? (true/false)");
    Geschwister = sc.nextBoolean();
    int anzahl_Geschwister;
    if (Geschwister) {
        IO.println("Wie viele?");
        anzahl_Geschwister = sc.nextInt();
    } else {
        anzahl_Geschwister = 0;
    }
    IO.println("Name: " + name + "\nGeschlecht: " + Geschlecht1 + "\nGeboren im " + GeburtsMonat + ". Monat " + Geburtsjahr);
    IO.println("Alter: " + Alter + "\nSie haben " + (anzahl_Geschwister) + " Geschwister");
}
