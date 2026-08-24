
void main() {
    Scanner sc = new Scanner(System.in);

    IO.print("Gib ein Viereck ein: ");
    String viereck = sc.nextLine();

    switch (viereck.toLowerCase()) {
        case "quadrat" ->IO.println("4 gleich lange Seiten, 4 rechte Winkel");

        case "rechteck"->
            IO.println("Gegenüberliegende Seiten gleich, 4 rechte Winkel");

        case "raute"->
            IO.println("4 gleich lange Seiten");

        case "parallelogramm"->
            IO.println("Gegenüberliegende Seiten und Winkel gleich");

        case "drache"->
            IO.println("Zwei Paare benachbarter Seiten gleich");

        default-> IO.println("Allgemeines Viereck");
    }
}