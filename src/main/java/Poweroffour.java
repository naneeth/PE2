/* Hima C P
 *
 * Stack Route,Bangalore
 *
 * Boeing India Pvt Ltd.
 */


import java.util.Scanner;

public class Poweroffour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(function(number));
    }
    public static boolean function(int number){
        double     a = Math.log(number)/Math.log(4);
        boolean b = false;
        if(a%1==0){
            b = true;
        }
        else{
            b = false;
        }
        return b;
    }
}
