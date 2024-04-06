# Tabuada
Programa em Java que faz  a tabuada com o número informado pelo usuário.

# Classe Principal
```java
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
```

# Classe Tabuada
```java
package padrao;

/**
 *
 * @author João Enrique
 */
public class Tabuada 
{
    private int contador;//declarando o contador
    
    public Tabuada()//metodo construtor
    {
    
    }
    
    public int getContador()//metodo get construtor
    {
        return contador;//retornar contador
    }
    
    public void setContador(int contador)//metodo set construtor
    {
        this.contador = contador;
    }
    
    void CalcularTabuada(int numero)//classe do calculo
    {
        this.setContador(1);//iniciando contador com um 
        int result = 1;//iniciando resultado com 1
        
        //while
        do
        {
            result = getContador() * numero;// conta de multiplicação
            
            System.out.println(this.getContador() + " X " + numero + " = " + result);//mostrar resultado
            
            this.setContador(this.getContador() + 1); //adicionando + 1 para o contador
        }
        while(this.getContador() <= 10);// repetir até o contador ser igual a 10 
    }
}
```
