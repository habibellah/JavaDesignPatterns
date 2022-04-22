package SingletonPattern;
/*
this class of person here we will implement the singleton pattern
 */
public class Person {
    private String name;
    private int age;
    private static Person person;
    private Person(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    public static Person getInstance(String name,int age)
    {
        if(person == null)
        {
            person = new Person(name,age);
        }
        return person;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
