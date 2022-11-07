package j25_Encapsulation.task05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _02_Encapsulation2 {

/* TODO
    Burada iki adet class vardır. Biri Main diğeri ise Employees,
    Employees(Çalışanlar) class'ında;
    Bu variable'ları oluşturunuz;
    private String name,
    private int salary,
    private String dob (date of birth) (Doğum tarihi)
    getter ve setter oluşturunuz.

todo  Main class'ın içinde;
    Örnek:
    Name is Fernando
    dob is 11/23/2000
    Salary is 80000


todo main method'un içinde,
    Eğer employee 18 yaşında büyükse, Welcome to our company Fernando your salary is 80000. yazdırınız.
    Eğer Fernando 18 yaşından küçükse, come back when you are 18 years old. yazdırınız.
    Eğer Fernando 18 yaşındaysa,  we can have inter with you after that you can have a 80000 salary yazdırınız.

todo  ageCalculator isminde bir method oluşturunuz. Şuanki tarih - doğum yılı = employee age
*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        String dob = scan.nextLine();
        int salary = scan.nextInt();

//  BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ ve employees class'ında setter'ı ayarlarken bu variable'ları kullanınız.

        Employees employees = new Employees();
        employees.setName(name);
        employees.setDob(dob);
        employees.setSalary(salary);

        int employee = employees.ageCalculator(dob);


        if (employee > 18) {
            System.out.println(" Welcome to our company " + name + " your salary is " + salary + ".");
        }

        if (employee < 18) {
            System.out.println("come back when you are 18 years old.");

        }

        if (employee == 18) {
            System.out.println("we can have inter with you after that you can have a " + salary + " salary");
        }

    }
}

class Employees {

    private String name;
    private String dob; // doğum tarihi
    private int salary;

    public int ageCalculator(String dob) {

        String strDate = dob;

        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate tarih = LocalDate.parse(strDate, format);


        LocalDate bugun = LocalDate.now();
//        Period fark = Period.between(tarih,bugun);
//        int yas = fark.getYears();

        int yas = bugun.getYear() - tarih.getYear();
        return yas;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

}