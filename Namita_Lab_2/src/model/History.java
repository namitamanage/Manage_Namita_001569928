/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author namita
 */
public class History {
    
    private ArrayList<Vehicle> history;
    private Date last_Updated;
    
    public Date getLast_Updated() {
        if (last_Updated == null || last_Updated.equals("")){
                Date date = new Date();  

   return last_Updated = date;
        }
        return last_Updated;
    }

    public void setLast_Updated(Date last_Updated) {
        this.last_Updated = last_Updated;
    }
    public History(){
        this.history=new ArrayList<Vehicle>();
    }
    public ArrayList<Vehicle> getCatalog() {
        return history;
    }

    public void setCatalog(ArrayList<Vehicle> catalog) {   
        this.history = catalog;
    }
    public Vehicle addNewCar() {
        Vehicle newCars=new Vehicle();
        history.add(newCars);
        return newCars;
    }
    public void deleteCar(Vehicle car){
        history.remove(car);
    }

    
    
    
    
}
