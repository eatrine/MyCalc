
public class Main {

	public static void main(String[] args) {
		MyClac b1 = new MyClac(); 
		
		System.out.println("Calculating addition of integers:"+b1.add(5, 5));
		System.out.println("Calculating addition of doubles:"+b1.add(5.33, 5.33));
		System.out.println("Calculating addition of floats:"+b1.add(5.454545, 5.454545));
		System.out.println("Calculating subtraction of integers:"+b1.sub(5, 5));
		System.out.println("Calculating subtraction of doubles:"+b1.sub(5.44, 1.11));
		System.out.println("Calculating subtraction of floats:"+b1.sub(5.8852, 1.1111));

	}

}
