import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        int n;
        System.out.println("Digite o número: \n");
        n = read.nextInt();
        System.out.println("Tabela de Multiplicação de " + n);
        for(int i = 1; i < 11; i++){
            int mult = i * n;
            System.out.println(n + " X " + i + " = " + mult);
        }
    }
}
