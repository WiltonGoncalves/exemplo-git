import java.util.Scanner;

public class LivrariaApplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();
        System.out.println("Idade:");
        Integer idade = sc.nextInt();
        sc.close();

        String statusIdade;
        if (idade >= 18) { 
            statusIdade = "maior de idade";
        } else { 
            statusIdade = "Menor de idade";
        }
        System.out.println("ola mundo ! Meu nome é "+nome+" e sou "+statusIdade);
    }
}
