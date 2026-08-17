package speedfast;

/**
 * Pedido de tipo Compra Express (supermercado o farmacia).
 *
 * Criterio de asignación: debe asignarse al repartidor más cercano con
 * disponibilidad inmediata.
 */
public class PedidoExpress extends Pedido {

    // Atributo propio de este tipo de pedido
    private double distanciaRepartidorKm;

    /**
     * Constructor completo. Fija el tipoPedido como "Express" mediante super().
     *
     * @param idPedido              identificador único del pedido
     * @param direccionEntrega      dirección de entrega
     * @param distanciaRepartidorKm distancia del repartidor más cercano en km
     */
    public PedidoExpress(int idPedido, String direccionEntrega, double distanciaRepartidorKm) {
        super(idPedido, direccionEntrega, "Express");
        this.distanciaRepartidorKm = distanciaRepartidorKm;
    }

    /**
     * Sobreescritura (override) del método genérico con la lógica propia de Express.
     */
    @Override
    public void asignarRepartidor() {
        System.out.println("----------------------------------------------------");
        System.out.println("Pedido #" + getIdPedido() + " (" + getTipoPedido() + ")");
        System.out.println("Dirección de entrega: " + getDireccionEntrega());
        System.out.println("Buscando el repartidor MÁS CERCANO con disponibilidad inmediata (a " + distanciaRepartidorKm + " km).");
    }

    /**
     * Sobrecarga (overload) del método: recibe el nombre del repartidor
     * e incorpora la validación de cercanía y disponibilidad.
     *
     * @param nombreRepartidor nombre del repartidor asignado
     */
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("----------------------------------------------------");
        System.out.println("Pedido #" + getIdPedido() + " (" + getTipoPedido() + ")");
        System.out.println("Repartidor asignado: " + nombreRepartidor);
        System.out.println("Distancia al punto de retiro: " + distanciaRepartidorKm + " km.");
        if (distanciaRepartidorKm <= 3.0) {
            System.out.println("Validación: " + nombreRepartidor + " está cerca y disponible de inmediato. Asignación exitosa.");
        } else {
            System.out.println("Advertencia: " + nombreRepartidor + " está a más de 3 km. Se recomienda buscar un repartidor más cercano.");
        }
    }

    // ------------------- Getter y Setter -------------------

    public double getDistanciaRepartidorKm() {
        return distanciaRepartidorKm;
    }

    public void setDistanciaRepartidorKm(double distanciaRepartidorKm) {
        this.distanciaRepartidorKm = distanciaRepartidorKm;
    }
}