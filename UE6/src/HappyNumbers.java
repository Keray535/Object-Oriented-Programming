import java.util.HashSet;

public class HappyNumbers {

    public static boolean isHappy(int n) {

        HashSet<Integer> seen = new HashSet<>(); // für die Speicherung der gefundenen Zahlen

        while (n != 1 && !seen.contains(n)) { 
            seen.add(n); 
            
            int result = 0;
            while (n > 0) {
                int ziff = n % 10;
                result += ziff * ziff;
                n /= 10;
            }
            n = result; 
        } 
        return n == 1; 
    }

    	
    public static int nextHappyNumber(int n){

        while(!isHappy(n))
        {
            n++;
        }
        return n;
    }

    public static void main(String[] args) {
        
        System.out.println(isHappy(23)); 
        System.out.println(nextHappyNumber(23)); 
        System.out.println(isHappy(2));  
        System.out.println(nextHappyNumber(2));  
    }
}

