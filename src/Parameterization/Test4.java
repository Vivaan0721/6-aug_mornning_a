package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test4 {

	
	//how to get/fetch/retrieve/read data from excelsheet 
	
	 public static void main(String[] args) throws EncryptedDocumentException, IOException 
	 {

		 
			//To reach upto Excelsheet	

		 FileInputStream  file=new FileInputStream("D:\\Baliraj\\Baliraj SW TESTING\\Notes\\automation\\Parameterization\\raj.xlsx");
		 
		 
		 boolean value=WorkbookFactory.create(file).getSheet("Sheet3").getRow(0).getCell(0).getBooleanCellValue();
		 
		 System.out.println(value);//1122
		 
		 
	}
}
