package hello_world;

class Piramida {
	private final int num;

	public Piramida(int n) {
		num = n;
	}

	public void tiparire() {
		for (int i = 1; i <= num; i++) {
			for (int j = num-i; j >= 0; j--) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}

public class Trei4 {

	public static void main(String[] args) {
		Piramida pir = new Piramida(8);
		pir.tiparire();

	}

}
