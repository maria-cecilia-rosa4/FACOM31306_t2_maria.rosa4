import java.util.Scanner;

public class Main {
    public static int alteraPreco(float[] preco, float porcentagem) {
        if (porcentagem > -100) {
            float temp = 1 + porcentagem / 100; 
            preco[0] = preco[0] * temp;  
            return 0;
        } else {
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nome = new String[4];
        float[] preco = new float[4];
        int[] qtdEstoque = new int[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("\nInforme o nome, o preco e a qtd. em estoque do produto " + (i + 1) + ":");
            nome[i] = scanner.next();
            preco[i] = scanner.nextFloat();
            qtdEstoque[i] = scanner.nextInt();
        }
        System.out.println("\nAumentando o preco em 10% do produto 1 e 3");
        alteraPreco(new float[]{preco[0]}, -110);
        alteraPreco(new float[]{preco[2]}, 10);

        preco[0] = preco[0] * -110;
        System.out.println("\nReduzindo o preco em 5% do produto 2");
        if (alteraPreco(new float[]{preco[1]}, -5) == -1)
            System.out.println("\nErro: preco nao alterado. Porcentagem invalida");
        else
            System.out.println("\nPreco alterado com sucesso");

        System.out.println("\nAlterando o preco do produto 3");
        if (alteraPreco(new float[]{preco[3]}, -110) == -1)
            System.out.println("\nErro: preco nao alterado. Porcentagem invalida");

        System.out.println("\nProdutos Cadastrados:");
        for (int i = 0; i < 4; i++) {
            System.out.println("\nProduto: " + nome[i] + "\nPreco: " + preco[i] + "\nEstoque: " + qtdEstoque[i]);
        }
        scanner.close();
    }
}

