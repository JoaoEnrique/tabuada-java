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
