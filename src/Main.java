public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        Main.addEmployee("Иванов", "Иван", "Иванович", "1", 89765);
        Main.addEmployee("Уткина", "Елена", "Валерьевна", "3", 98648);
        Main.addEmployee("Касаткин", "Константин", "Витальевич", "5", 87564);
        Main.addEmployee("Павлов", "Павел", "Павлович", "1", 86578);
        Main.addEmployee("Каваленеко", "Максим", "Владимирович", "2", 75963);
        Main.addEmployee("Наумова", "Лера", "Павловна", "3", 68562);
        Main.addEmployee("Петров", "Петр", "Петрович", "4", 79634);
        Main.addEmployee("Иванова", "Нина", "Григорьевна", "5", 84324);
        Main.addEmployee("Куркин", "Андрей", "Сергеевич", "2", 86436);
        Main.addEmployee("Фролова", "Вера", "Анатольевна", "4", 78935);
    }
    Employee[] employees;
    int size;
    public void addEmployee(String employeeLastName, String employeeName, String employeeSurName, String employeeDepartment, int employeePay) {


        if (size >= employees.length) {
            System.out.println("Мест нет");
        }
        Employee newEmployee = new Employee(employeeLastName, employeeName, employeeSurName, employeeDepartment, employeePay);
        employees[size++] = newEmployee;
    }
    public void paySum(){
        int sum = 0;
        for (int i = 0;i<size;i++) {
            Employee employee = null;
            int payEmployee = employee.getPayEmployee();
            sum = payEmployee;
        }
        System.out.println(sum);
    }
}