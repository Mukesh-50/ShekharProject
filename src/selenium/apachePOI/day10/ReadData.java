package selenium.apachePOI.day10;

import Utility.ExcelDataProvider;

public class ReadData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ExcelDataProvider data=new ExcelDataProvider();
		
		// this method will read data from Sheet 1 and row 0 and col 0
		System.out.println("Data is"+data.getStringData(0, 0));
		
		
		System.out.println(data.getStringData("mydata",0,2));
		
		
		
		
	}

}
