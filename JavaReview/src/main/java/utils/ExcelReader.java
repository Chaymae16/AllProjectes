package review13;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utils.Constants;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelReader  {
    public static void main(String[] args) {
        var excelData=read(Constants.EXEL_FILE_PATH,"Sheet1");
        System.out.println(excelData);





    }



    public static List<Map<String,String>> read(String filePath,String sheetName){

        List<Map<String,String>> mapsList=new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream( filePath);
            XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
            Sheet sheet=xssfWorkbook.getSheet(sheetName);

            Row headerRow= sheet.getRow(0);
            int noOfRows= sheet.getPhysicalNumberOfRows();
            for (int i = 1; i <noOfRows ; i++) {
                Map<String,String> rowMap=new  LinkedHashMap<>();
                Row row=sheet.getRow(i);
                int noOfCells=row.getPhysicalNumberOfCells();
                for (int j = 0; j <noOfCells ; j++) {
                    String key=headerRow.getCell(j).toString();
                    String value=row.getCell(j).toString();
                    rowMap.put(key,value);
                }
                mapsList.add(rowMap);
            }
        }
        catch (IOException f) {
           f.printStackTrace();
        }

        return mapsList;
    }
}
