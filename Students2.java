public class Students2 {
    // States
    private String name ;
    private int age;
    private  String color;
    private char sex;

    public Students2() {

    }

    //behaviour or method or function is block of code ,it runs only when it is called
    //methods
    private void Eating(){
        System.out.println("Eating");
    }
    public void Drinking(){
        System.out.println("Drinking");
    }
    public void Running(){
        System.out.println("Running");
    }
    // constructer//

    public Students2(String name, int age, String color, char sex) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.sex = sex;
    }
//getter
    // get methods with values

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public char getSex() {
        return sex;
    }


    //setter
    //they set the value


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}

