public class HornerSchema {
    
    public static double evalSimple(double[] a, double x)
    {
        double sum= 0;
        
        for(int i=0; i<a.length; i++){

            sum += a[i] * Math.pow(x, i);
           
        }

        return sum;
    }

    public static double evalHorner(double[] a, double x)
    {
        double sum= 0;
        for(int i=a.length-1; i>0; i--){

            sum += a[i];
            sum *= x;
           
        }
        return sum;
    }

    public static double evalHornerRec(double[] a, double x) {
        if (a.length == 1) return a[0];
        return a[a.length - 1] + x * evalHornerRec(java.util.Arrays.copyOf(a, a.length - 1), x);
    }


    public static void main(String[] args) {
        double[] coefficients = {2, -6, 3, 5};
        double x = 5;

        System.out.println("Simple: " + evalSimple(coefficients, x));
        System.out.println("Horner: " + evalHorner(coefficients, x));
        System.out.println("HornerRec: " + evalHornerRec(coefficients, x));
    }
}
