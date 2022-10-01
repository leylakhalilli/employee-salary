public class Employee {
    private String nameAndSurname;
    private double salary;
    private double workHours;
    private String year;

    public Employee(String nameAndSurname, double salary, double workHours, String year) {
        this.nameAndSurname = nameAndSurname;
        this.salary = salary;
        this.workHours = workHours;
        this.year = year;
    }

    public double tax() {
        double tax = 0;
        if (salary > 1000) {
            tax = salary * 0.03;
        }
        return tax;
    }

    public double bonus() {
        double bonus = 0;
        if (workHours > 40) {
            bonus = 30 * (workHours - 40);
        }
        return bonus;
    }

    public double raiseSalary() {
        double raiseSalary = 0;
        int workedYears = 2021 - Integer.parseInt(year);
        if (workedYears < 10) {
            raiseSalary = salary + salary * 0.05;
        } else if (workedYears > 9 && workedYears < 20) {
            raiseSalary = salary + salary * 0.1;

        } else if (workedYears > 19) {
            raiseSalary = salary + salary * 0.15;
        }

        return raiseSalary;
    }

    @Override
    public String toString() {
        return "Employee " + "\n" +
                " Name Surname=" + nameAndSurname + "\n" +
                " salary=" + salary + "\n" +
                " workHours=" + workHours + "\n" +
                " year=" + year + "\n" +
                "-----------------------" + "\n" +

                " tax = " + tax() + "\n" +
                " bonus = " + bonus() + "\n" +
                " raiseSalary= " + raiseSalary() + "\n" +
                " totalSalary= " + (raiseSalary() + bonus() - tax()) + "\n" +


                '}';
    }
}
