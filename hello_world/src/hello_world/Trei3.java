package hello_world;

class Patrat {
	private int la;

	public Patrat() {
		la = 10;
	}

	public Patrat(int l) {
		la = l;
	}

	public void tiparire() {
		System.out.println("Patrat " + la + " Aria " + la * la);
	}
}

public class Trei3 {

	public static void main(String[] args) {
		Patrat a,b;
		a= new Patrat(15);
		b= new Patrat();
		a.tiparire();
		b.tiparire();

	}

}
