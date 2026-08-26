
void main() {
    Scanner sc = new Scanner(System.in);
    IO.println("Willst du die erste Aufgabe ueberspringen? (y)");
    char ueberspringen = sc.next().toLowerCase().charAt(0);
    char again='y';
    while (ueberspringen != 'y'&&again == 'y') {
            Aufgabe1(sc);
    IO.println("Again? (y/n)");
    again = sc.next().toLowerCase().charAt(0);
    }
    ueberspringen = 'n'; again='y';
    IO.println("Willst du die zweite Aufgabe ueberspringen? (y)");
    ueberspringen = sc.next().toLowerCase().charAt(0);
    while (ueberspringen != 'y'&&again=='y') {
            Aufgabe2(sc);
        IO.println("Again? (y/n)");
        again = sc.next().toLowerCase().charAt(0);
    }
    ueberspringen = 'n'; again='y';
    IO.println("Willst du die dritte Aufgabe ueberspringen? (y)");
    ueberspringen = sc.next().toLowerCase().charAt(0);
    while (ueberspringen != 'y'&&again=='y') {
        Aufgabe3(sc);
        IO.println("Again? (y/n)");
        again = sc.next().toLowerCase().charAt(0);
    }
}
void Aufgabe1(Scanner sc){
    IO.println("Lies eine Zahl ein: ");
    double zahl = sc.nextDouble();
    String gerade;
    if(zahl%2==0)gerade="gerade";
    else gerade="ungerade";
    if (zahl < 0) IO.println("Die Zahl ist negativ.");
    else {
        if (zahl > 0) IO.println("Die Zahl ist positiv.");
        IO.println("Die Zahl ist gleich 0.");
    }
    IO.println("Deine Zahl ist "+gerade);
}
void Aufgabe2 (Scanner sc){
    IO.println("Lies drei Zahlen ein");
    double z1 = sc.nextDouble(), z2= sc.nextDouble(), z3= sc.nextDouble();
    if(z1==z2&&z2==z3) IO.println("Alle deine Zahlen sind gleich.");
    else if (z1==z2||z2==z3||z3==z1) IO.println("Zwei deiner Zahlen sind gleich.");
    else IO.println("Alle deiner Zahlen sind verschieden.");

    if (z1 >= z2 && z2 >= z3) { //ordnen
        System.out.println(z1 + " " + z2 + " " + z3);
    } else if (z1 >= z3 && z3 >= z2) {
        System.out.println(z1 + " " + z3 + " " + z2);
    } else if (z2 >= z1 && z1 >= z3) {
        System.out.println(z2 + " " + z1 + " " + z3);
    } else if (z2 >= z3 && z3 >= z1) {
        System.out.println(z2 + " " + z3 + " " + z1);
    } else if (z3 >= z1 && z1 >= z2) {
        System.out.println(z3 + " " + z1 + " " + z2);
    } else {
        System.out.println(z3 + " " + z2 + " " + z1);
    }
}
void Aufgabe3(Scanner sc) {
    int monat,jahr,tag,maxTage;
    boolean gueltig =false;
    IO.println("Tag: ");
    tag = sc.nextInt();
    IO.println("Monat: ");
    monat=sc.nextInt();
    IO.println("Jahr: ");
    jahr=sc.nextInt();

    switch (monat){
        case 1,3,5,7,9,11->maxTage=31;
        case 4,6,8,10,12->maxTage=30;
        case 2 -> {
            if((jahr%4==0&&jahr%100!=0)||jahr%400==0) maxTage=29;
            else maxTage=28;
        }
        default -> {
            IO.println("Error, ungueltiger Monat (1-12)");
            return;
        }
    }
    if(tag>0&&tag<=maxTage)gueltig=true;
    if (gueltig==true) {
        IO.println("Gueltiges Datum");
        Wochentag(tag,monat, jahr);
    }
    else IO.println("Ungueltiges Datum");

}

String Wochentag(int tag,int monat, int jahr){
    int tage=0;
    for(int j=1;j>jahr;j++){
        if((jahr%4==0&&jahr%100!=0)||jahr%400==0) tage+=366;
        else tage+=365;
    }
    for(int m=1;m<monat;m++){
        switch (monat){
            case 1,3,5,7,9,11->tage+=31;
            case 4,6,8,10,12->tage+=30;
            case 2->{
                if((jahr%4==0&&jahr%100!=0)||jahr%400==0) tage+=29;
                else tage+=28;
            }
        }
    }
    tage+=tag-1;
    switch (tage%7){
        case 1 :return "Montag";
        case 2 : return "Dienstag";
        case 3 :return "Mittwoch";
        case 4:return "Donnerstag";
        case 5:return "Freitag";
        case 6:return "Samstag";
        default:return "Sonntag";
    }
}