// Escreva um programa em Java em que o usuário informe o seu nome e exiba a mensagem
// "Olá, [NomeDoUsuario]".

// Importação da Classe Scanner, para interação do usuário.
import java.util.Scanner;
public class Exercicio2 {

    public static void main(String [] args){

        // Enunciado para digitar o nome, junto da criação do objeto Scanner para entrada de informações
        // e a variável recebendo o valor.
        System.out.print("Insira seu nome:");
        Scanner entrada = new Scanner(System.in);
        String NomeDoUsuario = entrada.nextLine();

        // Impressão na tela das boas vindas junto do nome.
        System.out.println("Olá, " + NomeDoUsuario);

    }

}
