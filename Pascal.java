

public class Pascal{
	
	public static void main(String args[]){
		
		//System.out.println(factortial(Integer.parseInt(args[0])));
		pascal(Integer.parseInt(args[0]));
		
	}
	
	static int factortial(int n){
		if(n<=1)
			return 1;
		int result=n*factortial(n-1);
		return result;
	}
	
	static int pascal(int row){
		for(int n =0; n<row+1;n++){
			int rowFac =factortial(row);
			int numberFac=factortial(n);
			int rownumFac=factortial(row-n);
			int nCr =rowFac/(rownumFac*numberFac);	
			System.out.println(nCr);
		}
		return 0;
	}
}