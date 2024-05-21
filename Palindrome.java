import java.util.*;
public class Palindrome
{
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        
        String word = "", opt = "";
        
        
        while (true) {
            System.out.println("Do you want to continue (Yes/No)");
            opt = input.nextLine();
            
            if (!opt.equalsIgnoreCase("Yes")) {
                break;
            }
        
        System.out.println("Enter any String");
        word = input.nextLine();
        
        boolean isPalindrome = true;
        int n = word.length();
        
           for (int i = 0; i < n / 2; i++) {
            if (word.charAt(i) != word.charAt(n - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) 
        {
            System.out.println("Palindrome");
        } 
        else { System.out.println("Not a Palindrome");}
        
    }
}
}
