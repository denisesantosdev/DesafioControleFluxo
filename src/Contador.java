import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = Integer.parseInt(terminal.next());
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = Integer.parseInt(terminal.next());

        try {
            contar(parametroUm, parametroDois);
        } catch (Exception e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            e.printStackTrace();
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        
        // validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;

        // realizar o for para imprimir os números com base na variável contagem
        for(int i = 0; i < contagem; i++){
            System.out.println("Imprimindo número: " + i);
        }
    }
}