
import com.me.shapes.Square;
import com.me.shapes.Rectangle;

public class Usage{
	public static void main(String[] args){
		Square s = new Square();
		s.setSide(5);
		System.out.println("Side of the Square is: " +s.getSide());
		System.out.println(s.area());
		System.out.println(s.perimeter());
		Rectangle r = new Rectangle();
		r.setSide(6);
		r.setBreadth(4);
		System.out.println("Length of the Rectangle is: " +r.getSide());
		System.out.println("Breadth of the Rectangle is: " +r.getBreadth());
		System.out.println(r.area());
		System.out.println(r.perimeter());
		 
	}
}