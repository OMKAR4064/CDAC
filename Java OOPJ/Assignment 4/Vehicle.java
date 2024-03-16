public class Vehicle {
    private String make;
    private String model;
    private int year;

    
    public void setVehicleInfo() {
        make = "Unknown";
        model = "Unknown";
        year = 0;
    }

    
    public void setVehicleInfo(String make) {
        this.make = make;
        this.model = "Unknown";
        this.year = 0;
    }

    
    public void setVehicleInfo(String make, String model) {
        this.make = make;
        this.model = model;
        this.year = 0;
    }

    
    public void setVehicleInfo(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    
    public void displayVehicleInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println();
    }

   
    public static void main(String[] args) {
       
        Vehicle vehicle = new Vehicle();

        
        vehicle.setVehicleInfo();
        vehicle.displayVehicleInfo();

        vehicle.setVehicleInfo("Mercedes");
        vehicle.displayVehicleInfo();

        vehicle.setVehicleInfo("Audi", "Audi A4");
        vehicle.displayVehicleInfo();

        vehicle.setVehicleInfo("Lamborghini", "Aventador", 2014);
        vehicle.displayVehicleInfo();
    }
}
