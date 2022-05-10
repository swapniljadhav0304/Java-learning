public class counstructor {
    public static void main(String[] args)
    {   //creating an object by empty constructer
        Student student1=new Student();
        System.out.println("Student 1 name:"+student1.name);
       //full custructer

       Student student2=new Student("john",18,"black",'m');
        System.out.println("Student 2 :"+student2.name);
    }
}
