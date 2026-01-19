/*  * Telegrama.java  */ package objetosNegocio;

/**
 * * Esta clase permite calcular el costo de un telegrama. * * @author mdomitsu
 */
public class Telegrama {

    private final double COSTO_ORDINARIO = 25.0;
    private final double COSTO_URGENTE = 40.0;
    private final double COSTO_ADICIONAL_ORDINARIO = 2.5;
    private final double COSTO_ADICIONAL_URGENTE = 4.0;
    private String tipoTelegrama;
    private int numPalabras;
    private double costo;

    /**
     *
     * Constructor de la clase. Inicializa los atributos de la clase al * valor
     * de sus parametros * @param tipoTelegrama Tipo de telegrama: "Ordinario" o
     * "Urgente" * @param numPalabras Numero de palabras del telegrama
     */
    public Telegrama(String tipoTelegrama, int numPalabras) {
        this.tipoTelegrama = tipoTelegrama;
        this.numPalabras = numPalabras;
    }

    /**
     * * Esta funcion regresa el numero de palabras del telegrama. * @return
     * Numero de palabras del telegrama
     */
    public int getNumPalabras() {
        return numPalabras;
    }

    /**
     * * Esta funcion establece el numero de palabras del telegrama. * @param
     * numPalabras Numero de palabras del telegrama
     */
    public void setNumPalabras(int numPalabras) {
        this.numPalabras = numPalabras;
    }

    /**
     * * Esta funcion regresa el tipo del telegrama * @return Tipo de telegrama:
     * "Ordinario" o "Urgente"
     */
    public String getTipoTelegrama() {
        return tipoTelegrama;
    }

    /**
     * * Esta funcion establece el tipo del telegrama * @param tipoTelegrama
     * Tipo de telegrama: "Ordinario" o "Urgente"
     */
    public void setTipoTelegrama(String tipoTelegrama) {
        this.tipoTelegrama = tipoTelegrama;
    }

    /**
     * * Esta funcion regresa el costo del telegrama * @return Costo del
     * telegrama
     */
    public double getCosto() {
        return costo;
    }

    /**
     * * Esta funcion calcula el costo de un telegrama en funcion de su * tipo y
     * numero de palabras
     */
    public void calculaCosto() {         // Si el telegrama es ordinario         if (tipoTelegrama.charAt(0) == 'O' ||  
