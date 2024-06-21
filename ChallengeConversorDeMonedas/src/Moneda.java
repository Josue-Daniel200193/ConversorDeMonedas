import com.google.gson.annotations.SerializedName;

public class Moneda {
    @SerializedName("base_code")
    private String monedaBase;

    @SerializedName("target_code")
    private String monedaDeCambio;

    @SerializedName("conversion_result")
    private double resultado;

    private double cantidad;

    // crearemos un constructor de tipo clase MonedasApis.
    public Moneda(MonedasApis miMonedaApi) {
        this.monedaBase = miMonedaApi.base_code();
        this.monedaDeCambio = miMonedaApi.target_code();
        this.resultado = miMonedaApi.conversion_result();
    }


    // los getters y setters
    public String getMonedaDeCambio() {
        return monedaDeCambio;
    }

    public String getMonedaBase() {
        return monedaBase;
    }

    public double getResultado() {
        return resultado;
    }

    public double getCantidad() {
        return cantidad;
    }

    // un set para que ingrese el dato
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    // mostrarDatos
    @Override
    public String toString() {
        return "El valor " + getCantidad() + "[" + monedaBase + "] corresponde al valor final de =>> "+ resultado + "[" + monedaDeCambio + "]";
    }


}
