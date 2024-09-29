import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        double num1 = sc.nextDouble();
        System.out.println("Digite o segundo valor: ");
        double num2 = sc.nextDouble();
        System.out.println("Digite o tipo de operaçao(+, -, *, /):");
        char operacao = sc.next().charAt(0);
        sc.close();
        double resultado;

        switch (operacao) {
            case '+':
                resultado = num1 +num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                resultado = num1 / num2;
                break;
            default:
                System.out.println("operçao invalida.");
                return;
        }

        System.out.println(num1+" "+operacao+" "+num2+" =  "+resultado);

        }
    }