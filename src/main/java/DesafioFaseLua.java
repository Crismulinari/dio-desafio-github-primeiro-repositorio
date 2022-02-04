import java.util.Scanner;

public class DesafioFaseLua {

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int inicio = leitor.nextInt();
        int fim = leitor.nextInt();

        if (fim >= 0 && fim <= 2) {
            System.out.println("nova");
        }
        if (inicio < fim && fim >= 3 && fim <= 96) {
            System.out.println("crescente");
        }
        if (inicio < fim && fim >= 97 && fim <= 100) {
            System.out.println("cheia");
        }
        if (inicio > fim && fim >= 3 && fim <= 97 ) {
            System.out.println("minguante");
        }


    }
}
