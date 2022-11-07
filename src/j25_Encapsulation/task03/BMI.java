package j25_Encapsulation.task03;

/* Task->
     Bmı class fields -> name, age, weight,height: encapsulated
     getBMI() method -> bmi=weight/(height*height) return type olmalı
     getStatus() method -> bmi 18.5 ten kucukse zayif, 25 ten kucukse normal, 30 dan kucukse kilolu, 30 ustu obez return type
     runner class obj ile dataları print eden code create ediniz
     */
public class BMI {

    private String name;
    private int age;
    private double weight;
    private double height;

    public String getStatus() {//getStatus() method -> bmi 18.5 ten kucukse zayif, 25 ten kucukse normal, 30 dan kucukse kilolu, 30 ustu obez return type
        if (getBMI() < 18.5) {
            return "zayıf";
        } else if (getBMI() < 25) {
            return "normal";
        } else if (getBMI() < 30) {
            return "kilolu";
        } else return " morbit obezzzz :( ";
    }

    public BMI(String name, int age, double weight, double height) {// full p cons
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public double getBMI() {// getBMI() method -> bmi=weight/(height*height) return type olmalı

        double bmi = weight / (height * height);

        return bmi;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}//class sonu

class Runner {//inner class

    public static void main(String[] args) {//main meth bası

        BMI obj = new BMI("Muharrem bey", 46, 54, 1.63);
        System.out.println("BMI :"+ obj.getName()+" "+obj.getStatus()+" "+obj.getBMI());


    }//main meth sonu
}//inner class sonu
