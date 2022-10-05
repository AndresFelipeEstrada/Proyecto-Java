import java.util.Scanner;

public class App {
    private static Scanner sc;
    static String[][] matriz = new String[6][6];

    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);
        boolean salir = false;
        int opcion; // guardaremos la opción del usuario

        System.out.println("BIENVENIDO");

        // hacer tal instrucciones si es distinto de false
        while (!salir) {
            System.out.println("\n");
            System.out.println(" 1 - AGREGAR");
            System.out.println(" 2 - ACTUALIZAR");
            System.out.println(" 3 - BUSCAR");
            System.out.println(" 4 - ELIMINAR ");
            System.out.println(" 5 - MOSTRAR DATOS ");
            System.out.println(" 6 - Salir\n");

            try {
                System.out.println("Escribe una de las opciones: ");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        // AGREGAR DATOS MATRIZ
                        agregar();
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        // IMPRIMIR MATRIZ
                        imprimir(matriz);
                        break;
                    case 6:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 5");
                }
            } catch (Exception e) {
                System.out.println("Debes insertar un número");
                sc.next();
            }

        }

        // mayorMenor(matriz);
        sc.close();
    }

    public static void agregar() {

        String nombre, edad, telefono, direccion, correo, cc;

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Ingrese el nombre del usuario " + (i + 1));
            nombre = sc.next();
            matriz[i][0] = nombre;

            System.out.println("Ingrese la edad del usuario " + (i + 1));
            edad = sc.next();
            matriz[i][1] = edad;

            System.out.println("Ingrese el telefono del usuario " + (i + 1));
            telefono = sc.next();
            matriz[i][2] = telefono;

            System.out.println("Ingrese la direccion del usuario " + (i + 1));
            direccion = sc.next();
            matriz[i][3] = direccion;

            System.out.println("Ingrese el correo del usuario " + (i + 1));
            correo = sc.next();
            matriz[i][4] = correo;

            System.out.println("Ingrese la cedula del usuario " + (i + 1));
            cc = sc.next();
            matriz[i][5] = cc;

            for (int j = 0; j < matriz.length; j++) {

            }

        }

    }

    public static void imprimir(Object matriz[][]) {
        System.out.println("NOMBRE  | EDAD |     TELEFONO     |     DIRECCION   |     CORREO      |   CEDULA");
        for (int x = 0; x < matriz.length; x++) {
            System.out.print("|");
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print(matriz[x][y]);
                if (y != matriz[x].length - 1)
                    System.out.print("\t");
            }
            System.out.println("|");
        }
    }

    public static void mayorMenor(Object matriz[][]) {
        Object salida = "";
        for (int i = 0; i < matriz.length; i++) {
            salida = matriz[i][1];
            System.out.println(salida);
            for (int j = 0; j < matriz.length; j++) {

            }
        }
    }

}
