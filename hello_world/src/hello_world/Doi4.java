package hello_world;

class Sertar {
	private int lungime, latime, inaltime;

	public Sertar(int lu, int la, int h) {
		lungime = lu;
		latime = la;
		inaltime = h;
	}

	public void tipareste() {
		System.out.println("Sertar " + lungime + " " + latime + " " + inaltime);
	}

}

class Birou {
	private Sertar prim,secund;
	
	public Birou(Sertar a,Sertar b) {
		prim=a;
		secund=b;
	}
	
	public void tipareste() {
		prim.tipareste();
		secund.tipareste();
	}
}

public class Doi4 {

	public static void main(String[] args) {
		Sertar a = new Sertar(3,5,7);
		Sertar b = new Sertar(2,5,8);
		Birou birou = new Birou(a,b);
		birou.tipareste();
	}

}
