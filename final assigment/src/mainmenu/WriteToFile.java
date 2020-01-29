package mainmenu;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import newpatient.newpatientinfo1;

public class WriteToFile {

	private static Workbook book;

	private static Sheet sheet;

	private static FileInputStream fis;

	private static FileOutputStream fos;

	private static Row row;

	private static Cell cell;

	public WriteToFile() {
	}

	public static Workbook getBook() {
		return book;
	}

	public static void setBook(Workbook book) {
		WriteToFile.book = book;
	}

	public static Sheet getSheet() {
		return sheet;
	}

	public static void setSheet(Sheet sheet) {
		WriteToFile.sheet = sheet;
	}

	public static FileInputStream getFis() {
		return fis;
	}

	public static void setFis(FileInputStream fis) {
		WriteToFile.fis = fis;
	}

	public static FileOutputStream getFos() {
		return fos;
	}

	public static void setFos(FileOutputStream fos) {
		WriteToFile.fos = fos;
	}

	public static Row getRow() {
		return row;
	}

	public static void setRow(Row row) {
		WriteToFile.row = row;
	}

	public static Cell getCell() {
		return cell;
	}

	public static void setCell(Cell cell) {
		WriteToFile.cell = cell;
	}

	public static void writeDataToFile(newpatientinfo1 abs) throws EncryptedDocumentException, IOException, InvalidFormatException {
		try {
			fis = new FileInputStream("./clinick.xlsx");
			book = WorkbookFactory.create(fis);
			sheet = book.getSheet("newpationt");
			int noRow = sheet.getLastRowNum();
			System.out.println("Reg Row count = " + noRow);
			row = sheet.createRow(1);
			cell = row.createCell(0);
			cell.setCellValue(abs.getName());
			cell = row.createCell(1);
			cell.setCellValue(abs.getIdnum());
			cell = row.createCell(2);
			cell.setCellValue(abs.getPhone());
			cell = row.createCell(3);
			cell.setCellValue(abs.getHealthcondition());
			cell = row.createCell(4);
			cell.setCellValue(abs.getMstaus());
			fos = new FileOutputStream("./clinick.xlsx");
			book.write(fos);
			fos.flush();
			fos.close();
			System.out.println("Saved data newpatientinfo1 successfully");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}


}
