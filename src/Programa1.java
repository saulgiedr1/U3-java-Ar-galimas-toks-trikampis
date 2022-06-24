public class Programa1 {
    public static void main(String[] args) {

        double pirma = 6;
        double antra = 6;
        double trecia = 12;


        boolean arTinka = arTinkaIlgiai(pirma, antra, trecia);
        boolean arTinka3 = arTinkaIlgiai(antra, pirma, trecia);
        boolean arTinka4 = arTinkaIlgiai(trecia, pirma, antra);



        System.out.println("Ar galimas toks trikampis = " + arTinka);
        System.out.println("Ar galimas toks trikampis = " + arTinka3);
        System.out.println("Ar galimas toks trikampis = " + arTinka4);

    }

    public static boolean arTinkaIlgiai(double a, double b, double c) {
        return (a < b + c);
    }





}
