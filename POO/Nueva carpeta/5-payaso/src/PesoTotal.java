import java.util.Scanner;

public class PesoTotal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuantos payasos fueron vendidos:");
        int payasos = scanner.nextInt();

        System.out.println("Cuantas muñecas fueron vendidass:");
        int mininas = scanner.nextInt();

        double PesoPayaso = payasos * 112;// pesa 112g
        double Pesosmininas = mininas * 75; // peso 75g
        double PesoTotal = PesoPayaso + Pesosmininas;

        System.out.printf("El peso total del paquete enviado es de %.2fg \n", PesoTotal);

        scanner.close();

    }
}
