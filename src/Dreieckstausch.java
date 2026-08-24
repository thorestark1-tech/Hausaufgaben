

void main() {
    Scanner sc = new Scanner(System.in);
    char again ='y';
    while (again=='y'||again=='Y') {
        IO.println("Gebe 2 Zahlen.");

        int a = sc.nextInt();
        int b = sc.nextInt();
        IO.println("a= " + a + ", b= " + b);
        if (a > b) {
            int c = a;
            a = b;
            b = c;
            IO.println("Now: a= " + a + ", b= " + b);
        }
        IO.println("Now: a= " + a + ", b= " + b);
        IO.println("Do you want to go again? (y/n)");
        again = sc.next().charAt(0);
    }
}