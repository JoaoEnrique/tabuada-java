package padrao;

import java.util.Scanner;

/**
 *
 * @author João Enrique
 */
public class Principal 
{//variaveis
    public static Scanner teclado = new Scanner(System.in);//teclado
    public static int numero = 0;//numero da tabuada
    public static Tabuada tabuada = new Tabuada();//classe que faz a conta
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println("Tabuada");
        System.out.print("Por favor informe um número para a tabuada: ");
        numero = teclado.nextInt();//receber numero do usuario
        
        tabuada.CalcularTabuada(numero);//exibir o resultado
    }
    
}
