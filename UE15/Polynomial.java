public class Polynomial {
    
    private int degree; // highest power of x
    private double[] coeffs; // Array with coefficients, all coefficients [0..degree] are necessary
    
    public Polynomial(double[] c) {
                this.coeffs = c;
                this.degree = c.length-1;
    }
    
    public int getDegree(){
        return degree;
    }
    
    public double[] getAllCoefficients(){   
        return coeffs.clone(); 
    }
        
    public double getCoefficient(int i){

        if(i>=0 && i<= degree)
        {
            return coeffs[i];
        }else
        return 0.0;    
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = degree; i >= 0; i--) {
            double coef = coeffs[i];
            if (coef == 0) continue;
            if (sb.length() > 0 && coef > 0) sb.append("+");
            if (i == 0) sb.append(coef);
            else if (i == 1) sb.append(coef + "*x");
            else sb.append(coef + "*x^" + i);
        }
        return sb.toString();
    }

    public double evaluate(double x) {
        double result = 0;
        for (int i = degree; i >= 0; i--) {
            result = result * x + coeffs[i];
        }
        return result;
    }

    
    public Polynomial differentiate() {
        double[] temp = {};
        temp = new double[coeffs.length-1];

        if(degree == 0) return new Polynomial(new double[]{0});
        for(int i=1; i<coeffs.length; i++)
        {
        temp[i-1] = coeffs[i] * i;
        }
        return new Polynomial(temp);
    }

    public Polynomial add(Polynomial other) {
        int maxDegree = Math.max(this.degree, other.getDegree());
        double[] newCoeffs = new double[maxDegree + 1];
        for (int i = 0; i <= maxDegree; i++) {
            newCoeffs[i] = this.getCoefficient(i) + other.getCoefficient(i);
        }
        return new Polynomial(newCoeffs);
    }


    
    public static void main(String[] args) {
        Polynomial p1 = new Polynomial(new double[]{-1, 3, 1}); // x^2 + 3x - 1
        Polynomial p2 = new Polynomial(new double[]{2, 0, 4, 3, 1});  // 4x^2 + 2
        Polynomial p3 = new Polynomial(new double[]{});

        System.out.println("p1(x): " + p1);
        System.out.println("p2(x): " + p2);
        System.out.println(p3);

        System.out.println("p1(2): " + p1.evaluate(2));
        System.out.println("p1'(x): " + p1.differentiate());
        System.out.println(p3.differentiate());

        System.out.println("p2(2): " + p2.evaluate(2));
        System.out.println("p2'(x): " + p2.differentiate());

        Polynomial sum = p1.add(p2);
        System.out.println("p1 + p2: " + sum);
    }
}