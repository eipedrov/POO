import java.util.Scanner;

class Exercicios {
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);//input
        int a = entrada.nextInt();
        
        questao6 (a);//chamada da função
    }

	public void questao6(int n){
        for(int i = 1; i < n; i++){
            if(i % 2 != 0) System.out.println(i); //comparação           
        }
    }
    
}