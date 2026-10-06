import java.util.Scanner;
public class L06EX04 {
    public static void main(String[] args) {
        String[]  consoante= new String[10];
        String[]  letra= new String[10];
        int soma_consoante=0;
        Scanner escreve = new Scanner(System.in);
        for(int i=0;i<letra.length;i++){
            System.out.print("Digite a letra "+ (i+1)+": ");
            letra[i]= escreve.nextLine();
            if((letra[i].equals("a")|| letra[i].equals("e") || letra[i].equals("i") || letra[i].equals("o") || letra[i].equals("u") || letra[i].equals("A") || letra[i].equals("E") || letra[i].equals("I") || letra[i].equals("O") || letra[i].equals("U"))){

            } else {
                soma_consoante=soma_consoante+1;
                consoante[i]=letra[i];
            }
        }
        System.out.println("O numero de consoantes e: "+ soma_consoante);
        System.out.println("As consoantes digitadas foram: ");
        for(int j=0;j<consoante.length;j++){
            if(consoante[j]!=null){
                System.out.println(consoante[j]);
            }
            
        }
        escreve.close();
    }
}
