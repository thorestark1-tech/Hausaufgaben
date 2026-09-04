import static java.lang.System.out;

Scanner sc=new Scanner(System.in);
void main() {
    int a= sc.nextInt();
    out.println(fak(a));
    out.println(fibo(a));
    out.println(qwuerr(a));
    int b=sc.nextInt(),c=sc.nextInt();
    out.println(mult(c,b));

}
int fak(int n){
    if(n==1) return 1;
    else return fak(n-1)*n;
}
int mult(int a,int b){
    if(b==0) return 0;
    else return mult(a, b-1)+a;
}
int fibo(int n){
    if(n==0)return 0;
    else if(n==1) return 1;
    else return fibo(n-1)+fibo(n-2);
}
int qwuerr(int n){
    if(n==0) return 0;
    else return n%10+qwuerr(n/10);//quersumme
}