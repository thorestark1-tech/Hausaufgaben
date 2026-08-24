import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);
    IO.println("Gebe mir die Seiten eines Dreiecks.");
    double a=sc.nextDouble();
    double b=sc.nextDouble();
    double c=sc.nextDouble();
    IO.println("Dein Dreieck ist:");
    //gültig type shiiii
    if(c+b<=a||a+b<=c||a+c<=b){
        IO.print("Gültig");
    }else IO.print("Ungültig");
    //Seitig
    if(a==b&&b==c) IO.print(", Gleichseitig");
    //Schenkelig
    if(a==b||b==c||c==a) IO.print(", Gleichschenkelig");
    //Rechtwinkelig
    if (a * a + b * b == c * c ||
        a * a + c * c == b * b ||
        b * b + c * c == a * a) IO.print(", Rechtwinkelig");
}