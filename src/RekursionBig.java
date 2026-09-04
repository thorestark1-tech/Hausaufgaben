import static java.lang.System.out;
import java.math.BigInteger;
import java.util.Scanner;

Scanner sc = new Scanner(System.in);

void main() {
    BigInteger a = BigInteger.valueOf(sc.nextInt());

    out.println(fak(a));
    out.println(fibo(a));
    out.println(qwuerr(a));

    BigInteger b = sc.nextBigInteger();
    BigInteger c = sc.nextBigInteger();

    out.println(mult(c, b));
}

BigInteger fak(BigInteger n) {
    if (n.compareTo(BigInteger.ONE) <= 0)
        return BigInteger.ONE;
    else
        return fak(n.subtract(BigInteger.ONE)).multiply(n);
}

BigInteger mult(BigInteger a, BigInteger b) {
    if (b.equals(BigInteger.ZERO))
        return BigInteger.ZERO;
    else
        return mult(a, b.subtract(BigInteger.ONE)).add(a);
}

BigInteger fibo(BigInteger n) {
    if (n.equals(BigInteger.ZERO))
        return BigInteger.ZERO;
    else if (n.equals(BigInteger.ONE))
        return BigInteger.ONE;
    else
        return fibo(n.subtract(BigInteger.ONE))
                .add(fibo(n.subtract(BigInteger.TWO)));
}

BigInteger qwuerr(BigInteger n) {
    if (n.equals(BigInteger.ZERO))
        return BigInteger.ZERO;
    else
        return n.remainder(BigInteger.TEN)
                .add(qwuerr(n.divide(BigInteger.TEN)));
}
