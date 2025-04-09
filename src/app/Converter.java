package app;

public class Converter {
    private static final double CONV_K = 1.609;
    public static void main(String[] args) {
        System.out.println("Distance conversion app");
        double mil=10;
        double km = convMiltoKm(mil);
        System.out.println("Result is " +km);
    }
    public static double convMiltoKm(double mil){
        return mil*CONV_K;
    }

}
