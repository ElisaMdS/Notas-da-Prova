import java.io.IOException;
import java.util.Scanner;

public class Notas {
	
    public static void main(String[] args) throws IOException {

        Scanner recebeNota = new Scanner(System.in);
        int nota = recebeNota.nextInt();

        if (nota == 0) System.out.println("E");

        else if (1 <= nota && nota <= 35) System.out.println("D");

        else if (36 <= nota && nota <= 60) System.out.println("C");

        else if (61 <= nota && nota <= 85) System.out.println("B");

        else System.out.println("A");

        recebeNota.close();
    }
	
}