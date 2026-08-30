void main() {
    String sum = "Summe: ";
    String dif = "Differenz: ";
    String prod = "Produkt: ";
    String quot = "Quotient: ";
    String rest = "Rest bei Division: ";
    int zahl1 = 20;
    int zahl2 = 7;
    int summe = zahl1 + zahl2;
    int differenz = zahl1 - zahl2;
    int produkt = zahl1 * zahl2;
    int division = zahl1 / zahl2;
    double quotient = (double) zahl1 / zahl2;
    int modulo = zahl1 % zahl2;
    IO.println(sum + summe);
    IO.println(dif + differenz);
    IO.println(prod + produkt);
    IO.print(quot + division + "\n");
    IO.print(quot + quotient);
    IO.print(rest + modulo + "\n");
    IO.println("(zahl1+zahl2)^2=" + (zahl1 + zahl2) * (zahl1 + zahl2));
    zahl1 *= 2;
    IO.println("zahl1: " + zahl1);
    ++zahl2;
    zahl2 += 5;
    IO.println("zahl2: " + zahl2);
    System.out.printf("Zahl: %.2f%n", 123.1234567);
}

