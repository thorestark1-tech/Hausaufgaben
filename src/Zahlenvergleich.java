import java.util.Scanner;
void main() {
    int a;
    int b;
    Scanner sc = new Scanner(System.in);
    IO.println("Welche beiden integer möchen Sie vergleichen?");
    a = sc.nextInt();
    b= sc.nextInt();
    IO.println(Math.max(a, b));
}