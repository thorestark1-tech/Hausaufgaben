
void main() {
    Scanner sc = new Scanner(System.in);
    IO.println("Willst du die erste Aufgabe Überspringen? (u)");
    char überspringen = sc.next().charAt(0);
    if (überspringen != 'u') {
    Aufgabe1(sc);
    }
    überspringen = 'a';
    IO.println("Willst du die zweite Aufgabe Überspringen? (u)");
    überspringen = sc.next().charAt(0);
    if (überspringen != 'u') {
        IO.println("Lies drei Zahlen ein");

    }

}
void Aufgabe1(Scanner sc){
    IO.println("Lies eine Zahl ein: ");
    double zahl = sc.nextDouble();
    if (zahl < 0) IO.println("Die Zahl ist negativ.");
    else {
        if (zahl > 0) IO.println("Die Zahl ist positiv.");
        IO.println("Die Zahl ist gleich 0.");
    }
}