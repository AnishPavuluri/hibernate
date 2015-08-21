package test;

import java.util.Scanner;

/**
 * User: Anish
 * Date: 9/16/13
 * Time: 10:27 PM
 */
public class StringBufferTest {
    private static final StringBuffer s = new StringBuffer("@@@@@");

    public static void main(String[] args) {
        System.out.println("Enter name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for(int i=0; i < name.length()/2; i++){
            if(name.charAt(i) != name.charAt(name.length()-1-i)) {
                System.out.println(name + " : not a palindrom");
                System.exit(0);
            }
        }
        System.out.println(name +" : is palindrom");

    }
}
