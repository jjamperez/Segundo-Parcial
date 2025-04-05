# Examen Parcial: Listas Enlazadas en Java

## Descripción
Implementación de una lista enlazada simple en Java que cumple con los requisitos del examen parcial. El código incluye operaciones básicas como inserción, eliminación, reversión y búsqueda de nodos, usando números del DNI del estudiante (carnet: 202402170).

---

## Tabla de Contenidos
1. [Cómo Ejecutar el Código](#cómo-ejecutar-el-código)
2. [Clases y Métodos](#clases-y-métodos)
3. [Ejemplos de Entradas/Salidas](#ejemplos-de-entradassalidas)
4. [Estructura del Proyecto](#estructura-del-proyecto)
5. [Restricciones Cumplidas](#restricciones-cumplidas)

---

## Cómo Ejecutar el Código

### Requisitos
- **Java JDK 8+** ([Descargar JDK](https://www.oracle.com/java/technologies/downloads/)).
- **Editor de código** (VS Code, IntelliJ, etc.).

### Pasos
1. **Clonar o descargar el repositorio**:
   ```bash
   git clone <URL-del-repositorio>

Ejemplos de Entradas/Salidas
// Código del main() en Main.java
LinkedList list = new LinkedList();
list.addFirst(0);      // Paso 1
list.add(2);           // Paso 2
list.addMiddle(4, 1);  // Paso 3
list.printList();      // Paso 4
list.remove(2);        // Paso 5
list.printList();      // Paso 6
list.add(6);           // Paso 7
list.contains(4);      // Paso 8 (retorna true)
list.contains(8);      // Paso 9 (retorna false)
list.reverse();        // Paso 10
list.printList();      // Paso 11
list.addFirst(8);      // Paso 12
list.printList();      // Paso 13

Salida Esperada
Lista actual: 0 4 2 
Lista después de eliminar 2: 0 4 
¿Contiene 4? true
¿Contiene 8? false
Lista revertida: 6 4 0 
Lista final: 8 6 4 0 
