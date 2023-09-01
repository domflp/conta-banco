
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args)  {

        int numero   
        String agencia;
        String nome;
        double saldo;
    
            Scanner ler = new Scanner(System.in);
    
    
            System.out.println("Por favor insira o numero da Conta: ");
            numero = ler.nextInt();
    
            System.out.println("Por favor insira o numero da Agencia");
            agencia = ler.next();

             System.out.println("Por favor  insira o seu nome");
            nome = ler.next();
            System.out.println("Por favor insira o seu saldo ");
            saldo = ler.nextDouble();
            System.out.println( "Olá "  + nome +  " Obrigado por criar uma conta em nosso banco,sua agência é  "  +  agencia  +   "  Conta "  +  numero  +  " e seu saldo final é "  +  saldo);

            


    
    
    
     
     



        }
      }
    
  
