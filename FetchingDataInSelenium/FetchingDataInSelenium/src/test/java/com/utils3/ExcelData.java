package com.utils3;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;

public class ExcelData {

    public static String getData(String filepath, String sheetname, int rn, int cn)
    {
        try
        {
            FileInputStream fis = new FileInputStream( filepath );
            Workbook wb = WorkbookFactory.create( fis );
            Row r = wb.getSheet( sheetname ).getRow( rn );
            String Data = r.getCell( cn ).getStringCellValue();
            return Data;
        }
        catch (Exception E)
        {
            return " ";
        }
    }
}
