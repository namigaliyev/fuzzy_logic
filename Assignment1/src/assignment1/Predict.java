/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.io.File;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import net.sourceforge.jFuzzyLogic.FIS;

/**
 *
 * @author namig
 */
public class Predict {
    private FIS fis;
    private double MAPE = 0;
    private double length = 0;    
    private double counter = 0;
    
    public Predict() throws URISyntaxException {
        File dosya = new File(getClass().getResource("model.fcl").toURI());
        fis = FIS.load(dosya.getPath(),true);
    }
    
    //Model testing and calculating tolerance.
    //Using MAPE tolerance method.
    public void test_predictions_error(List<Model> modelList) throws URISyntaxException, ParseException {
        
        for(Model item: modelList) {
            //Set model variables
            fis.setVariable("NumberOfConvenience", item.getConvenience());
            fis.setVariable("Age", item.getAge());
            fis.setVariable("MRTDistance", item.getMRTDistance());
            
            fis.evaluate(); 
            if(item.getHousePrice() != 0)
            {   
                MAPE += Math.abs((item.getHousePrice() - fis.getVariable("HousePrice").getValue()) / item.getHousePrice());
                
                System.out.print("Price Prediction: " + fis.getVariable("HousePrice").getValue());
                System.out.println("REAL price:" + item.getHousePrice() + " Convenience:" + item.getConvenience() + " Age:" + item.getAge() + " MRTDistance:" + item.getMRTDistance());            
            }
        }
        
        length = modelList.size();
        
        System.out.println("MAPE: %" + 100/length * MAPE);
    }
    
    public FIS getModel() {
        return fis;
    }
}
