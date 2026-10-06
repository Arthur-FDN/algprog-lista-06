import java.util.Scanner;

public class L06EX7 {
    public static void main(String[] args){
        int[] vetor = new int[5];
        int soma=0, multiplicacao=1;
        Scanner escreve = new Scanner(System.in);
        for(int i=0;i<vetor.length;i++){
            System.out.print("Digite o "+(i+1)+" numero: ");
            vetor[i]=escreve.nextInt();
            soma=soma+vetor[i];
            multiplicacao=multiplicacao*vetor[i];
        }
        System.out.println("A soma dos numeros digitados e: "+ soma);
        System.out.println("A multiplicacao dos numeros digitados e: "+multiplicacao);
        System.out.println("Os numeros digitados forma: ");
        for(int j=0;j<vetor.length;j++){
            System.out.println(vetor[j]);
        }
        escreve.close();
    }
}
