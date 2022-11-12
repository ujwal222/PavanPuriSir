package String;

import java.util.Arrays;

public class a1 {
	
	public static void water(String a)
	{
	 String s=" ";
	 for(int i=a.length()-1; i>=0; i--)
	 {
		 s=s+a.charAt(i);
	 }
	 System.out.println(s);
	}
	
 public static void main(String[] args) {
	
	a1.water("trees");
	 
}
 
}
