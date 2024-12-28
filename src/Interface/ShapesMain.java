package Interface;

public class ShapesMain {

	public static void main(String[] args) { 
		Shape[] shapes = {
			new Circle(12),
			new Rectangle(18, 18),
			new Triangle(30, 30, 30),
		};
		
		for(int i = 0; i < shapes.length; i++) {
			printShapeInfo(shapes[i]);
		}
		
		
		/*
		Circle cir = new Circle(12);
		Rectangle rect = new Rectangle(18, 18);
		Triangle tri = new Triangle(30, 30, 30);
		
		printShapeInfo(cir);
		printShapeInfo(rect);
		printShapeInfo(tri);
		*/
	}
	
	public static void printShapeInfo(Shape s) {
		System.out.println("area= " + s.getArea());
		System.out.println("perimeter= " + s.getPerimeter());
	}
	
}
