

import java.util.*;

//No error checking assumes all is 3 digit input

public class SessionOneEx1 {

	public static void main(String[] args) {
	
		String d1;
		Scanner sc = new Scanner(System.in);

		d1 = sc.nextLine();
		
		while (!d1.equals("-1")) {
			// read d2, d3 and compute hidden digit
			System.out.println(ex1(rmvSpaces(d1)));
			
			d1 = sc.nextLine();
		}
		
//		System.out.println(ex1("308"));
	}
	
	
	public static String rmvSpaces (String args){
		
		String outString = "";
		
		for(int i = 0; i < args.length(); i++){
			if(args.charAt(i) != ' '){
				outString += args.charAt(i);
			}
		}
		
		return outString;
		
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
