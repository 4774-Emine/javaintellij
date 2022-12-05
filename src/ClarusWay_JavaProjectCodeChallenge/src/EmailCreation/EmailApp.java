package ClarusWay_JavaProjectCodeChallenge.src.EmailCreation;

import java.util.Scanner;

public class EmailApp {


    String passWord;
    String department;
    String email;
    String emailSuffix = "clarusway.com"; //Sirket Domaini dr@clarusway.com
    int mailBoCapacity = 1000;
    int defaultPaaswordLenght = 12;
    String firstName;
    String lastName;


    public EmailApp(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.department = setDepartment();
       // System.out.println("Department: " + department);

        this.passWord = setRandomPassWord(defaultPaaswordLenght);
        //System.out.println("Password: " + passWord);

        email = firstName.toLowerCase() + lastName.toLowerCase() + "@" + department + emailSuffix;

    }


    /*
    testautomation.
    fullstackdeveloper.
    salesforce.
    hicbiri --> ekleme yapılmayacak.
     */

    public String setDepartment() {

        System.out.print("Lütfen Aşağıda Belirtilen Departmanlardan Herhangi Birini Seçiniz...\n" +
                "\n1 Test Automation \n2 Full Stack Developer \n3 Salesforce \n0 Hicbiri");

        Scanner scanner = new Scanner(System.in);
        int options = scanner.nextInt();


        if (options == 1) {
            return "testautomation.";
        } else if (options == 2) {
            return "fullstackdeveloper.";
        } else if (options == 3) {
            return "salesforce.";
        } else {
            return "";
        }


    }

    //ABCDEFGHIJKLMNOPRSTUVYZ1234567890?*!'+abcdefghıjklmanoprstuvyi
    //int lenght = 12;
    public String setRandomPassWord(int lenght) {

        String passWordSet = "ABCDEFGHIJKLMNOPRSTUVYZ1234567890?*!'+abcdefghıjklmanoprstuvyi";
        char[] password = new char[lenght];

        for (int i = 0; i < lenght; i++) {
            int random = (int) (Math.random() * passWordSet.length());
            password[i] = passWordSet.charAt(random);
        }
        return new String(password);
    }

    public String showInfo(){

        return "Ad-Soyad: " + firstName + " " + lastName + "\n"+
        "Sirket Email: " + email + "\n" +
        "Capasity: " + mailBoCapacity + "mb \n" +
        "Password: " + passWord;
    }


}
