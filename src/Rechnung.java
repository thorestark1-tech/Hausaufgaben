public class Rechnung{
    int z1() {
        int min = 1, max = 6;
        return (int) (Math.random() * (max - min + 1)) + min;
    }
    boolean mult(int a, int b,int erg){
        IO.println("ficken");
        return a * b == erg;
    }
    boolean add(int a, int b, int erg){
        return a + b == erg;
    }
    boolean minus1(int a, int b, int erg){
        return a - b == erg;
    }
    boolean minus2(int a, int b, int erg){
        return b - a == erg;
    }

    boolean fak(int z1,int ein){
        int erg =1;
        for(int i =1;i<z1;i++)erg*=i;
        return ein == erg;
    }
}
