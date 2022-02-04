import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class DesafioReservatorioMel {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double volume, diametro, raio, area, altura;
        while (leitor.hasNext()) {
            volume = leitor.nextDouble();
            diametro = leitor.nextDouble();
            raio = diametro / 2;
            area = 3.14 * raio * raio ;
            altura = volume / area ;
            System.out.println("ALTURA = " + df.format(altura));
            System.out.println("AREA = " + df.format(area));
// Tive problemas na formatação devido a classe deccimal verificar depois.
        }
    }
}

