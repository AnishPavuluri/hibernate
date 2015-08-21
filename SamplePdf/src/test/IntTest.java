package test;

/**
 * User: Anish
 * Date: 9/16/13
 * Time: 10:19 PM
 */
public class IntTest {
    public static void main(String[] args) {
        /*int i1 = 10;
        int i2 = 10;
        int i3 = 1000;
        int i4 = 1000;
        System.out.println(i1==i2);
        System.out.println(i3==i4);*/
        String name = new String("xyz");
        StringBuffer n = new StringBuffer(name);
        if(n.reverse().equals(name)){
            System.out.println("palindram");
        } else {
            System.out.println("not palindram");
        }
    }
}
