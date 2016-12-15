import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readexcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File src = new File("C:\\Users\\umpfernando\\Downloads\\testdata.xlsx");
		
		FileInputStream fis =new FileInputStream(src);
		
		//change it to xss type (load the excel sheet)
		XSSFWorkbook xsf = new XSSFWorkbook(fis);
		
		
		//HSSFWorkbook hsf = new HSSFWorkbook(fis); is neede to read .xls 
		
		XSSFSheet sheet1 = xsf.getSheetAt(0);
		
		//getting rows and columns
		
		int rowcount = sheet1.getLastRowNum();
		
		for(int i=1;i<=rowcount;i++)
		{
			
					String data0 = sheet1.getRow(i).getCell(0).getStringCellValue(); 
					String data1 = sheet1.getRow(i).getCell(1).getStringCellValue();
					System.out.println("username "+data0);
					System.out.print("password "+data1);
					System.out.println("\n");
			
			
		}
	   
		xsf.close();
		
		
	}

}
