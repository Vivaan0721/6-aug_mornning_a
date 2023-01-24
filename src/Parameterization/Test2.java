package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test2 {
	
	   //how to get/fetch/retrieve/read data from excelsheet 
	
 public static void main(String[] args) throws EncryptedDocumentException, IOException 
 {

	 
		//To reach upto Excelsheet	

	 FileInputStream  file=new FileInputStream("D:\\Baliraj\\Baliraj SW TESTING\\Notes\\automation\\Parameterization\\raj.xlsx");
	 
	 
	 String value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
	 
	 System.out.println(value);
	 
	 
}

}
