import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Aboutme{
    public static void main(String[] args)  {
       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
   
        try{
       System.out.print("Digite o seu nome: ");
       String nome = scanner.next();

       System.out.print("Digite seu sobre nome: ");
       String sobrenome = scanner.next();

       
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        
        System.out.print("Digite sua altura");
        double altura = scanner.nextDouble();
            
        
        //Imprimindo dados obtidos pelo usuario

        System.out.println("Óla, me chamo "+nome.toUpperCase()+ " "+sobrenome.toLowerCase());
        System.out.println("Tenho "+idade+" anos");
        System.out.println("Minha altura é: "+altura +"cm ");
        scanner.close();
        }
        catch(java.util.InputMismatchException e){
            System.out.println("Os campos idades e altura devem ser númericos");

        }
    }
}
