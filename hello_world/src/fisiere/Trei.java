package fisiere;

import java.io.*;
import java.util.Scanner;

public class Trei {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        String name = reader.readLine();
        File file = new File(name);
        Scanner scan = new Scanner(file);
        int k = 0;
        while(scan.hasNextLine()) {
            String str = scan.nextLine();
            System.out.println(str);
            if(text.equals(str)){
                k++;
            }
        }
        System.out.println("Linia introdusa apare de " + k + " ori");

        reader.close();
    }

}
