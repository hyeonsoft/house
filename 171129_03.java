public class a{
    public static void main(String[] args){
        Integer i=new Integer(10);
        char c='4';
        Double d=new Double(3.1415926535897932384626);
        System.out.println(Character.toLowerCase('A'));
        if(Character.isDigit(c))System.out.println(Character.getNumericValue(c));
        System.out.println(Integer.parseInt("-2147483647"));
        System.out.println(Integer.toBinaryString(28));
        System.out.println(Integer.toHexString(28));
        System.out.println(i.doubleValue());
        System.out.println(d.toString());
        System.out.println(Double.parseDouble("44.13e-6"));
        
        
        int e=10;
        Integer intObject = i;
        System.out.println("intObject = "+intObject);
        i=intObject+10;
        System.out.println("i = "+i);
    }
}
