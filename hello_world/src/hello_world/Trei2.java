package hello_world;

class Carte {
	private String cart;
	
	public Carte() {
		cart = "";
	}
	
	public Carte(String s) {
		cart = s;
	}
	
	public boolean compar(Carte cart2) {
		if(this.cart.equals(cart2.cart)) {
			return true;
		}
		else {
			return false;
		}
	}
}

public class Trei2 {

	public static void main(String[] args) {
		Carte a = new Carte("bohok");
		Carte b = new Carte("bohok");
		if(a.compar(b) == true) {
			System.out.println("Da, sunt egale");
		}
		else {
			System.out.println("Nu, nu sunt egale");
		}

	}

}
