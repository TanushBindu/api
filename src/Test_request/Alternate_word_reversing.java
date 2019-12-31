package Test_request;

public class Alternate_word_reversing 
{
	public static void main(String[] args) 
	{
		String s1 = "the java is programming";
		String [] ch = s1.split(" ");
		int n = ch.length;
		String s2 = "";
		for (int i = 0; i <n; i++) 
		{
			String s3 = ch[i];
			if (i%2==0) 
			{
				for (int j = s3.length()-1; j >=0; j--) 
				{
					s2 = s2+s3.charAt(j);
				}
			}
			else
			{
				s2 = s2 + " "+s3+" ";
			}
		}
		System.out.println(s2);
	}
}
