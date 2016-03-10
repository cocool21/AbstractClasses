
public class VehicleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Plane p=new Plane();
    System.out.println(p.Run());
    System.out.println(p.Stop());
    System.out.println(p.Accelerate());
    System.out.println(p.Fly());
    System.out.println(p.NoIdeaWhatThisFor());
    Car c=new Car();
    System.out.println(c.Run());
    System.out.println(c.Stop());
    System.out.println(c.Accelerate());
    System.out.println(c.NoIdeaWhatThisFor());
    Boat b=new Boat();
    System.out.println(b.Run());
    System.out.println(b.Stop());
    System.out.println(b.Accelerate());
    System.out.println(b.Float());
    System.out.println(b.NoIdeaWhatThisFor());
    Truck t=new Truck();
    System.out.println(t.Run());
    System.out.println(t.Stop());
    System.out.println(t.Accelerate());
    System.out.println(t.canHaul());
    System.out.println(t.NoIdeaWhatThisFor());
    
	}

}
