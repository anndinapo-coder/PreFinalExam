/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dinapoproblem1;

/**
 *
 * @author User
 */
public class Truck {
    int max_load;
    String brand;
    String model;

    public int getMax_load() {
        return max_load;
    }

    public void setMax_load(int max_load) {
        this.max_load = max_load;
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
        return "Truck{" + "max_load=" + max_load + ", brand=" + brand + ", model=" + model + '}';
    }
   
    
    
}
