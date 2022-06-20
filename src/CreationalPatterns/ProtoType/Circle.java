package CreationalPatterns.ProtoType;
/*
this one of the concrete classes call circle ,and it implements the IShape interface ,so it will override
the clone method who will return and obj of the same properties (radius)of circle in a new one
 */
public class Circle implements IShape{
    int radius;
    public Circle(){}
    public Circle(Circle circle)
    {
        if(circle != null) {
            this.radius = circle.radius;
        }
    }

    @Override
    public IShape clone()
    {
        return new Circle(this);
    }
}
