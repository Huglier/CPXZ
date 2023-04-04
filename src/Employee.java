public class Employee {
    private  static  int counter = 1;
    private int id;
    private String lastName;
    private String name;
    private String surName;
    private int department;
    private int payEmployee;

    public Employee(String lastName, String name, String surName, int department, int payEmployee) {
        this.id = counter++;
        this.lastName = lastName;
        this.name = name;
        this.surName = surName;
        this.department = department;
        this.payEmployee = payEmployee;

    }


    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getDepartment() {
        return department;
    }

    public int getPayEmployee() {
        return payEmployee;
    }

    public int getCounter() {
        return counter;
    }

    public void setDepartment() {
        this.department = department;
    }

    public void setPayEmployee() {
        this.payEmployee = payEmployee;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", department='" + department + '\'' +
                ", payEmployee=" + payEmployee +
                '}';
    }
}

