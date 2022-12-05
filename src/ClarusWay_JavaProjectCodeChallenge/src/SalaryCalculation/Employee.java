package ClarusWay_JavaProjectCodeChallenge.src.SalaryCalculation;

public class Employee {

    String name;
    int salary;
    int workHours;
    int year;

    public Employee(String isim, int salary, int workHours, int year) {
        this.name = isim;
        this.salary = salary;
        this.workHours = workHours;
        this.year = year;
    }

    public double tax(){

        double paymentOfTax = 0;

        if (salary < 10000){
            paymentOfTax = 0;
        }else {
            paymentOfTax = salary * 0.03;
        }

        return  paymentOfTax;
    }


    public int bonus(){

        int paymentOfBonus = 0;
        int addinitionalBonus = 50;

        if (workHours > 40){
            paymentOfBonus = (workHours - 40) * addinitionalBonus;
        }

        return paymentOfBonus;
    }

    public double raiseSalary(){

        int timeOfYear = 2021;
        int sumOfYear = timeOfYear - year;
        double raising = 0;

        if (sumOfYear < 5){
            raising = (salary+tax())*0.05;
        }else if (sumOfYear < 15){
            raising = (salary+tax())*0.1;
        }else {
            raising = (salary+tax())*0.2;
        }

        return raising;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", year=" + year +
                ", Company= Clarusway" +
                '}';
    }
}
