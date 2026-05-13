package utils;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadXlFiles {
    public Object[][] readXlData(String path,String sheetName) throws IOException {

        FileInputStream file=new FileInputStream(path);
        XSSFWorkbook workbook=new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheet(sheetName);

        int numberOfRow = sheet.getLastRowNum();
        System.out.println("Number of rows : " + numberOfRow);

        int numberOfClo = sheet.getRow(0).getLastCellNum();


        System.out.println("Number of clos : " + numberOfClo);
        String[][] str = new String[numberOfRow][numberOfClo];


        for (int i = 0; i <numberOfRow; i++) {
            Row row = sheet.getRow(i+1);
            for (int j = 0; j < numberOfClo; j++) {
             str[i][j]=row.getCell(j).toString();
            }

        }

        return str;
    }
}
