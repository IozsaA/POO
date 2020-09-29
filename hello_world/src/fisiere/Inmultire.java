package fisiere;

import java.io.*;
import java.util.Scanner;

public class Inmultire {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        PrintStream out_stream = new PrintStream(new FileOutputStream("out.txt"));
        System.out.println("Introduceti dimensiunile matricelor: ");
        final int M = scan.nextInt(), N = scan.nextInt(), P = scan.nextInt();

        double[][] a = new double[M][N];
        double[][] b = new double[N][P];
        double[][] c = new double[M][P];
        for(int i = 0;i < M;i++){
            for(int j = 0;j < N;j++){
                System.out.print("a["+i+"]["+j+"]=");
                a[i][j]=scan.nextDouble();
            }
        }

        for(int i = 0;i < N;i++){
            for(int j = 0;j < P;j++){
                System.out.print("b["+i+"]["+j+"]=");
                b[i][j]=scan.nextDouble();
            }
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < P; j++) {
                for (int k = 0; k < N; k++)
                    c[i][j] += a[i][k] * b[k][j];
            }
        }

        for(int i = 0;i < M;i++){
            for(int j = 0;j < P;j++){
                out_stream.print(c[i][j] + " ");
            }
            out_stream.println();
        }

        scan.close();
        out_stream.close();
    }
}
