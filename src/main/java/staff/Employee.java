package staff;

public abstract class Employee {
    String name;
    String ni;
    double salary;

    public Employee(String name, String ni, double salary){
        this.name = name;
        this.ni = ni;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNi() {
        return ni;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double salaryIncrease) {
        if (salaryIncrease > 0) {
            this.salary += salaryIncrease;
        }
    }

    public double payBonus(){
        return this.salary/100;
    }

    public void setName(String newName) {
        if (newName != null) {
            this.name = newName;
        }
    }


}
