public class Employee {
    int counter;
    String lastName;
    String name;
    String surName;
    String department;
    int payEmployee;

    public Employee(String lastName, String name, String surName, String department, int payEmployee) {

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

    public String getDepartment() {
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
    public static int counter(){
        int id = 0;
        for (int i = 0; i <10; i=i+1){
            id = id+1;
        }
        return id;
    }
}

