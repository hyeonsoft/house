class a{
    private static double rate;
    public static double toDollar(double won){
        return won/rate;
    }
    public static double toKWR{double dollar){return dollar*rate;}
    public static void setRate(double r){rate=r;}
}
public class heyfinderrors{
    public static void main(String[] args){
        a.setRate(1113.58575);
        System.out.println("1000000won = "+a.toDollar(1000000.0));
        System.out.println("100Dollars = "+a.toKWR(100.0));
    }
}
