public class Summerfeeling {
    public static boolean eisEisBaby(int temperatur1, int temperatur2)
    {
        boolean eis = (temperatur1<=0 && temperatur2>=63 && temperatur2 <= 92);
        boolean kirchen = (temperatur2<=0 && temperatur1>=63 && temperatur1 <= 92);
        return eis || kirchen;
    }

    public static boolean tooTeentoEatCoolIce(int x, int y, int z)
    {
        boolean Person1 = (x>=13 && x<=19);
        boolean Person2 = (y>=13 && y<=19);
        boolean Person3 = (z>=13 && z<=19);

        return !(Person1 || Person2 || Person3);
    }

    public static int freeIceCream(int dieZahlDesEisverkaeufers) 
    {
        int vorletzteStelle = (dieZahlDesEisverkaeufers/10) % 10;
        int x = 2*dieZahlDesEisverkaeufers + 1;

        while(x % 10 == 0 || (x/10) % 10 != vorletzteStelle){

            x++;
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println(eisEisBaby(-3, 28));
        System.out.println(eisEisBaby(74, -4));
        System.out.println(eisEisBaby(90, 2));
        System.out.println(tooTeentoEatCoolIce(23, 40, 15));
        System.out.println(tooTeentoEatCoolIce(52,36, 44));
        System.out.println(tooTeentoEatCoolIce(18, 15, 17));
        System.out.println(freeIceCream(155));
        System.out.println(freeIceCream(301));
    }
}



