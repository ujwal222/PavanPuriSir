package String;

public class a3 {

	public static void main(String[] args) 
	{
		
		String a= "thiswweiswweindia";
		
		String[] s = a.split("wwe");
		for(int i=0; i<s.length; i++)
		{
			System.out.println(s[i]);
		}
		
	}
}
