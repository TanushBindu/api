package Test_request;

public class Sample 
{
	public static void main(String[] args) 
	{
		String s1 = "GAT#^@%#1318NS";
		int n = s1.length();
		String no = "";
		String cha = "";
		String alpa = "";
		for (int i = 0; i < n; i++) 
		{
			if (Character.isAlphabetic(s1.charAt(i))) 
			{
				alpa = alpa+s1.charAt(i);
			}
			else if (Character.isDigit(s1.charAt(i))) 
			{
				no = no+s1.charAt(i);
			}
			else
			{
				cha = cha+s1.charAt(i);
			}
		}
		System.out.println(no);
		System.out.println(cha);
		System.out.println(alpa);
	}
}
