public class SalesRevenue{
	public static void main(String[] args){
		int Arr[][] = {{351,21,651,321},{561,351,846,265},{3223,165,324,819}};
		double sum=0;
		for(int i=0;i<Arr.length;i++){
			for(int j=0; j<Arr[i].length;j++)sum+=Arr[i][j];
		}
		System.out.println("Sum : "+ sum +" avg : "+sum / Arr.length) ;
	}
}
