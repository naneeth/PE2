/* Hima C P
 *
 * Stack Route,Bangalore
 *
 * Boeing India Pvt Ltd.
 */


import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int     number = scan.nextInt();
        System.out.println(isEven(number));
    }
    public static boolean isEven(int number){
        boolean     p = false;
        if(number%2==0){
            p = true;
        }
        else{
            p = false;
        }
        return p;
    }
}
