import java.lang.Math;


public class Taschengeld {
    public static int verdoppeln(int ersteZahl, int zweiteZahl)
    {
        boolean istGleich = (ersteZahl == zweiteZahl);
        if (istGleich){
            return 2*(ersteZahl+zweiteZahl);
        }else{
            return ersteZahl+zweiteZahl;
        }
        
    }

    public static int differenz(int genannteZahl)
    {
        boolean istGroesser = (genannteZahl>21);
        int diff = Math.abs(genannteZahl-21);

        if (istGroesser){
            return 2*diff;
        }else{
            return diff;
        }
    }

    public static String verneinen(String input)
    {
        String verneint;
        if(input.startsWith("Nein")){
         verneint = input;   
         
        }else{
            verneint = "Nein! "+ input;
        }
        return verneint;
    }


    public static void main(String[] args) {
        
        System.out.println(verdoppeln(17,23));
        System.out.println(verdoppeln(28, 28));
        
        System.out.println(differenz(17));
        System.out.println(differenz(26));

        System.out.println(verneinen("Ich will."));
        System.out.println(verneinen("Nein, du darfst kein Fernsehen gucken!"));
    }
}
