package homework2take2;

import java.util.Scanner;
import java.util.LinkedList;


public class Exe {

	public static void main(String[] args) {
		
		DijakstrasStack<Integer> value = new DijakstrasStack<Integer>();
		DijakstrasStack<String> operator= new DijakstrasStack<String>();
		
		System.out.println("Enter an expression, note that the program only processes single-digit numbers : ");
		
		Scanner userInput = new Scanner(System.in);
		String expression= userInput.nextLine();
		
		for (int i=0; i< expression.length(); i++ ) {
			String transformer = expression.charAt(i) +"";
			
			if(transformer.contains("(")) continue;
			else if(transformer.equals("+")) operator.push(transformer);
			else if(transformer.equals("-")) operator.push(transformer);
			else if(transformer.equals("/")) operator.push(transformer);
			else if(transformer.equals("*")) operator.push(transformer);
			
			else if(transformer.equals(")")) {
				
			String oper = operator.pop();
			int val= value.pop();
			
		    if(oper.equals("+")) val= value.pop() + val;
		    else if(oper.equals("-")) val= value.pop() - val;
		    else if(oper.equals("*")) val= value.pop() * val;
		    else if(oper.equals("/")) val= value.pop() / val;
			value.push(val);
			}
		
			else value.push(Integer.parseInt(transformer));
		}

		System.out.println("Result is: "+value.pop());

}

}
