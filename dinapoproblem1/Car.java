/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dinapoproblem1;

/**
 *
 * @author User
 */
public class Car {
    int num_doors;
    String brand;
    String model;

    public Car(int num_doors, String brand, String model) {
        this.num_doors = num_doors;
        this.brand = brand;
        this.model = model;
    }

    public int getNum_doors() {
        return num_doors;
    }

    public void setNum_doors(int num_doors) {
        this.num_doors = num_doors;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" + "num_doors=" + num_doors + ", brand=" + brand + ", model=" + model + '}';
    }

  
    
}

    
