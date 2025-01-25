/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * The purpose of this class is to store details of Vitals. Setter and Getter methods have been provided
 * @author sravankumarkurapati
 * @version 1.0
 * @since 2025-01-24
 */
public class VitalSigns {

    String date;
    double bloodPressure; // We can store numbers with decimals in double datatype variable
    double temperature;
    int pulse; // We can store whole numbers in integer datatype variable

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    @Override
    public String toString() {
        return getDate();
    }

}
