package ProtoType;
/*
this example of our prototype pattern is about shapes we have for example one rectangle
,and we want to create new one with the same properties
we use prototype pattern with clone method will create new one without create it from zero and maybe
take time in other programmes for example take data from DB
 */
public class User {
    public static void main(String[] args) {
Rectangle r1 = new Rectangle();
r1.width = 20;
r1.high = 40;
Rectangle r2 = (Rectangle) r1.clone();
        System.out.println("the high and the width of r1 is: "+r1.high+" , "+r1.width);
        System.out.println("the high and the width of r2 is: "+r2.high+" , "+r2.width);

    }
}
