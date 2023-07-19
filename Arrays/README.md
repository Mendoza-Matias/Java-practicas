## Practica con Arrays.
---

>En Java, un "array" es una estructura de datos que permite almacenar una colección de elementos del mismo tipo de datos, con un tamaño fijo y ordenado. Los arrays se utilizan para almacenar múltiples valores en una sola variable, lo que facilita el acceso y la manipulación de los datos.Un array se declara especificando el tipo de datos de los elementos que contendrá y el tamaño del array. La sintaxis general para declarar un array en Java es la siguiente:


~~~java

int[]miArray = new int[10];
//Declarando la creación de un Array  en java
~~~

### Estructura:
+ tipo: Es el tipo de datos de los elementos que contendrá el array (por ejemplo, int, double, String, etc.).
+ nombreArray: Es el nombre que le das al array.
+ tamaño: Es el número de elementos que contendrá el array

--- 
### Ejemplos : 

~~~java

public class EjemploArray {
    public static void main(String[] args) {
        // Declaración e inicialización de un array de enteros con 5 elementos
        int[] numeros = new int[5];

        // Asignación de valores a los elementos del array
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        // Acceso a los elementos del array y muestra de los valores
        System.out.println("Elemento 1: " + numeros[0]); // Salida: 10
        System.out.println("Elemento 3: " + numeros[2]); // Salida: 30
        System.out.println("Elemento 5: " + numeros[4]); // Salida: 50
    }
}

~~~

### Metodos de un Array:

> length: Este es un atributo y no un método, pero es importante mencionarlo. Proporciona el tamaño del array, es decir, el número de elementos que contiene.

> System.arraycopy(): Copia una porción específica de un array a otro array. Es útil cuando se desea copiar datos de un array a otro o cuando se necesita hacer una copia de seguridad de un array.

> Arrays.toString(): Convierte un array en una representación de cadena (String), que muestra los elementos del array entre corchetes y separados por comas.

> Arrays.sort(): Ordena los elementos de un array en orden ascendente. Requiere que los elementos sean comparables, ya que utiliza el método compareTo() o compare() dependiendo del tipo de datos.

> Arrays.binarySearch(): Realiza una búsqueda binaria en el array para encontrar un elemento específico. Sin embargo, para usar este método, el array debe estar ordenado previamente mediante Arrays.sort().

> Arrays.fill(): Llena el array con un valor específico. Puede ser útil para inicializar un array con valores predeterminados.

~~~java

import java.util.Arrays;

public class EjemploArrays {
    public static void main(String[] args) {
        int[] numeros = {5, 2, 8, 1, 3};

        // Usando length para obtener el tamaño del array
        int tamano = numeros.length;
        System.out.println("Tamaño del array: " + tamano); // Salida: Tamaño del array: 5

        // Usando System.arraycopy() para copiar un array
        int[] copiaNumeros = new int[tamano];
        System.arraycopy(numeros, 0, copiaNumeros, 0, tamano);
        System.out.println("Copia del array: " + Arrays.toString(copiaNumeros)); // Salida: Copia del array: [5, 2, 8, 1, 3]

        // Usando Arrays.sort() para ordenar el array
        Arrays.sort(numeros);
        System.out.println("Array ordenado: " + Arrays.toString(numeros)); // Salida: Array ordenado: [1, 2, 3, 5, 8]

        // Usando Arrays.binarySearch() para buscar un elemento en el array
        int indice = Arrays.binarySearch(numeros, 3);
        System.out.println("Índice del elemento 3: " + indice); // Salida: Índice del elemento 3: 2

        // Usando Arrays.fill() para llenar el array con un valor específico
        Arrays.fill(numeros, 0);
        System.out.println("Array después de llenarlo con ceros: " + Arrays.toString(numeros)); // Salida: Array después de llenarlo con ceros: [0, 0, 0, 0, 0]
    }
}
~~~