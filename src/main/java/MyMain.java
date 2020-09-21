import java.util.Scanner;

public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        // REPLACE WITH YOUR CODE
        char ch1 = ' ';
        if(ch>=65 && ch<=90) 
        {
            ch1 = (char)(ch+32);
        }
        else
        {
            ch1 = ch;
        }
        return ch1;
    }

    // Returns a copy of a String, where all letters 
    // are now lowercase
    public static String myToLowerCase(String str) {
        // REPLACE WITH YOUR CODE
        String str1 = "";
        for(int i = 0; i<str.length(); i++)
        {
            str1 += toLower(str.charAt(i));
        }
        return str1;
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not an lowercase letter, 
    // it is returned unchanged. 
    public static char toUpper(char ch) {
        // REPLACE WITH YOUR CODE HERE
        char ch1 = ' ';
        if(ch>=97 && ch<=172) 
        {
            ch1 = (char)(ch-32);
        }
        else
        {
            ch1 = ch;
        }
        return ch1;

    }

    // Returns a copy of a String, where all letters 
    // are now uppercase
    public static String myToUpperCase(String str) {
        // REPLACE WITH YOUR CODE HERE
        String str1 = "";
        for(int i = 0; i<str.length(); i++)
        {
            str1 += toUpper(str.charAt(i));
        }
        return str1;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a String");
        String str = scan.nextLine();
        System.out.println("What would you like to make your string lowercase or uppercase?");
        String str1 = scan.nextLine();
        if(str1.equals("lowercase"))
        {
            System.out.println("Here is your string in " + str1 + ": " + myToLowerCase(str));
        }
        else if(str1.equals("uppercase"))
        {
            System.out.println("Here is your string in " + str1 + ": " + myToUpperCase(str));
        }        
    }
}
