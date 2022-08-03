package array;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Multiplication {
    public static void main(String[] args) {
        double a= 100000;
        double b = 200000;
        BigInteger bd = new BigDecimal(a*b).toBigInteger();
        System.out.println(bd);
    }
}
