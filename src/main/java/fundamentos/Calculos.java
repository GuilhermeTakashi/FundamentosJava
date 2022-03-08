package fundamentos;

import static fundamentos.Medidas.entrada;
import static fundamentos.Medidas.tabuada;

public class Calculos {

    public static void main(String[] args){
        System.out.println("Deseja calcular a tabuada? <S/N>");
        String resposta = entrada.nextLine();
        System.out.println("Resposta:" + resposta);
        switch(resposta){
            case "s":
            case "S":
                    tabuada();
                    break;
            default:
                System.out.println("Digitou outro texto diferente de \"S\"");

        }
    }
}

