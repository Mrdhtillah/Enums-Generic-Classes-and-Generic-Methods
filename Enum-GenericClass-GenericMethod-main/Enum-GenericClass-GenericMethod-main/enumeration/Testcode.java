
package enumeration;

public class Testcode {
    Month month;

    public Testcode(Month month) {
        this.month = month;
    }

    public void monthIsLike() {
        switch (month) {
            case JANUARY:
                System.out.println("January is great.");
                break;
            case FEBRUARY:
                System.out.println("February is even better.");
                break;
            case MARCH:
            case APRIL:
                System.out.println("April is the best.");
                break;
            default:
                System.out.println("other months are so-so.");
                break;
        }
    }
}
