// Considerando a figura abaixo, escreva um programa para cada forma que calcule e exiba em tela
// cada uma de suas respectivas áreas. O usuário irá informar os valores de cada variável. Crie
// um arquivo para cada fórmula e poste os  arquivos no GitHub. Link do repositório abaixo.

// Importação da Classe Scanner, para interação do usuário.
import java.util.Scanner;
public class Exercicio4 {

    // Interação do usuário para escolher qual área quer calcular.
    public static void main(String [] args){

        System.out.print("Escolha uma forma geométrica para resolver a área: \n1) Retângulo \n2) Quadrado \n3) Losango \n4) Trapézio \n5) Paralelogramo \n6) Triângulo \n7) Círculo \nR:");
        Scanner entrada = new Scanner(System.in);
        int escolha = entrada.nextInt();

        switch (escolha){

            case 1:
                retangulo();
                break;
            case 2:
                quadrado();
                break;
            case 3:
                losango();
                break;
            case 4:
                trapezio();
                break;
            case 5:
                paralelogramo();
                break;
            case 6:
                triangulo();
                break;
            case 7:
                circulo();
                break;
        }
    }

    // Código do calculo do retângulo
    public static int retangulo() {

        System.out.print("Informe a base:");
        Scanner entrada = new Scanner(System.in);
        int base_retangulo = entrada.nextInt();

        System.out.print("Informe a altura:");
        int altura_retangulo = entrada.nextInt();

        int resultado_rt = base_retangulo * altura_retangulo;
        System.out.println("A área do retângulo é: " + resultado_rt);

        return resultado_rt;
    }

    // Código do calculo do quadrado
    public static int quadrado(){

        System.out.print("Informe o lado:");
        Scanner entrada = new Scanner(System.in);
        int lado_quadrado = entrada.nextInt();

        int resultado_qd = lado_quadrado * lado_quadrado;
        System.out.println("A área do quadrado é: " + resultado_qd);

        return resultado_qd;
    }

    // Código do calculo do losango
    public static int losango(){

        System.out.print("Infome a diagonal maior:");
        Scanner entrada = new Scanner(System.in);
        int DMaior_losango = entrada.nextInt();

        System.out.print("Informe a diagonal menor:");
        int DMenor_losango = entrada.nextInt();

        int resultado_lg = (DMaior_losango * DMenor_losango)/2;
        System.out.println("A área do losango é: " + resultado_lg);

        return resultado_lg;
    }

    // Código do calculo do trapézio
    public static int trapezio(){

        System.out.print("Informe a base maior:");
        Scanner entrada = new Scanner(System.in);
        int BMaior_trapezio = entrada.nextInt();

        System.out.print("Informe a base menor:");
        int BMenor_trapezio = entrada.nextInt();

        System.out.print("Informe a altura:");
        int Altura_trapezio = entrada.nextInt();

        int resultado_tp = ((BMaior_trapezio + BMenor_trapezio) * Altura_trapezio)/2;
        System.out.println("A área do trapézio é: " + resultado_tp);

        return resultado_tp;
    }

    // Código do calculo do paralelogramo
    public static int paralelogramo(){

        System.out.print("Informe a base:");
        Scanner entrada = new Scanner(System.in);
        int base_paralelogramo = entrada.nextInt();

        System.out.print("Informe a altura:");
        int altura_paralelogramo = entrada.nextInt();

        int resultado_pl = base_paralelogramo * altura_paralelogramo;
        System.out.println("A área do paralelogramo é: " + resultado_pl);

        return resultado_pl;
    }

    // Código do calculo do triângulo
    public static int triangulo(){

        System.out.print("Informe a base:");
        Scanner entrada = new Scanner(System.in);
        int base_triangulo = entrada.nextInt();

        System.out.print("Informe a altura:");
        int altura_triangulo = entrada.nextInt();

        int resultado_tg = (base_triangulo * altura_triangulo)/2;
        System.out.print("A área do triângulo é: " + triangulo());

        return resultado_tg;
    }

    // Código do calculo do círculo
    public static double circulo(){

        System.out.print("Informe o raio:");
        Scanner entrada = new Scanner(System.in);
        int raio_circulo = entrada.nextInt();

        double resultado_cl = (3.14 * (raio_circulo^2));

        return resultado_cl;
    }
}
