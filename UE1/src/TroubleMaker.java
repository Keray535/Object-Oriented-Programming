public class TroubleMaker {
    public static boolean kannIchAusschlafen(boolean sindFerien, boolean istWochentag){
        return istWochentag =! sindFerien;
    }

    public static boolean binIchInGefahr(boolean ersterAffe, boolean zweiterAffe){
        return ersterAffe == zweiterAffe;
    }

    public static boolean verraetMichDerPapagei(boolean istRedet, int uhrzeit){
        return   (uhrzeit>=20 || uhrzeit<7) && istRedet;
    }

}
