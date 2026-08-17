package speedfast;

/**
 * Pedido de tipo Comida (restaurantes).
 *
 * Criterio de asignación: requiere un repartidor con mochila térmica
 * para conservar la temperatura de los alimentos.
 */
public class PedidoComida extends Pedido {

    // Atributo propio de este tipo de pedido
    private boolean requiereMochilaTermica;

    /**
     * Constructor completo. Fija el tipoPedido como "Comida" mediante super().
     *
     * @param idPedido               identificador único del pedido
     * @param direccionEntrega       dirección de entrega
     * @param requiereMochilaTermica indica si el pedido exige mochila térmica
     */
    public PedidoComida(int idPedido, String direccionEntrega, boolean requiereMochilaTermica) {
        super(idPedido, direccionEntrega, "Comida");
        this.requiereMochilaTermica = requiereMochilaTermica;
    }

    /**
     * Sobreescritura (override) del método genérico con la lógica propia de Comida.
     */
    @Override
    public void asignarRepartidor() {
        System.out.println("----------------------------------------------------");
        System.out.println("Pedido #" + getIdPedido() + " (" + getTipoPedido() + ")");
        System.out.println("Dirección de entrega: " + getDireccionEntrega());
        System.out.println("Buscando repartidor con MOCHILA TÉRMICA para conservar la temperatura de los alimentos.");
    }

    /**
     * Sobrecarga (overload) del método: recibe el nombre del repartidor
     * e incorpora la validación de la mochila térmica.
     *
     * @param nombreRepartidor nombre del repartidor asignado
     */
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("----------------------------------------------------");
        System.out.println("Pedido #" + getIdPedido() + " (" + getTipoPedido() + ")");
        System.out.println("Repartidor asignado: " + nombreRepartidor);
        if (requiereMochilaTermica) {
            System.out.println("Validación: se confirma que " + nombreRepartidor + " cuenta con mochila térmica. Asignación exitosa.");
        } else {
            System.out.println("Validación: este pedido no requiere mochila térmica. Asignación exitosa.");
        }
    }

    // ------------------- Getter y Setter -------------------

    public boolean isRequiereMochilaTermica() {
        return requiereMochilaTermica;
    }

    public void setRequiereMochilaTermica(boolean requiereMochilaTermica) {
        this.requiereMochilaTermica = requiereMochilaTermica;
    }
}