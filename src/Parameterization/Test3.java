package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test3 {
	
	//how to get/fetch/retrieve/read data from excelsheet 
	
	 public static void main(String[] args) throws EncryptedDocumentException, IOException 
	 {

		 
			//To reach upto Excelsheet	

		 FileInputStream  file=new FileInputStream("D:\\Baliraj\\Baliraj SW TESTING\\Notes\\automation\\Parameterization\\raj.xlsx");
		 
		 
		 double value=WorkbookFactory.create(file).getSheet("Sheet2").getRow(0).getCell(0).getNumericCellValue();
		 
		 System.out.println(value);//1122
		 
		 
	}

}
