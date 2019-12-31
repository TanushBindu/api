package Test_request;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_driven 
{
	@DataProvider(name="empdataprovider")
	 String[][]getemp()throws IOException
	{
		String path = System.getProperty("./API_PROJECT/Excel/Data1.xlsx");
		int rownum = XLUtils.getRowCount(path, "Sheet1");
		int colnum = XLUtils.getCellCount(path, "Sheet1", 1);
		String empdata[][]= new String[rownum][colnum];
		for (int i = 1; i <=rownum; i++) 
		{
			for (int j = 0; j < empdata.length; j++) 
			{
				empdata[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);
			}
		}
		return (empdata);
	}

	public static void main(String[] args) throws IOException 
	{
		System.out.println(new Data_driven().getemp());
	}
}
