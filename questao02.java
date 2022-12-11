import java.util.Scanner;

class Exercicios {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);//input
        int a = entrada.nextFloat();

        questao2 (a);//chamada da função
    }
    public static void questao2(float n)
    {
        if(n > 0) System.out.println(n*2); //função que printa o dobro do valor caso seja seja positivo
        else System.out.println(n*n); //função que printa o quadrado do valor caso seja negativo
    }
    
}