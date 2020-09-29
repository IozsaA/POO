package hello_world;

class Complex {
    private final float real, imaginar;
    private static int k = 0;

    public Complex(int re, int im) {
        real = re;
        imaginar = im;
    }

    public double modul() {
        return Math.sqrt(real * real + imaginar * imaginar);
    }

    public void tipareste() {
        System.out.println(real + " + i*" + imaginar);
        k++;
    }

    public static int cate() {
        return k;
    }

}

public class ClientComplex {

    public static void main(String[] args) {
        Complex z1, z2;
        z1 = new Complex(7, 2);
        z2 = new Complex(4, 3);
        z1.tipareste();
        z2.tipareste();
        z1.tipareste();

        System.out.println(z2.modul());
        System.out.println(Complex.cate());
    }

}
