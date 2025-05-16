package genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	public String getStringDataFromExcel(String sheetName,int rowindex,int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(rowindex).getCell(colIndex).getStringCellValue();	
	}
	
	public double getNumberDataFromExcel(String sheetName,int rowindex,int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(rowindex).getCell(colIndex).getNumericCellValue();	
	}
	
	public boolean getBooleanDataFromExcel(String sheetName,int rowindex,int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(rowindex).getCell(colIndex).getBooleanCellValue();	
	}
	
	public LocalDateTime getDateFromExcel(String sheetName,int rowindex,int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(rowindex).getCell(colIndex).getLocalDateTimeCellValue();	
	}
	
}
