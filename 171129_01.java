abstract class Calculator{
    public abstract int add(int a, int b);
    public abstract int subtract(int a, int b);
    public abstract double average(int[] a);
}

class Clac extends Calculator{
    public int add(int a, int b){
        return a+b;
    }
    public int subtract (int a, int b){
        return a-b;
    }
    public double average(int[] a){
        double sum=0;
        for(int i=0; i<a.length; i++){
            sum+=a[i];
            
        }
        sum=sum/a.length;
        return sum;
    }
    public static void main(String[] args){
        Calculator c=new Clac();
        System.out.println(c.subtract(2,3));
        int a[]={3,3,5,3,42,24};
        System.out.println(c.average(a));
        System.out.println(c.add(234,423));
    }
}
