package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test1 {

	
	public static void main(String[] args) throws EncryptedDocumentException,IOException 
	{		
		//To reach upto Excelsheet	
	FileInputStream file=new FileInputStream("D:\\Baliraj\\Baliraj SW TESTING\\Notes\\automation\\Parameterization\\raj.xlsx");
		
		//To Open Excelsheet
	Workbook S1=WorkbookFactory.create(file);
		
		//To Enter perticular sheet
	   Sheet  S2=S1.getSheet("Sheet1");
	
	   //To highlight Row
	     Row  S3=S2.getRow(0);
	
		//to highlight Cell/Column
	  Cell	S4=S3.getCell(0);
	     
	   //To get/fetch/retrieve/read data
	 String  S5=S4.getStringCellValue();  //abc
	  
	  System.out.println(S5);
	  
	  
	     
	}
	
}
