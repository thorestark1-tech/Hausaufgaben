public class Rechnung{
        int erg;
    void main(){

    }
    int z1() {
        int min = 1, max = 10;
        return (int) (Math.random() * (max - min + 1)) + min;

    }
    int mult(int a, int b){
        return  a*b;
    }
    int add(int a, int b){
        return a+b;
    }
    int minus1(int a, int b){
        return  a-b;
    }
    int minus2(int a, int b){
        return  b-a;
    }

    int fak(int z1){
        int erg = 1;
        for(int i =  1;i<=z1;i++)erg*=i;
        return erg;
    }
    int sujm(int a,int b){
        int erg = 0;
        for(int i = b;i<=a;i++)erg+=i;
        return  erg;
    }
}
