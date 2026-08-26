void main() {
    Scanner sc = new Scanner(System.in);
    IO.println("Willst du die erste Aufgabe ueberspringen? (y)");
    char ueberspringen = sc.next().toLowerCase().charAt(0);
    char again = 'y';
    while (ueberspringen != 'y' && again == 'y') {
        Aufgabe1(sc);
        IO.println("Again? (y/n)");
        again = sc.next().toLowerCase().charAt(0);
    }
    ueberspringen = 'n'; again='y';;;
    IO.println("Willst du die zweite Aufgabe ueberspringen? (y)");
    ueberspringen = sc.next().toLowerCase().charAt(0);
    while (ueberspringen != 'y' && again == 'y') {
        Aufgabe2(sc);
        IO.println("Again? (y/n)");
        again = sc.next().toLowerCase().charAt(0);
    }
    ueberspringen = 'n'; again='y';;;
    IO.println("Willst du die dritte Aufgabe ueberspringen? (y)");
    ueberspringen = sc.next().toLowerCase().charAt(0);
    while (ueberspringen != 'y' && again == 'y') {
        Aufgabe3(sc);
        IO.println("Again? (y/n)");
        again = sc.next().toLowerCase().charAt(0);
    }
}
void Aufgabe1(Scanner sc){
    IO.println("Lies eine ganze positive Zahl ein.");
    int n = sc.nextInt();
    int erg=0;
    for(int i=1;i<=n;i++){
        erg+=i;
    }IO.println("Summe von i=0 zu "+n+" ist gleich "+erg);

}
void Aufgabe2(Scanner sc){
    IO.println("Lies eine ganze positive Zahl ein.");
    int n = sc.nextInt();
    for(int i=0;i<n-1;i+=2)IO.println(i);
}
void Aufgabe3(Scanner sc){
    IO.println("Lies zwei Zahlen ein.");
    int z1 = sc.nextInt(), z2=sc.nextInt();
    int prod1=z1,prod2=z2,erg=0;
    if(z1>=0) for(;z1>0;z1--) erg+=z2;
    IO.println(prod1+" * "+prod2+" = "+erg);
}