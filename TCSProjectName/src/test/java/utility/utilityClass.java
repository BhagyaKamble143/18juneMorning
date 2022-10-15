package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import BaseTest.baseClass;

public class utilityClass extends baseClass {
	
	static public void getScreenshort() throws IOException {
		   Date dt=new Date();
 		String S1=dt.toString().replace(' ', '_').replace(':', '-');
 	       File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 	       File Dest=new File ("C:\\Users\\hp\\Desktop\\Anuja"+S1+".jpg");
 	       FileHandler.copy(Source, Dest);
	}
 static public void paramerzation() throws EncryptedDocumentException, IOException {
	FileInputStream file =new FileInputStream("C:\\Users\\hp\\Documents\\loginCreadtials.xlsx");
	//WorkbookFactory.create(file);
	Workbook wb =WorkbookFactory.create(file);//RT workbook and prsent in wrkbkfactry
	 Sheet s1=wb.getSheet("Sheet1");//RT Sheet & present in WorkBook
	Row R=s1.getRow(0);//rt Row nd prsent in sheet
	 Cell C = R.getCell(0);
	 int row =s1.getLastRowNum();
     int cell=R.getLastCellNum();
	 for(int i=0;i<=cell-1;i++) {
	    	
			System.out.print(R.getCell(i));
			
	      }
}
}