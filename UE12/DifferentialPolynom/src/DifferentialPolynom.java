import java.util.Arrays;

public class DifferentialPolynom {

    public static double[] diffPoly(double[] coeffs)
    {

        double[] temp = new double[coeffs.length-1];
        for(int i=1; i<coeffs.length; i++)
        {
        temp[i-1] = coeffs[i] * i;
        }
        return temp;
    }

    
    
    
    public static void main(String[] args) {

        double[] ary = {0};
        double[] result = diffPoly(ary);

        System.out.println(Arrays.toString(result));
             
    }

}
