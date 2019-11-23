/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Model {;
    
    private double NumberOfConvenience;
    private double Age;
    private double MRTDistance;
    private double HousePrice;

        
    
    public void setConvenience(double NumberOfConvenience){
        this.NumberOfConvenience = NumberOfConvenience;
    }
    
    public void setAge(double Age){
        this.Age = Age;
    }
    
    public void setMRTDistance(double MRTDistance){
        this.MRTDistance = MRTDistance;
    }
    
    public void setHousePrice(double HousePrice){
        this.HousePrice = HousePrice;
    }
    
    public double getConvenience() {
        return NumberOfConvenience;
    }
    
    public double getAge() {
        return Age;
    }
    
    public double getMRTDistance() {
        return MRTDistance;
    }
    
    public double getHousePrice() {
        return HousePrice;
    }
}
