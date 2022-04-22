package SingletonPattern;
/*
in this example of singleton we will make a programme who make two persons and give him a name and age
after that we will print their name and age but ohh the name and the age of person two is same of person two
this is the singleton pattern the same object
 */
public class User {
    public static void main(String[] args) {
Person p1 = Person.getInstance("habibellah",19);
Person p2 = Person.getInstance("faidi",23);
        System.out.println("the name and the age of p1 is :"+p1.getName()+" "+p1.getAge());
        System.out.println("the name and the age of p2 is :"+p2.getName()+" "+p2.getAge());
    }
}
