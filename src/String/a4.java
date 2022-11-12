package String;

public class a4 {

	public static void main(String[] args)
	{
		String s="ifsc12345@%$!hjsasuyyjbhxzhx";
		
		String v = s.replaceAll("[0-9 @ % ! $]", "");
		System.out.println(v);
		
	}
}
