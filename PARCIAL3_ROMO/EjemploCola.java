import java.util.LinkedList;
import java.util.Queue;

public class EjemploCola {
    public void colaAdd(String cliente) {
        Queue<String> cola = new LinkedList<>();

        // ENQUEUE: Agregando elclienteementos a la cola
        cola.add(cliente);

        // PEEK: Consultando quién está al frente de la cola sin eliminarlo
        System.out.println("Cliente al frente: " + cola.peek());

        // DEQUEUE: Atendiendo (eliminando) al primer cliente en la cola
        System.out.println("Atendiendo a: " + cola.poll());

        // DEQUEUE: Atendiendo (eliminando) al siguiente cliente en la cola
        System.out.println("Atendiendo a: " + cola.poll());

        // PEEK: Consultando quién está ahora al frente
        System.out.println("Cliente al frente ahora: " + cola.peek());
    }
}