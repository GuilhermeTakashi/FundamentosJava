package fundamentos;

public class Contadores extends Medidas implements  MedidasContadores{
    public static void main(String[] args) {
        System.out.println("Deseja realizar a contagem regressiva? <S/N>");
        String resposta = entrada.nextLine();
        switch (resposta) {
            case "s":
            case "S":
                MedidasContadores.contagemRegressiva();
                break;
            default:
                System.out.println("Digitou outro texto diferente de \"S\"");
        }
    }

}