// 1 - Pacote
package fundamentos;

// 2 - Bibliotecas

import java.util.Scanner;
// 3 - Classe
public class Medidas {
    // 3.1 - Atributos
    static Scanner entrada;
    // 3.2 - Funções e Métodos
    public static void main(String[] args){
        String opcao;
        int area; // receberá o resultado dos cálculos de áreas
        entrada = new Scanner(System.in);

        System.out.println("Escolha o Calculo Desejado");
        System.out.println("(1) Area do Quadrado");
        System.out.println("(2) Area do Retangulo");
        System.out.println("(3) Area do Triangulo");
        System.out.println("(4) Area do Circulo");

        opcao = entrada.nextLine();
        switch(opcao){
            case "1":
                area = calculoAreadoQuadrado();

                break;
            default:
                throw new IllegalStateException("Valor Inválido: " + opcao);


        }
        System.out.println("A área é de: " + area + "m2");
    }
    public static int calculoAreadoQuadrado(){
        int lado;

        System.out.println("Digite o lado do quadrado: ");
        lado = entrada.nextInt(); // lado recebe a entrada la de cima
        return lado * lado;
    }




}



















