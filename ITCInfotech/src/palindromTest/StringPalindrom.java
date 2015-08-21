package palindromTest;

import java.util.Scanner;

/**
 * User: Anish
 * Date: 2/9/14
 * Time: 11:10 PM
 */
public class StringPalindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name : ");
        String name = scanner.nextLine();
        for(int i = 0; i < name.length()/2; i++) {
            if(name.charAt(i) != name.charAt(name.length()-1-i)) {
                System.out.println(name+" : is not palindrom");
                System.exit(0);
            }
        }
        System.out.println(name +" : is palindrom");
        StringBuffer stringBuffer = new StringBuffer("s");
        stringBuffer.reverse()



    }
}
