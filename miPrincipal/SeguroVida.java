package miPrincipal;

public class SeguroVida extends Seguro {
    // No hay atributos propios

    // Constructor
    public SeguroVida( String nombre, String tipo, double costoMensual)
    {
        super(nombre, tipo, costoMensual);
    }

    // Implementar metodo de instancia setTipo
    public void setTipo(String tipo)
    {
        // El tipo debe ser "Vida"
    }

    // Implementa metodo de instancia setCostoMensual
    public void setCostoMensual(double costo)
    {
        // El costo mensual debe ser de $150.00
    }

    // Metodo toString() igual que en la super clase
}