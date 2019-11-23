/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author namig
 */
public class DataReader {
    private String fileName;
    
    public DataReader()
    {
        this.fileName = "estate.xls";
    }
    
    public List<Model> ReadDataToModel() throws URISyntaxException
    {
        List<Model> modelList = new ArrayList<Model>();
        try
        {
          
            File metroXLS = new File(getClass().getResource(fileName).toURI());
          
            FileInputStream file = new FileInputStream(metroXLS);

            HSSFWorkbook workbook = new HSSFWorkbook(file);

            HSSFSheet sheet = workbook.getSheetAt(0);
          
            Iterator<Row> rowIterator = sheet.iterator();
            Row row = rowIterator.next();
            int cellCount = 0;
            
            while (rowIterator.hasNext()) 
            {
                Model model = new Model();
                
                row = rowIterator.next();
                
                Iterator<Cell> cellIterator = row.cellIterator();
                while (cellIterator.hasNext()) 
                {
                    
                    Cell cell = cellIterator.next();
                    cellCount++;
                    if(cell.getCellType() == CellType.NUMERIC)
                    {
                        switch(cellCount)
                        {
                            case 1:
                                model.setConvenience(cell.getNumericCellValue());
                            break;
                            case 2:
                                model.setAge(cell.getNumericCellValue());
                            break;
                            case 3:
                                model.setMRTDistance(cell.getNumericCellValue());
                            break;
                            case 4:
                                model.setHousePrice(cell.getNumericCellValue());
                            break;
                        }
                    }
                }
                
                cellCount = 0;
                modelList.add(model);
            }
            
            file.close();
            
        } 
        catch (FileNotFoundException e) {
       
        } 
        catch (IOException e) {
        
        }
        return modelList;
    }
}
