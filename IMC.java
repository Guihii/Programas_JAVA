import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);

    float IMC;

    System.out.println("\n\t\t |Bem vindo ao programa de IMC|\n ");

    System.out.println("Informe como deseja ser chamado: \n");
    String nome = entrada.next();

    
    System.out.println("\n" + nome + ", informe sua altura em metros: ");
    Float altura = entrada.nextFloat();
    System.out.println("\n" + nome + ", informe o seu peso: ");
    Float peso = entrada.nextFloat();

    
    IMC  = peso/(altura*altura);
    System.out.printf("O seu IMC ficou em:  %.2f %n \n", IMC);

    System.out.println("Você deseja saber qual é a classificação do  seu IMC? \n [1] SIM \n [2] NÃO \n");
    int op = entrada.nextInt();

    if (op==1){
      if(IMC<18.5){
        System.out.println("Você se enquadra na Classificação BAIXO PESO \n");
      }
        if(IMC >= 18.5 && IMC <= 24.99){
          System.out.println("Você se enquadra na Classificação NORMAL \n");
      }
        if(IMC >= 25 && IMC <= 29.99){
            System.out.println("Você se enquadra na Classificação SOBREPESO \n");
      }
      if(IMC >= 30){
        System.out.println("Você se enquadra na Classificação OBESIDADE \n");
      }
  }else{
      System.out.println("Muito obrigado! ");
    }

    
    
  System.out.println("Muito obrigado! ");

    
    
  }
}