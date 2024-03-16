public class Student {
    private String name;
    private int age;
    private String grade;

    
    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }

    
    public static void main(String[] args) {
        
        Student student1 = new Student("Omkar Patil",23,"A");

       
        student1.displayDetails();
    }
}
