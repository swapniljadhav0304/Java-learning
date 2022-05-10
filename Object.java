public class Object {
    public static void main(String[] args)
    {
       //Creating a first object its taken from class of Student
       Student student1 = new Student();

      //  calling behaviours (method) of object
       student1.name= "john";
       student1.age= 18;
       student1.color="blak";
       student1.sex= 'm';

       student1.Drinking();
       student1.Eating();
       student1.Running();

    }
}
