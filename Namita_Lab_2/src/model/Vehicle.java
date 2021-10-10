/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author namita
 */
public class Vehicle {
    
    private String name;
    private String carMake;
    private boolean availability;    
    private int manufacturingYear;
    private byte seatCount;
    private String city;
    private String serialNumber;
    private String modelNumber;
    private boolean maintenanceExpired;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public int getManufacturingYear() {
        return manufacturingYear;
    }

    public void setManufacturingYear(int manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    public byte getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(byte seatCount) {
        this.seatCount = seatCount;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public boolean isMaintenanceExpired() {
        return maintenanceExpired;
    }

    public void setMaintenanceExpired(boolean maintenanceExpired) {
        this.maintenanceExpired = maintenanceExpired;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }


    @Override
    public String toString(){
    return name;
    }   

}
