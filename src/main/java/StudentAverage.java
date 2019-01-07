/* Hima C P
 *
 * Stack Route,Bangalore
 *
 * Boeing India Pvt Ltd.
 */


import java.util.Scanner;

public class StudentAverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = scan.nextInt();

        }
        System.out.println(studentMin(4, array));
        System.out.println(studentMax(4, array));
        System.out.println(studentAvg(4, array));
    }


    public static int studentMin(int length,int[] a){
        int     min = a[0];
        for(int i=0;i<length;i++)
        {
            if(a[i]<0||a[i]>100){
                return -1;
            }
            else{
                if(a[i]<min){
                    min = a[i];
                }
            }
        }
        return min;
    }


    public static int studentMax(int length,int[] a){
        int     max = a[0];
        for(int i=0;i<length;i++)
        {
            if(a[i]<0||a[i]>100){
                return -1;
            }
            else{
                if(a[i]>max){
                    max = a[i];
                }
            }
        }
        return max;
    }
    public static String studentAvg(int length,int[] a){
        double  avg=0;
        double  sum=0;
        String  average;
        for(int i=0;i<length;i++)
        {
            if(a[i]<0||a[i]>100){
                return "-1";
            }
            else{
               sum = sum + a[i];
            }
        }
        avg = sum/length;
        average = Double.toString(avg);
        return average+ "0";
    }

}
