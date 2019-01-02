package Jan2018;

//this exercise creates a class called employee and calculates their  bonus
public class Employee {
    private String name;
    private boolean isManager;
    private double salary;


    //constructor:
    public Employee(String name, boolean isManager, double salary) {
        super();
        this.name = name;
        this.isManager = isManager;
        this.salary = salary;
    }

    //getters and setters
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public boolean isManager(){
        return isManager;
    }

    public void setManager(boolean isManager){
        this.isManager = isManager;
    }

    public static double calculateBonus(int percentage, boolean isManager, double salary){
       double bonus;
        if (isManager){
            bonus = salary * percentage/100 + 1000;
        }
        else{
            bonus = salary * percentage/100;
        }
        return bonus;
    }


    public static void main(String[] args){

       Employee mariusKazickas = new Employee("Marius Kazickas", true, 3500);

       Double bonus = calculateBonus(15, mariusKazickas.isManager, mariusKazickas.salary);
       System.out.println("Employee "+mariusKazickas.name+ " gets " + mariusKazickas.salary + " and " + bonus + " bonus" );


    }
}
