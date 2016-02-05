/**
 * Write a description of class Carta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carta
{
    // Guarda el valor de la carta
    private int valor;
    //Guarda el palo de la carta
    private String palo;
    /**
     * Constructor for objects of class Carta
     */
    public Carta(int valor,String palo)
    {
        this.valor = valor;
        this.palo = palo;
    }

    /**
     * Devuelve el nombre de la carta
     */
    public String getNombre()
    {
        String nombre;
        nombre = valor + "de " + palo;
        if (valor == 1)
        {
            nombre = "As de " + palo;
        }else if (valor == 11)
        {
            nombre = "Dama de " + palo;
        }else if(valor == 12)
        {
            nombre = "Reina de " + palo;
        }else if(valor == 13)
        {
            nombre = "Rey de " + palo;
        }
        return nombre;
    }
    /**
     * Devuelve  el valor de la carta
     */
    public int getValor()
    {
        return valor;
    }
    /**
     * Devuelve el palo de la carta 
     */
    public String  getPalo()
    {
        return palo;
    }
}
