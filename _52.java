public class _52 {
    int age;
    
    public static void main(String[] args){
        _52[] pa;
        pa = new _52[10];
        for(int i=0; i<pa.length;i++){
            pa[i]=new _52();
            pa[i].age=30+i;
        }
        
        for(int i=0; i<pa.length;i++){
            System.out.println(pa[i].age);
        }
    }

}

