import java.io.*;
public class WordText{
public static void main(String args[]) throws IOException
{
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String input;
    int i,a;
System.out.print("Enter a string: ");
 input=  in.readLine();
 a= input.length();
System.out.println("Number of Characters: " + a);
int words=1;
for (i= 0; i< a; i++)
	{
	if(input.charAt(i)== ' ')
	    words += 1;
	}  
 System.out.println("Number of Words: "+words);
System.out.println("Number of vowels: ");
System.out.println("Number of consonants: ");
System.out.println("In capital letters: "+ input.toUpperCase());
System.out.println("In small letters: "+ input.toLowerCase());

        System.out.println("In Reverse: ");
  
}

}
