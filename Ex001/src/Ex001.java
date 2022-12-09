import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = sc.nextInt(); 
        sc.close(); 
        
        linhas(n); 
    }
    public static void linhas(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println(" ");
        }
    }
}