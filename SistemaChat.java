//PASSO 1
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaChat {

    static ArrayList<String> usuarios = new ArrayList<>();
    static ArrayList<String> senhas = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // CADASTRO DE USUÁRIO
        System.out.println("=== Cadastro de Usuário ===");
        System.out.print("Crie um nome de usuário: ");
        String usuario = sc.nextLine();

        System.out.print("Crie uma senha de acesso: ");
        String senha = sc.nextLine();

        // adiciona nas listas globais
        usuarios.add(usuario);
        senhas.add(senha);

        System.out.println("\nCadastro realizado!\n");

        // LOGIN USUARIO
        System.out.println("=== Login ===");
        System.out.print("Digite seu nome de usuário: ");
        String usuarioLogin = sc.nextLine();

        // LOGIN SENHA
        System.out.print("Digite sua senha de acesso: ");
        String senhaLogin = sc.nextLine();

        int indice = usuarios.indexOf(usuarioLogin);

        if (indice != -1 && senhas.get(indice).equals(senhaLogin)) {
            System.out.println("\nLogin bem-sucedido!\n");
            iniciarChat(sc, usuarioLogin);
        } else {
            System.out.println("Usuário ou senha incorretos.");
        }

        sc.close();
    }

    public static void iniciarChat(Scanner sc, String usuario) {

        System.out.println("Bem-vindo ao chat, " + usuario + "!");

        String mensagem;

        do {
            System.out.print(usuario + ": ");
            mensagem = sc.nextLine();

            if (!mensagem.equalsIgnoreCase("sair")) {
                System.out.println("Sistema: mensagem recebida.");
            }

        } while (!mensagem.equalsIgnoreCase("sair"));

        System.out.println("Chat encerrado.");
    }
}