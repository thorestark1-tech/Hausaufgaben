import java.util.Scanner;
void main() {
    int a = 10;
    int b = 3;
    if (a>b)
        IO.println(a);
    else IO.println(b);
    Scanner sc = new Scanner(System.in);
    IO.println("Welche beiden integer möchen Sie vergleichen?");
    a = sc.nextInt();
    b= sc.nextInt();
    if (a>b) IO.println(a);
    else IO.println(b);
}