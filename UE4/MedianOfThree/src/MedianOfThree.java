import java.util.Arrays;


public class MedianOfThree {
    public static int median(int a, int b, int c){

        if ((a >= b && a <= c) || (a >= c && a <= b)) {
            return a;
        } else if ((b >= a && b <= c) || (b >= c && b <= a)) {
            return b;
        } else {
            return c;
        }
    
    } 

    public static int median2(int a, int b, int c){
        int[] Zahlen = {a, b, c};
        Arrays.sort(Zahlen);
        return Zahlen[1];
    }

    public static double mean(int[] array){

        int sum = 0;

        for(int num : array){ sum += num;}
        return (double)sum / array.length;
    }

    public static void main(String[] args) {
        System.out.println(median(56, 67,99));
        System.out.println(median(84, 67,99));
        System.out.println(median(32, 76,51));

        System.out.println(median2(56, 67,99));
        System.out.println(median2(84, 67,99));
        System.out.println(median2(32, 76,51));

        int[] Zahlen = {12, 38, 39, 55, 64, 25, 16};

        System.out.println(mean(Zahlen));
        }
}



    
    
    