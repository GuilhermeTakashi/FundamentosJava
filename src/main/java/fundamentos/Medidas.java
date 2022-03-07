// 1 - Pacote
package fundamentos;
// 2 - Bibliotecas
import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;
// 3 - Classe
public class Medidas {
    // 3.1 - Atributos
static Scanner entrada = new Scanner(System.in); // informacao do usuario

    // 3.2 - Funções e Métodos

public static void main(String[] args) {
        String opcao = "";
        int area = 0; // receberá o resultado dos cálculos de áreas

        while(!opcao.equals("s") && !opcao.equals("S")) {

            System.out.println("Escolha o Calculo Desejado");
            System.out.println("(1) Area do Quadrado");
            System.out.println("(2) Area do Retangulo");
            System.out.println("(3) Area do Triangulo");
            System.out.println("(4) Area do Circulo");
            System.out.println("(5) - Tabuada");
            System.out.println("(6) - Fibonacci");
            System.out.println("(7) - Contagem Regressiva");
            System.out.println("(8) - Divisao por Zero");
            System.out.println("(s) - Sair");

            opcao = entrada.nextLine(); // leitura da opção
            switch (opcao) {
                case "1":
                    area = calculoAreadoQuadrado();
                    break;
                case "2":
                    area = calcularAreadoRetangulo();
                    break;
                case "3":
                    area = calcularAreadoTriangulo();
                    break;
                case "4":
                    area = calcularAreadoCirculo();
                    break;
                case "5":
                    tabuada();
                    break;
                case "6":
                    fibonacci();
                    break;
                case "7":
                    contagemRegressiva();
                    break;
                case "8":
                    divisaoPorZero();
                    break;
                case "s":
                case "S":
                    System.out.println("Agradecemos pela preferencia! Fui!");;
                    break;
                default:
                    throw new IllegalStateException("Valor Inválido: " + opcao);
            }
            if (area > 0) {
                System.out.println("A área da figura é de: " + area + "m² ");
            }
        }

    }

    public static int calculoAreadoQuadrado(){
        int lado;
        System.out.println("Digite o lado do quadrado: ");
        lado = entrada.nextInt(); // lado recebe a entrada la de cima
        return lado * lado; // retorna a area do quadrado
  }

    public static void tabuada(){
        System.out.print("Você quer calcular a tabuada de qual numero: ");
        byte numero = entrada.nextByte();

        for(byte i=1; i <=10; i ++){
            System.out.print(numero * i + " ");
        }

    }
    public static int calcularAreadoRetangulo(){
        System.out.print("Digite o valor do lado do retangulo: ");
        int lado1 = entrada.nextInt();
        System.out.print("Digite o valor do comprimento do retangulo: ");
        int lado2 = entrada.nextInt();
        return lado1 * lado2;

    }
    public static int calcularAreadoTriangulo(){
        System.out.println("Digite o valor da base do triangulo:");
        int basetriangulo = entrada.nextInt();
        System.out.println("Digite o valor da altura do triangulo:");
        int alturatriangulo = entrada.nextInt();
        return (basetriangulo * alturatriangulo)/2;
    }
    public static int calcularAreadoCirculo(){
        System.out.println("Digite o valor do raio do circulo:");
        int raiocirculo = entrada.nextInt();
        return (raiocirculo * 3);

    }
    public static void fibonacci() {
        System.out.print("Quantos numeros voce quer na sequencia: ");
        int fibonacci = entrada.nextInt();

        switch(fibonacci){
            case 0:
                System.out.println("A sequencia esta vazia");
                break;
            case 1:
                System.out.println("Sequencia de Fibonacci: 1");
                break;
            default:
                int num1 = 0;
                int num2 = 1;

                System.out.print("Sequencia de Fibonacci: 1 ");
                for(int i = 2; i <= fibonacci; i++ ){
                    int fib = num1 + num2;
                    System.out.print(fib + " ") ;
                    num1 = num2;
                    num2 = fib;
                }
        }

    }


    public static void contagemRegressiva(){
        System.out.print("Digite o valor que deseja contar na regressiva:");
        int numero = entrada.nextInt();

        System.out.println("De quanto em quanto voce quer que pule:");
        int decrescimo = entrada.nextInt();

        for(int i = numero; i >= 1 ; i = i - decrescimo ) {
            System.out.println(i);
        }
    }
    public static void divisaoPorZero(){
        System.out.println("Qual é o dividendo: ");
        int dividendo = entrada.nextInt();
        System.out.println("Qual é o divisor: ");
        int divisor = entrada.nextInt();
    }


}



















