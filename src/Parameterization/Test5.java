package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test5 {
	
	//how to get/fetch/retrieve/read data from excelsheet 
	
		 public static void main(String[] args) throws EncryptedDocumentException, IOException 
		 {

			 
				//To reach upto Excelsheet	

			 FileInputStream  file=new FileInputStream("D:\\Baliraj\\Baliraj SW TESTING\\Notes\\automation\\Parameterization\\raj.xlsx");
			 
			 String value=WorkbookFactory.create(file).getSheet("Sheet4").getRow(1).getCell(0).getStringCellValue(); //6456
				
				System.out.println(value);
				
			}

}
