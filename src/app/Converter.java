package app;

public class Converter {
    private static final double CONV_K = 1.609;
    public static void main(String[] args) {
        System.out.println("Distance conversion app");
        double mil=10;
        double km=15;
        double killometres = convMiltoKm(mil);
        double miles = convKmtoMil(km);
        System.out.println("Miles to km is " +killometres+ " / Km to miles " +miles);
    }
    public static double convMiltoKm(double mil){
        return mil*CONV_K;
    }
    public static double convKmtoMil(double km){
        return km/CONV_K;
    }

}
