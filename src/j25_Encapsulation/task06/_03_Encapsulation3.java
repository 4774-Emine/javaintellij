package j25_Encapsulation.task06;

import java.util.Scanner;

public class _03_Encapsulation3 {

/* TODO
    Burada iki class vardır. Biri Main diğeri ise Subscribe.
    Subscribe class'ının içinde;
    Bu variables'ları private oluşturunuz.
    String name
    boolean doYouWanaSubscribe
    String whichMember
    3 tip memberShip(üyelik) seviyesi vardır. Gold, Silver ve Bronze (Altın, gümüş ve bronz)

todo    Main class'ın içinde;
    Örnek;
    Name is Victoria, doYouWanaSubscribe true, whichMember Gold
    Eğer user(kullanıcı) Gold member(üye) olmak istiyorsa;
    Welcome to membership Victoria. Your membership is 40 dollar for month you can enjoy the videos ,
    all homework and see you soon. yazdırınız.

    Eğer user(kullanıcı) Silver member(üye) olmak istiyorsa;
    Welcome to membership Victoria. Your membership is 20 dollar for month you can enjoy the videos and all homework. yazdırınız.

    Eğer user(kullanıcı) Bronze member(üye) olmak istiyorsa;
    Welcome to membership Victoria. Your membership is 10 dollar for month you can enjoy the videos. yazdırınız.

    Eğer user(kullanıcı) member(üye) olmak istemiyorsa;
    See you when you want to be a member. Thanks yazdırınız.
         */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        String whichMember = scan.nextLine();
        boolean doYouWanaSubscribe = scan.nextBoolean();
//  BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ ve subscribe class'ında setter'ı ayarlarken bu variable'ları kullanınız.


        Subscribe subscribe = new Subscribe();
        subscribe.setName(name);
        subscribe.setWhichMember(whichMember);
        subscribe.setDoYouWanaSubscribe(doYouWanaSubscribe);

        if (subscribe.getDoYouWanaSubscribe() == true) {

            if (subscribe.getWhichMember().equals("Gold")) {
                System.out.println("Welcome to membership " + subscribe.getName() + ". Your membership is 40 dollar for month you can enjoy " +
                        "the videos , all homework and see you soon.");
            }

            if (subscribe.getWhichMember().equals("Silver")) {
                System.out.println("Welcome to membership " + subscribe.getName() + ". Your membership is 20 dollar " +
                        "for month you can enjoy the videos and all homework.");
            }

            if (subscribe.getWhichMember().equals("Bronze")) {
                System.out.println("Welcome to membership " + subscribe.getName() + ". Your membership is 10 dollar " +
                        "for month you can enjoy the videos.");
            }

        }

        if (subscribe.getDoYouWanaSubscribe() == false) {
            System.out.println("See you " + subscribe.getName() + " when you want to be a member. Thanks");
        }


    }
}

class Subscribe {

    private String name;
    private boolean doYouWanaSubscribe;
    private String whichMember;

    public Subscribe(String name, boolean doYouWanaSubscribe, String whichMember) {
        this.name = name;
        this.doYouWanaSubscribe = doYouWanaSubscribe;
        this.whichMember = whichMember;
    }

    public Subscribe() {
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public boolean getDoYouWanaSubscribe() {

        return doYouWanaSubscribe;
    }

    public void setDoYouWanaSubscribe(boolean doYouWanaSubscribe) {

        this.doYouWanaSubscribe = doYouWanaSubscribe;
    }

    public String getWhichMember() {
        return whichMember;
    }

    public void setWhichMember(String whichMember) {

        this.whichMember = whichMember;
    }
}
