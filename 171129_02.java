class Point {
    int x, y;
    
    public Point(int x, int y){
        this.x=x;this.y=y;
    }
    public String toString(){
        return "Point("+x+","+y+")";
        
    }
}
class Rectangular{
    int width;
    int height;
    public Rectangular(int width, int height){
        this.width=width; this.height=height;
    }
    public boolean equals(Rectangular p){
        if(width*height==p.width*p.height){
            return true;
        }else{
            return false;
        }
    }
}
public class ObjectProperty{
    public static void main(String[] args){
        Point a=new Point(2,3);
        Point b=new Point(2,3);
        Point c=a;
        System.out.println(a.toString());
        System.out.println(a==b);
        System.out.println(a==c);
        Rectangular u=new Rectangular(2,3);
        Rectangular d=new Rectangular(3,2);
        Rectangular f=new Rectangular(3,4);
        if(u.equals(d))System.out.println("u=d");
        if(d.equals(f))System.out.println("d=f");
        if(u.equals(f))System.out.println("u=f");
    }
}
