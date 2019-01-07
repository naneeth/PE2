/* Hima C P
 *
 * Stack Route,Bangalore
 *
 * Boeing India Pvt Ltd.
 */


import java.util.Scanner;

public class ReversePalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        System.out.println(function(string));
    }

    public static String function(String s){
            String reverse = "";
            String b = "";
            for (int i = (s.length()) - 1; i >= 0; i--) {
                reverse = reverse + s.charAt(i);
            }
            if(reverse.equals(s))
            {
                b = s + " is a palindrome";
            }
            else{
              b = "Not a palindrome";
            }
            return b;
        }


    }

