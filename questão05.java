import java.util.Scanner;

class Exercicios {
	public static void main(String[] args) {
        
        questao5 ();//chamada da função
    }

    public static void questao5(){
        int multiplos = 0, n = 1;
        while(true){
            if(n % 3 == 0){ //comparação
                multiplos++;
                System.out.println(n);
                if(multiplos > 4) break;
            }    
            n++;        
        }
    }

}