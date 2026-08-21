import java.util.Arrays;
import java.lang.Math;;

public class RandomIntArray {
    
    public static int[] createRandom(int n){
        
        int[] feld = new int[n];

        for(int i = 0; i<n; i++)
        {
            feld[i]= (int)(100*Math.random()) + 5;
        }

        return feld;
    }


    public static String toString(int[] a){

        if(a.length == 0){return "[]";}

        String stringFeld = "[";

        for(int i = 0; i<a.length; i++)
        {
            stringFeld += a[i];
            if(i<a.length-1){stringFeld += ",";}
        }
        stringFeld += "]";
        return stringFeld;
    }

    // -------------------------------Mit StringBuilder----------------------------
    /*    public static String toString(int[] a) {
        StringBuilder sb = new StringBuilder("[");
        
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
            if (i < a.length - 1) {
                sb.append(", ");
            }
        }
        
        sb.append("]");
        return sb.toString();
    }*/
    // -------------------------------Mit StringBuilder----------------------------

    public static int posMin(int[] a){

        int minStelle = 0;

        for(int i = 0; i<a.length; i++){
            if(a[minStelle] > a[i]){ minStelle = i;}
        }

        return a[minStelle];
    }

    public static void swap(int[] a){
        int temp = a[0];
        a[0] = a[a.length - 1];
        a[a.length - 1] = temp;
    }

    public static void main(String[] args) {
        int[] array = createRandom(8);
        System.out.println(toString(array));
        System.out.println(posMin(array)); 
        swap(array);
        System.out.println(toString(array)); 
    }
}
