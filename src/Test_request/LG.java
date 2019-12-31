package Test_request;

import java.io.IOException;
import java.util.ArrayList;

public class LG 
{
	public static ArrayList<String> Get_all_one_by_one() throws IOException 
	{
		ArrayList<String> s2 = new ArrayList<String>();
		Tanush_EXCEL t1 = new Tanush_EXCEL();
		ArrayList<String> a2 = t1.get_endpoint();
		for (int i = 0; i < a2.size(); i++) 
		{
			if (i%2==1) 
			{
				 s2.add(a2.get(i));
			}
		}
		return s2;
	}
}
