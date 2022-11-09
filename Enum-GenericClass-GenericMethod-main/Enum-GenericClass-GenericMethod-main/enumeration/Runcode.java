
package enumeration;

public class Runcode {
    public static void main(String[] args) {
        String str = "JANUARY";
        Testcode t1 = new Testcode(Month.valueOf(str));
        t1.monthIsLike();
    }
}
