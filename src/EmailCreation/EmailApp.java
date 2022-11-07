package EmailCreation;

import java.util.Scanner;

public class EmailApp {
    String firstName;
    String lastName;
    String passWord;
    ;
    String department;
    String email;
    String emailSuffix = "clarusway.com";//Şirket domaini
    int mailBoCapacity = 1000;
    int defaultPasswordLength = 12;

    public EmailApp(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /*
    testautomation.
    fullstackdeveloper.
    salesforce.
    hicbiri
     */
    public String setDepartment() {
        System.out.print("Lütfen aşağıda belirtilen departmanlardan herhangi birini seçiniz...\n"+
                "\n1 Test Automation\n2 Full Stack Developer\n3 Salesforce\n0 Hicbiri");
        Scanner scanner=new Scanner(System.in);
        int options=scanner.nextInt();

        if(options==1) {
            return "testautomation";
        }else if (options==2) {
            return "fullstackdeveloper";
        }else if(options==3){
            return "salesforce";
        }else return "hiçbiri";
    }

}

