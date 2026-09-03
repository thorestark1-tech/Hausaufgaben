import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import static java.lang.System.out;

public class Methoden {
    Scanner  sc =new Scanner(System.in);
    Methoden M =new Methoden();
    void main() throws InterruptedException {
        out.println("Wie oft Helo world ausgeben?");
        int c = sc.nextInt();
        print(c);
        out.println(istGerade(c));
        out.println("gib zwei zahlen ein.");
        double a=sc.nextDouble(), b=sc.nextDouble();
        out.println(max(a,b));
        String hello="Heloo", world=" World";
        M.zusamen(hello,world);
        uebung1();
        out.println("Gib eienne text eine-.");
        String p=sc.next();
        out.println("Wie oft soll der text ausgegeben werden?");
        int d=sc.nextInt();
        uebung2(d,p);
        uebung3();
        out.println(binominal());
    }
    void print(int anzahl){
        for(int i = 0; i <=anzahl; i++)out.println("Hello world");
    }
    boolean istGerade(int i){
        return i%2==0;
    }
    double max(double a,double b){
        return Math.max(a, b); //if(a<b)return b; return a;
    }
    void zusamen(String hello, String world){
        out.println(hello+world);
    }
    void uebung1(){
        waagerecht();
        for(int i=0;i<=8;i++) senkrecht();
        waagerecht();
    }
    final void waagerecht(){out.println("* * * * * * * * * *");}
    final void senkrecht(){out.println("*                 *");}


    void uebung2(int anzahl,String pnis){
        for(int i= 0;i<=anzahl;i++)out.println(pnis);
    }
    void uebung3() throws InterruptedException {
        int[] w;
        do {
            w  = new int[]{z1(), z2(), z3()};
            Arrays.sort(w);
            out.println(Arrays.toString(w));

            if (istDreierpasch(w)) out.println("Dreierpasch!!!");
            else if(istPasch(w)) out.println("Pasch!!");
            else out.println("Kein Pasch");
                Thread.sleep(500);
        }while (!istDreierpasch(w));
    }
    int z1(){ return (int) (Math.random()*6)+1;}

    Random random=new Random();
    int z2(){ return random.nextInt(1,6);}
    int z3(){ return random.nextInt(1,6);}

    boolean istPasch(int[]w){ return w[0]==w[1]||w[1]==w[2];}
    boolean istDreierpasch(int[]w){ return w[0] == w[1] && w[1] == w[2];}

    int binominal(){
        out.println("Gib wei natuerliche Zahlen ein.");
        int z1= sc.nextInt(), z2= sc.nextInt();
        out.println(z1+" ueber "+z2);
        return fak(z1)/(fak(z2)*fak(z1-z2));
    }
    int fak(int n){
        int erg = 1;
        for(int i =  1;i<=n;i++)erg*=i;
        return erg;
    }
}


