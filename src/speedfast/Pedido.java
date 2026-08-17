package speedfast;

/**
 * Clase base que representa un pedido genérico del sistema SpeedFast.
 *
 * Contiene los atributos comunes a todos los tipos de pedido y el método
 * base asignarRepartidor(), que las subclases sobrescriben con su propia
 * lógica.
 *
 * Todos los atributos están encapsulados (private) y se acceden mediante
 * getters y setters.
 */
public class Pedido {

    // Atributos encapsulados (private) solicitados en el enunciado
    private int idPedido;
    private String direccionEntrega;
    private String tipoPedido;

    /**
     * Constructor completo de la clase base.
     *
     * @param idPedido         identificador único del pedido
     * @param direccionEntrega dirección de entrega del pedido
     * @param tipoPedido       tipo de pedido (Comida, Encomienda, Express)
     */
    public Pedido(int idPedido, String direccionEntrega, String tipoPedido) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.tipoPedido = tipoPedido;
    }

    /**
     * Método base con lógica genérica para asignar un repartidor.
     * Sirve como comportamiento por defecto que se personaliza (sobrescribe)
     * en cada subclase.
     */
    public void asignarRepartidor() {
        System.out.println("----------------------------------------------------");
        System.out.println("Pedido #" + idPedido + " (" + tipoPedido + ")");
        System.out.println("Dirección de entrega: " + direccionEntrega);
        System.out.println("Asignando un repartidor disponible mediante el proceso estándar de SpeedFast.");
    }

    // ------------------- Getters y Setters -------------------

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public String getTipoPedido() {
        return tipoPedido;
    }

    public void setTipoPedido(String tipoPedido) {
        this.tipoPedido = tipoPedido;
    }
}