public class taschenrechner {
    public taschenrechner() {
    }

    static void main(String[] args) {
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
        double quotient = (double)(zahl1 / zahl2);
        int modulo = zahl1 % zahl2;
        System.out.println(sum + summe);
        System.out.println(dif + differenz);
        System.out.println(prod + produkt);
        System.out.print(quot + division + "\n");
        System.out.print(quot + quotient);
        System.out.print(rest + modulo + "\n");
        char multipl = '*';
        IO.println("(zahl1+zahl2)^2=" + (zahl1 + zahl2) * (zahl1 + zahl2));
        zahl1 *= 2;
        System.out.println("zahl1: " + zahl1);
        ++zahl2;
        zahl2 += 5;
        System.out.println("zahl2: " + zahl2);
        System.out.printf("Zahl: %.2f%n", 123.1234567);
    }
}

