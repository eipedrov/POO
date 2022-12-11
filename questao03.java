import java.util.Scanner;

class Exercicios {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);//input
        int a = entrada.nextFloat();
        int b = entrada.nextFloat();

        questao3 (a,b);//chamada da função
    }

    public static void questao3(float salario, float prestacao) //definindo o tipo de variavel
    {
        float salario20 = salario * .2f; //fazendo o comparativo dos valores
        if(prestacao > salario20)
            System.out.println("Emprestimo nao concedido!"); //caso > 20%
        else
            System.out.println("Emprestimo concedido"); //caso contrario
    }
    
}