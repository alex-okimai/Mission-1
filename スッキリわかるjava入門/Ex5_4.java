package j5;

public class Ex5_4 {
	
	public static void main(String[] args) {
		double TriangleArea = calcTriangleArea( 10.0,5.0);
		System.out.println("三角形の面積は" + TriangleArea);
		double CircleArea = calcCircleArea(5.0);
		System.out.println("円の面積は" + CircleArea);	
	}
	
	public static double calcTriangleArea(double bottom,double height){
		double TriangleArea = bottom * height / 2;
		return TriangleArea;
	}
	
	public static double calcCircleArea(double radius){
		double pai = Math.PI;
		double calcCircleArea = radius * radius * pai;
		return calcCircleArea;
	}
}
