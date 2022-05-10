public class Student {
   // States
    String name="Arnav";
    int age;
    String color;
    char sex;

    public Student() {

    }

    //behaviour or method or function is block of code ,it runs only when it is called
    //methods
    public void Eating(){
        System.out.println("Eating");
    }
    public void Drinking(){
        System.out.println("Drinking");
    }
    public void Running(){
        System.out.println("Running");
    }
    // constructer//

    public Student(String name, int age, String color, char sex) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.sex = sex;
    }

   }
