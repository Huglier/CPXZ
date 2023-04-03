public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Иванов", "Иван", "Иванович", 1, 89765);
        employee[1] = new Employee("Уткина", "Елена", "Валерьевна", 3, 98648);
        employee[2] = new Employee("Касаткин", "Константин", "Витальевич", 5, 87564);
        employee[3] = new Employee("Павлов", "Павел", "Павлович", 1, 86578);
        employee[4] = new Employee("Каваленеко", "Максим", "Владимирович", 2, 75963);
        employee[5] = new Employee("Наумова", "Лера", "Павловна", 3, 68562);
        employee[6] = new Employee("Петров", "Петр", "Петрович", 4, 79634);
        employee[7] = new Employee("Иванова", "Нина", "Григорьевна", 5, 84324);
        employee[8] = new Employee("Куркин", "Андрей", "Сергеевич", 2, 86436);
        employee[9] = new Employee("Фролова", "Вера", "Анатольевна", 4, 78935);

        //Base 8.a
        printEmployee(employee);
        //8.b
        calculatedPaySum(employee);
        //8.c
        findMaxPayEmployee(employee);
        //8.d
        findMinPayEmployee(employee);
        //8.e
        calculatedMidlPaySum(employee);
        //8.f
        printNameEmployee(employee);
        //Increased difficulty 2.a
        findDeportmentMinPay(employee, 5);
        //2.b
        findDeportmentMaxPay(employee, 4);
        //2.c
        calculatedDeportmentMidlSumPay(employee, 1);
        //2.d
        calculatedDeportmentSumPay(employee, 4);
        //2.e
        indexationSalaryEmployee(employee, 1, 5);
        //2.f
        printAllEmployeeOnDeportment(employee, 2);
        //3.a
        findEmployeeMinNumber(employee, 80000);
        //3.b
        findEmployeeMaxNumber(employee, 80000);

    }

    public static void printEmployee(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            System.out.println(employee);
        }
    }

    public static void calculatedPaySum(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getPayEmployee();
        }
        System.out.println("Сумма трат на зарплаты сотрудников = " + sum + " рублей");
    }

    public static void findMaxPayEmployee(Employee[] employees) {
        int maxPay = Integer.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee.getPayEmployee() > maxPay) {
                maxPay = employee.getPayEmployee();

            }
        }
        System.out.println("Максимальная зарплата сотрудника составляет = " + maxPay + " рублей");
    }

    public static void findMinPayEmployee(Employee[] employees) {
        int maxPay = Integer.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee.getPayEmployee() < maxPay) {
                maxPay = employee.getPayEmployee();

            }
        }
        System.out.println("Минимальная зарплата сотрудника составляет = " + maxPay + " рублей");
    }

    public static void calculatedMidlPaySum(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getPayEmployee() / employees.length;

        }
        System.out.println("Средняя зарплата сотрудников составляет = " + sum + " рублей");
    }

    public static void printNameEmployee(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            System.out.println(employee.getLastName() + " " + employee.getName() + " " + employee.getSurName());
        }
    }

    public static void findDeportmentMinPay(Employee[] employees, int deportment) {
        int maxPay = Integer.MAX_VALUE;

        for (Employee employee : employees) {
            if (deportment == employee.getDepartment()) {
                if (employee.getPayEmployee() < maxPay) {
                    maxPay = employee.getPayEmployee();

                }
            }
        }
        System.out.println("Отдел : " + deportment + ", минимальная зарплата = " + maxPay + " рублей");
    }

    public static void findDeportmentMaxPay(Employee[] employees, int deportment) {
        int minPay = Integer.MIN_VALUE;
        for (Employee employee : employees) {
            if (deportment == employee.getDepartment()) {
                if (employee.getPayEmployee() > minPay) {
                    minPay = employee.getPayEmployee();

                }
            }
        }
        System.out.println("Отдел : " + deportment + ", максимальная зарплата = " + minPay + " рублей");
    }

    public static void calculatedDeportmentSumPay(Employee[] employees, int deportment) {
        int deportmentPaySum = 0;
        for (Employee employee : employees) {
            if (deportment == employee.getDepartment()) {
                deportmentPaySum += employee.getPayEmployee();
            }
        }
        System.out.println("Сумма затрат на зарплату = " + deportmentPaySum + " рублей, в отделе " + deportment);
    }

    public static void calculatedDeportmentMidlSumPay(Employee[] employees, int deportment) {
        int deportmentPay = 0;
        int numberEmployee = 0;
        for (Employee employee : employees) {
            if (deportment == employee.getDepartment()) {
                deportmentPay += employee.getPayEmployee();
                numberEmployee++;

            }
        }
        deportmentPay = deportmentPay / numberEmployee;
        System.out.println("Средняя сумма затрат на зарплату = " + deportmentPay + " рублей, в отделе " + deportment);
    }

    public static void indexationSalaryEmployee(Employee[] employees, int deportment, int indexationSalary) {
        int numberEmployee = 0;
        int indexation = 0;
        for (Employee employee : employees) {
            if (deportment == employee.getDepartment()) {
                indexation += employee.getPayEmployee();
                numberEmployee++;
                indexation = indexation * indexationSalary / 100;
            }
        }

        System.out.println("Проиндексированная зарплата = " + indexation);
    }

    public static void printAllEmployeeOnDeportment(Employee[] employees, int deportment) {
        for (Employee employee : employees) {
            if (deportment == employee.getDepartment()) {
                System.out.println(employee);
            }
        }
    }

    public static void findEmployeeMinNumber(Employee[] employees, int number) {
        for (Employee employee : employees) {
            if (employee.getPayEmployee() > number) {
                System.out.println(employee);
            }
        }
    }

    public static void findEmployeeMaxNumber(Employee[] employees, int number) {
        for (Employee employee : employees) {
            if (employee.getPayEmployee() <= number) {
                System.out.println(employee);
            }
        }
    }
}