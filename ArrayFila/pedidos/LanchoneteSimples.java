package ArrayFila.pedidos;


public class LanchoneteSimples {
        public static void main(String[] args) {
        QueuePedido filaPedidos = new QueuePedido(3);

        // Fazendo pedidos
        Pedido pedido1 = new Pedido("Hamburguer", 1);
        Pedido pedido2 = new Pedido("Batata Frita", 2);
        Pedido pedido3 = new Pedido("Refrigerante", 3);

            if (!filaPedidos.isFull()) {
                filaPedidos.enqueue(pedido1);
            }else{
                System.out.println("Lista cheia");
            }

            
            if (!filaPedidos.isFull()) {
                filaPedidos.enqueue(pedido2);
            }else{
                System.out.println("Lista cheia");
            }

            
            if (!filaPedidos.isFull()) {
                filaPedidos.enqueue(pedido3);
            }else{
                System.out.println("Lista cheia");
            }

            
            if (!filaPedidos.isFull()) {
                filaPedidos.enqueue(pedido1);
            }else{
                System.out.println("Lista cheia");
            }

        System.out.println("Pedidos feitos:");

        while (!filaPedidos.isEmpty()) {
            Pedido pedido = filaPedidos.dequeue();
            System.out.println("Pedido entregue: " + pedido);
        }

        System.out.println("Todos os pedidos foram entregues.");
    }
}

