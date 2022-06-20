package CreationalPatterns.ProtoType;
/*
this one of the concrete classes call Rectangle ,and it implements the IShape interface ,so it will override
the clone method who will return and obj of the same properties (width and high )of Rectangle in a new one
 */
public class Rectangle implements IShape{
    int width, high;
public Rectangle(){}
    public Rectangle(Rectangle rectangle)
    {
        if(rectangle != null) {
            this.high = rectangle.high;
            this.width = rectangle.width;
        }
    }
    @Override
    public IShape clone()
     {
        return   new Rectangle(this);
    }
}
