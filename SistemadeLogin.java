import java.util.Scanner;

public class SistemaLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuarioCorreto = "java8";
        String senhaCorreta = "java8";
        boolean acessoPermitido = false;

        for (int tentativas = 3; tentativas > 0; tentativas--) {
            System.out.print("Digite o usuário: ");
            String usuario = scanner.next();

            System.out.print("Digite a senha: ");
            String senha = scanner.next();

            if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                acessoPermitido = true;
                break;
            } else {
                System.out.printf("Usuário ou senha incorretos. Você tem mais %d tentativas.\n", tentativas - 1);
            }
        }

        if (acessoPermitido) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado! Número de tentativas excedido.");
        }

        scanner.close();
    }
}
