package miPrincipal;

public abstract class Seguro
{
    // Atributos
    private String nombre;
    protected String tipo;
    protected double costoMensual;

    // Constructor
    public Seguro( String nombre, String tipo, double costoMensual)
    {
        setNombre( nombre );
        setTipo( tipo );
        setCostoMensual( costoMensual );
    }

    // Metodos set/get
    public void setNombre(String nombre)
    {
        // No hay nada que validar
    }

    public abstract void setTipo(String tipo);

    public abstract void setCostoMensual(double costoMensual);

    public String getNombre()
    {
        return "";
    }

    public String getTipo()
    {
        return "";
    }

    public double getCostoMensual()
    {
        return 0.0;
    }

    // Método toString()
    public String toString()
    {
        String resultado = String.format("");
        return resultado;
    }
}