package speedfast;

/**
 * Clase principal que prueba el sistema de reparto SpeedFast.
 *
 * Demuestra:
 *  - Polimorfismo: una referencia de tipo Pedido apunta a distintas subclases
 *    y ejecuta la versión sobrescrita correspondiente en tiempo de ejecución.
 *  - Sobreescritura (override): asignarRepartidor() sin parámetros.
 *  - Sobrecarga (overload): asignarRepartidor(String nombreRepartidor).
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("====================================================");
        System.out.println("          SISTEMA DE REPARTO - SpeedFast");
        System.out.println("====================================================");

        // ---------- Instanciación de un objeto de cada subclase ----------
        // Se usa polimorfismo: la referencia es de tipo base Pedido.
        Pedido pedido1 = new PedidoComida(101, "Av. Providencia 1234, Santiago", true);
        Pedido pedido2 = new PedidoEncomienda(102, "Calle Los Olmos 567, Ñuñoa", 8.5, false);
        Pedido pedido3 = new PedidoExpress(103, "Pasaje El Sol 890, Maipú", 2.3);

        // Se guardan en un arreglo del tipo base para recorrerlos polimórficamente.
        Pedido[] pedidos = { pedido1, pedido2, pedido3 };

        // ---------- 1) SOBREESCRITURA + POLIMORFISMO ----------
        System.out.println("\n>>> METODOS SOBRESCRITOS (polimorfismo en tiempo de ejecucion):");
        for (Pedido pedido : pedidos) {
            // Aunque la referencia es Pedido, se ejecuta el metodo de la subclase real.
            pedido.asignarRepartidor();
        }

        // ---------- 2) SOBRECARGA ----------
        // La version con parametro String esta definida en las subclases, por lo
        // que se accede mediante referencias concretas de cada subclase.
        System.out.println("\n>>> METODOS SOBRECARGADOS (con nombre del repartidor):");

        PedidoComida comida = new PedidoComida(201, "Av. Irarrazaval 4321, Ñuñoa", true);
        comida.asignarRepartidor("Carlos Munoz");

        PedidoEncomienda encomienda = new PedidoEncomienda(202, "Calle Nueva 111, La Florida", 12.0, true);
        encomienda.asignarRepartidor("Valentina Rojas");

        PedidoExpress express = new PedidoExpress(203, "Av. Vicuna Mackenna 999, San Joaquin", 4.5);
        express.asignarRepartidor("Diego Fuentes");

        System.out.println("----------------------------------------------------");
        System.out.println("Fin de la ejecucion del sistema SpeedFast.");
    }
}