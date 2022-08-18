/* 
 * Welcome. In this kata, you are asked to square every digit of a number and concatenate them.
 * For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.
 * Note: The function accepts an integer and returns an integer
 */

package codewars;

public class CodeWars {
	static int squareDigits(int n) {
		
		String result = "";
		//convert integer to string to break down into each number.
		String s = Integer.toString(n);
		//iterate String  
		for(int i=0; i<s.length(); i++) {
			//covert character to integer to square 
			int temp = Integer.parseInt(String.valueOf(s.charAt(i)));
			result += Integer.toString(temp * temp);
		}
		
		return Integer.parseInt(result);
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(squareDigits(9119));
	}
}
