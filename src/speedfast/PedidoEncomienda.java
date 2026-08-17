package speedfast;

/**
 * Pedido de tipo Encomienda (documentos o paquetes).
 *
 * Criterio de asignación: requiere validación de peso y embalaje antes
 * de asignar al repartidor.
 */
public class PedidoEncomienda extends Pedido {

    // Atributos propios de este tipo de pedido
    private double pesoKg;
    private boolean embalajeValidado;

    /**
     * Constructor completo. Fija el tipoPedido como "Encomienda" mediante super().
     *
     * @param idPedido         identificador único del pedido
     * @param direccionEntrega dirección de entrega
     * @param pesoKg           peso del paquete en kilogramos
     * @param embalajeValidado indica si el embalaje ya fue validado
     */
    public PedidoEncomienda(int idPedido, String direccionEntrega, double pesoKg, boolean embalajeValidado) {
        super(idPedido, direccionEntrega, "Encomienda");
        this.pesoKg = pesoKg;
        this.embalajeValidado = embalajeValidado;
    }

    /**
     * Sobreescritura (override) del método genérico con la lógica propia de Encomienda.
     */
    @Override
    public void asignarRepartidor() {
        System.out.println("----------------------------------------------------");
        System.out.println("Pedido #" + getIdPedido() + " (" + getTipoPedido() + ")");
        System.out.println("Dirección de entrega: " + getDireccionEntrega());
        System.out.println("Validando peso (" + pesoKg + " kg) y embalaje antes de asignar el repartidor.");
    }

    /**
     * Sobrecarga (overload) del método: recibe el nombre del repartidor
     * e incorpora la validación de peso y embalaje.
     *
     * @param nombreRepartidor nombre del repartidor asignado
     */
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("----------------------------------------------------");
        System.out.println("Pedido #" + getIdPedido() + " (" + getTipoPedido() + ")");
        System.out.println("Repartidor asignado: " + nombreRepartidor);
        System.out.println("Validación de peso: " + pesoKg + " kg registrados.");
        if (embalajeValidado) {
            System.out.println("Validación de embalaje: correcto. " + nombreRepartidor + " puede transportar la encomienda. Asignación exitosa.");
        } else {
            System.out.println("Validación de embalaje: PENDIENTE. Se requiere revisar el embalaje antes de que " + nombreRepartidor + " retire la encomienda.");
        }
    }

    // ------------------- Getters y Setters -------------------

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    public boolean isEmbalajeValidado() {
        return embalajeValidado;
    }

    public void setEmbalajeValidado(boolean embalajeValidado) {
        this.embalajeValidado = embalajeValidado;
    }
}