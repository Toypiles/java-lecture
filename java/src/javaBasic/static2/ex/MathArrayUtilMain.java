package javaBasic.static2.ex;
import static javaBasic.static2.ex.MathArrayUtils.*;

public class MathArrayUtilMain {
    public static void main(String[] args) {
        int[] values= {1,2,3,4,5};
        System.out.println("sum= "+sum(values));
        System.out.println("average= "+average(values));
        System.out.println("min= "+min(values));
        System.out.println("max= "+max(values));
    }
}
