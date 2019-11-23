/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.net.URISyntaxException;
import java.text.ParseException;
import java.util.List;
import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;
import net.sourceforge.jFuzzyLogic.rule.Variable;

/**
 *
 * @author namig
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws URISyntaxException, ParseException {
        
        DataReader reader = new DataReader();
        //Read dataset
        List<Model> modelList = reader.ReadDataToModel();
        
        Predict predictions = new Predict();
        
        //Average the absolute error in the predictions.
        predictions.test_predictions_error(modelList);
        
        //Membership functions chart
        JFuzzyChart.get().chart(predictions.getModel());
        
        //
        Variable HousePrice = predictions.getModel().getVariable("HousePrice");
        JFuzzyChart.get().chart(HousePrice, HousePrice.getDefuzzifier(), true);        
    }
    
}
