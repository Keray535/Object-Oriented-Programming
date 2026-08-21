public class TroubleMaker {
    public static boolean kannIchAusschlafen(boolean istWochentag, boolean sindFerien) {
        return istWochentag =! sindFerien;
    }

    public static boolean binIchInGefahr(boolean ersterAffe, boolean zweiterAffe) {
        return ersterAffe == zweiterAffe;
    }

    public static boolean verraetMichDerPapagei(boolean istAmReden, int uhrzeit) {
        return istAmReden && (uhrzeit>=20 || uhrzeit<7);
    }

}