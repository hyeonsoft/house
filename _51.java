public class _51 {
    
        int base;
        int exp;
        int getValue(){
            int res=1;
            for(int i=0;i<exp;i++){
                res=res*base;
            }
            return res;
        }
    public static void main(String[ ] args) {
        Playground n1=new Playground();
        n1.base=2;
        n1.exp=3;
        
        Playground n2=new Playground();
        n2.base=3;
        n2.exp=4;
        
        System.out.println("2^3="+n1.getValue());
        System.out.println("3^4="+n2.getValue());
        
    }
}
