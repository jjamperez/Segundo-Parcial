public class Main {
    // Clase Node: Representa un nodo en la lista enlazada
    static class Node {
        int data;       // Valor almacenado en el nodo
        Node next;      // Referencia al siguiente nodo

        public Node(int data) {
            this.data = data;
            this.next = null;  // Por defecto, no hay siguiente nodo
        }
    }

    // Clase Lista: Maneja operaciones de la lista
    static class Lista {
        Node head;      // Primer nodo de la lista

        public Lista() {
            head = null;  // Lista vacía al inicio
        }

        // 1. Agrega un nodo al final
        public void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;  // Si la lista está vacía
            } else {
                Node current = head;
                while (current.next != null) {  // Recorre hasta el último nodo
                    current = current.next;
                }
                current.next = newNode;  // Enlaza el nuevo nodo al final
            }
        }

        // 2. Agrega un nodo al inicio
        public void addFirst(int data) {
            Node newNode = new Node(data);
            newNode.next = head;  // El nuevo nodo apunta al antiguo head
            head = newNode;       // Actualiza head al nuevo nodo
        }

        // 3. Agrega un nodo en una posición específica
        public void addMiddle(int data, int position) {
            if (position == 0) {
                addFirst(data);  // Si es posición 0, usa addFirst
                return;
            }
            Node newNode = new Node(data);
            Node current = head;
            int currentPos = 0;
            // Recorre hasta la posición anterior al destino
            while (current != null && currentPos < position - 1) {
                current = current.next;
                currentPos++;
            }
            if (current == null) {
                add(data);  // Si la posición es mayor al tamaño, agrega al final
            } else {
                newNode.next = current.next;  // Enlaza el nuevo nodo
                current.next = newNode;
            }
        }

        // 4. Elimina un nodo por valor
        public void remove(int data) {
            if (head == null) return;  // Lista vacía
            if (head.data == data) {
                head = head.next;  // Elimina el head actual
                return;
            }
            Node current = head;
            while (current.next != null) {
                if (current.next.data == data) {
                    current.next = current.next.next;  // Salta el nodo a eliminar
                    return;
                }
                current = current.next;
            }
        }

        // 5. Imprime la lista
        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }

        // 6. Revierte la lista
        public void reverse() {
            Node prev = null;
            Node current = head;
            Node next = null;
            while (current != null) {
                next = current.next;  // Guarda el siguiente nodo
                current.next = prev;  // Invierte el enlace
                prev = current;       // Avanza prev
                current = next;       // Avanza current
            }
            head = prev;  // Actualiza head al último nodo
        }

        // 7. Verifica si un valor existe
        public boolean contains(int value) {
            Node current = head;
            while (current != null) {
                if (current.data == value) {
                    return true;
                }
                current = current.next;
            }
            return false;
        }
    }

    // Método principal para pruebas (Grupo 1)
    public static void main(String[] args) {
        Lista list = new Lista();
    
        // Paso 1: Agregar 0 al inicio
        list.addFirst(0);        // ✔️ Usa addFirst()
    
        // Paso 2: Agregar 2 al final
        list.add(2);             // ✔️ Usa add()
    
        // Paso 3: Agregar 4 en posición 1 (medio)
        list.addMiddle(4, 1);    // ✔️ Usa addMiddle(4, 1)
    
        // Paso 4: Mostrar lista actual
        System.out.print("Lista actual: ");
        list.printList();        // ✔️ Llama a printList()
    
        // Paso 5: Remover el número 2
        list.remove(2);          // ✔️ Usa remove(2)
    
        // Paso 6: Mostrar lista después de eliminar
        System.out.print("Lista después de eliminar 2: ");
        list.printList();        // ✔️ Llama a printList()
    
        // Paso 7: Agregar 6 al final
        list.add(6);             // ✔️ Usa add()
    
        // Paso 8: Verificar si contiene 4
        System.out.println("¿Contiene 4? " + list.contains(4)); // ✔️ contains(4)
    
        // Paso 9: Verificar si contiene 8
        System.out.println("¿Contiene 8? " + list.contains(8)); // ✔️ contains(8)
    
        // Paso 10: Revertir la lista
        list.reverse();           // ✔️ Usa reverse()
    
        // Paso 11: Mostrar lista revertida
        System.out.print("Lista revertida: ");
        list.printList();        // ✔️ Llama a printList()
    
        // Paso 12: Agregar 8 al inicio
        list.addFirst(8);        // ✔️ Usa addFirst()
    
        // Paso 13: Mostrar lista final
        System.out.print("Lista final: ");
        list.printList();        // ✔️ Llama a printList()
    }

    
}