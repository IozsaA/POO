package hello_world;

class Suma{
	public static int suma(int a,int b) {
		return a+b;
	}
	
	public static int suma(int a,int b, int c) {
		return suma(a,b)+c;
	}
	
	public static int suma(int a,int b, int c, int d) {
		return suma(suma(a,b),c)+d;
	}
}

public class Trei5 {

	public static void main(String[] args) {
		Suma a = new Suma();
		System.out.println(a.suma(7,5,2,5));

	}

}