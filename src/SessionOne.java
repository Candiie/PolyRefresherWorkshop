
public class SessionOne {

	public static void main(String[] args) {
		System.out.println(ex1("308"));
	}
	
	
	
	public static int ex1 (String args){
		
		int outNum = 0;
		int sum = 0;
		
		int[] inNum = {0,0,0};
		
		//Sum the integers
		for(int i = 0; i < 3; i++){
			
			inNum[i] = Integer.parseInt(Character.toString(args.charAt(i))); 
			sum += inNum[i];
		}
		
		//mod the num by 9 bcos all num is base 10 so adds up from 0 ~ 9 (max)
		int modNum = sum%9;
		
		//final answer
		outNum = 9 - modNum;
		
		
		return outNum;
		
	}

}
