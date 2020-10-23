package rec5;


public class Main {
	   public static String DigitToWord(int digitIn) { 
		   if(digitIn == 0) {
			   return "zero";
			   
		   }
		   if(digitIn == 1) {
			   return "one";
			   
		   }
		   if(digitIn == 2) {
			   return "two";
			   
		   }
		   if(digitIn == 3) {
			   return "three";
			   
		   }
		   if(digitIn == 4) {
			   return "four";
			   
		   }
		   if(digitIn == 5) {
			   return "five";
			   
		   }
		   if(digitIn == 6) {
			   return "six";
			   
		   }
		   if(digitIn == 7) {
			   return "seven";
			   
		   }
		   if(digitIn == 8) {
			   return "eight";
			   
		   }
		   if(digitIn == 9) {
			   return "nine";
			   
		   }
		   if(digitIn > 9 || digitIn <0) {
			   return "error";
			   
		   }
		   else {
			   return"";
		   }
	      
	   } 
	   
	   public static String TensDigitToWord(int digitIn) { 
		   
		   
		   
		   if(digitIn == 2) {
			   return "twenty";
			   
		   }
		   if(digitIn == 3) {
			   return "thirty";
			   
		   }
		   if(digitIn == 4) {
			   return "fourty";
			   
		   }
		   if(digitIn == 5) {
			   return "fifty";
			   
		   }
		   if(digitIn == 6) {
			   return "sixty";
			   
		   }
		   if(digitIn == 7) {
			   return "seventy";
			   
		   }
		   if(digitIn == 8) {
			   return "eighty";
			   
		   }
		   if(digitIn == 9) {
			   return "ninety";
			   
		   }
		   
		   if(digitIn > 9 || digitIn <2) {
			   return "error";
			   
		   }
		   else {
			   return"";
		   }
	      
	      
	   } 
	   
	   public static String TwoDigitNumToWords(int numIn) { 
		   String stringNum = Integer.toString(numIn);
		   int tens = Integer.parseInt(""+stringNum.charAt(0));
		   int ones = Integer.parseInt(""+stringNum.charAt(1));
	      return TensDigitToWord(tens) + " "+ DigitToWord(ones);
	      
	   } 
	   
	   public static void main(String[] args) {
	      //System.out.println(Main.DigitToWord(1));
	      //System.out.println(Main.TensDigitToWord(3));
	      //System.out.println(Main.DigitToWord(11));
	      //System.out.println(Main.TensDigitToWord(1));
	      System.out.println(Main.TwoDigitNumToWords(23));
	      // FINISH 
	      
	   }
	}
