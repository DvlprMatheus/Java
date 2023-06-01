// Escreva um programa em Java em que o usuário informe o seu nome e em seguida o programa perguntará
// a idade do usuário. Agora o programa deve exibir a mensagem "Olá, [NomeDoUsuario], sua idade é [idade]".

// Importação da Classe Scanner, para interação do usuário.
import java.util.Scanner;
public class Exercicio3 {

    public static void main(String [] args){

        // Enunciado para digitar o nome, junto da criação do objeto Scanner para entrada de informações
        // e a variável recebendo o valor.
        System.out.print("Insira seu nome:");
        Scanner entrada = new Scanner(System.in);
        String NomeDoUsuario = entrada.nextLine();

        // Enunciado para digitar a idade, junto da coleta da idade na variável.
        System.out.print("Insira sua idade:");
        int IdadeDoUsuario = entrada.nextInt();

        // Impressão na tela das boas vindas junto do nome e idade.
        System.out.println("Olá, " + NomeDoUsuario + "! Sua idade é " + IdadeDoUsuario + " anos.");

    }

}
