public class Employee {
    
    public double calculateBonus(int yearsOfService) {
        return yearsOfService * 1000.0;
    }

    
    public double calculateBonus(double performanceRating) {
        return performanceRating * 5000.0; 
    }

    
    public double calculateBonus(String designation) {
        switch (designation.toLowerCase()) {
            case "manager":
                return 10000.0; 
            case "developer":
                return 5000.0; 
            case "intern":
                return 1000.0; 
            default:
                return 0.0; 
        }
    }

    
    public static void main(String[] args) {
       
        Employee employee = new Employee();

        
        System.out.println("Bonus based on years of service (5 years): $" + employee.calculateBonus(5));

        System.out.println("Bonus based on performance rating (4.5): $" + employee.calculateBonus(4.5));

        System.out.println("Bonus based on designation (developer): $" + employee.calculateBonus("Developer"));
    }
}
