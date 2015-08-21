package test;

/**
 * User: Anish
 * Date: 9/16/13
 * Time: 9:30 PM
 */
public class IntegerTest {
    public static void main(String[] args) {
        Integer integer1 = 12;
        Integer integer2 = 12;
        Integer integer3 = 1000;
        Integer integer4 = 1000;
        System.out.println(integer3.equals(integer4));
        System.out.println(integer1==integer2);
        System.out.println(integer3==integer4);
        try{
           //throw new Exception();
        } /*catch (Exception e) {
            System.out.println("catch");
        }*/ finally {
            System.out.println("finally");
        }

    }
}
