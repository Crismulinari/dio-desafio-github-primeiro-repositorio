import javax.swing.*;
import java.io.IOException;
import java.util.Scanner;

public class DesafioSenha {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int senha = 0;
        while (true){
            senha = leitor.nextInt();
            if (senha == 2002) {
                System.out.println("Acesso Permitido");
                break;
            }
             System.out.println("Senha Invalida");
        }
    }
}
