import java.util.Scanner;

class Exercicios {
    public static void main(String[] args) {
        
        questao4 ();//chamada da função
    }

public static void questao4(){
        Scanner entrada = new Scanner(System.in); //input
        boolean cond = true; //condição de verificação
        float maior = 0;
        float menor = 0;        
        float n = entrada.nextFloat();
        maior = menor = n;
        do {
            n = entrada.nextFloat();
            if(n < 0){ //comparação
                cond = false;
            } else {
                maior = n > maior ? n : maior;
                menor = n < menor ? n : menor;            
            }
        } while (cond);
        System.out.println("Maior: " + maior);//prints
        System.out.println("Menor: " + menor);
        entrada.close();
    }

}