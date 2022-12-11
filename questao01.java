import java.util.Scanner;

class Exercicios {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);//input
        int a = entrada.nextInt();
        int b = entrada.nextInt();

        questao1 (a,b);//chamada da função
    }
    public static void questao1(int n1, int n2)
    {
        
        int maior = n1 > n2 ? n1 : n2; //função que faz o comparativo dos valores inputados        
        System.out.println("Maior: " + maior); //função que printa o maior valor inputado
    }
}

