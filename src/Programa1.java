public class Programa1 {
    public static void main(String[] args) {

        double pirma = 15;
        double antra = 6;
        double trecia = 6;


        boolean arTinka = arTinkaIlgiai(pirma, antra, trecia);
        boolean arTinka1 = arTinkaIlgiai(antra, pirma, trecia);
        boolean arTinka2 = arTinkaIlgiai(trecia, pirma, antra);

        boolean arGalimas= arGalimasTrikampis(arTinka, arTinka1, arTinka2);





        System.out.println("Ar tenkinama salyga = " + arTinka);
        System.out.println("Ar tenkinama salyga = " + arTinka1);
        System.out.println("Ar tenkinama salyga = " + arTinka2);

        System.out.println("Ar galimas toks trikampis = " + arGalimas);

    }

    public static boolean arTinkaIlgiai(double a, double b, double c) {
        return (a < b + c);
    }
    public static boolean arGalimasTrikampis(boolean a, boolean b, boolean c){
        
        return a == b == c;

    }     

}
