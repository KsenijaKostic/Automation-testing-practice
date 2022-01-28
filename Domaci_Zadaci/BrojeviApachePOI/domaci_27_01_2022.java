package Domaci.Domaci_Zadaci.BrojeviApachePOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class domaci_27_01_2022 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Xenia\\IdeaProjects\\SeleniumProjekat\\src\\test\\java\\Domaci\\Brojevi.xlsx");
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheet("Brojevi");
        XSSFRow row = sheet.getRow(0);
        XSSFCell cell = row.getCell(0);

        double suma = 0;
        for (int i = 0; i <= wb.getSheet("Brojevi").getLastRowNum(); i++){
            suma = suma + sheet.getRow(i).getCell(0).getNumericCellValue();
        }
        System.out.println(suma);

    }
}
