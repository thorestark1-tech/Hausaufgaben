import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.out;

public class Arra {
    void main() {
        int[] reihung = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < reihung.length; i++){
            reihung[i] = sc.nextInt();
            out.println(reihung[i]);
            A1();
        }
    }
    void A1(){
        int[] b=new int[5],a={1,2,3,4,5,6};
        out.println(Arrays.toString(a));
        out.println(Arrays.toString(b));
        b=a;
        out.println(Arrays.toString(b));
        out.println(Arrays.toString(a));
    }
}