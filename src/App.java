import java.util.Scanner;

public class App {

    private static Scanner sc;
    static String[][] matriz = new String[6][6];
    static String nombre, telefono, direccion, correo, cc;
    static int edad;

    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        System.out.println("BIENVENIDO");

        while (!salir) {
            System.out.println("\n");
            System.out.println(" 1 - AGREGAR");
            System.out.println(" 2 - ACTUALIZAR");
            System.out.println(" 3 - BUSCAR");
            System.out.println(" 4 - ELIMINAR ");
            System.out.println(" 5 - MOSTRAR DATOS ");
            System.out.println(" 6 - Salir\n");

            try {
                System.out.println("Elige una opcion: ");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        agregar();
                        break;
                    case 2:
                        actualiar(matriz);
                        break;
                    case 3:
                        buscar(matriz);
                        break;
                    case 4:
                        eliminar(matriz);
                        break;
                    case 5:
                        imprimir(matriz);
                        mostrarMayor(matriz);
                        mostrarMenor(matriz);
                        break;
                    case 6:
                        salir = true;
                        break;
                }
            } catch (Exception e) {
                System.out.println("ERROR: " + e);
                sc.next();
            }
        }
        sc.close();
    }

    public static void agregar() {

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Ingrese el nombre del usuario " + (i + 1));
            nombre = sc.next();
            matriz[i][0] = nombre;

            System.out.println("Ingrese la edad del usuario " + (i + 1));
            edad = sc.nextInt();
            matriz[i][1] = Integer.toString(edad);

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

        }
    }

    public static void buscar(String matriz[][]) {
        boolean buscar = false;
        System.out.println("Ingrese la cedula del usuario que desea buscar: ");
        String dato = sc.next();

        for (int i = 0; i < matriz.length; i++) {

            if (matriz[i][5].equals(dato)) {
                System.out.print(" Nombre: " + matriz[i][0] +
                        " EDAD: " + matriz[i][1] +
                        " TELEFONO: " + matriz[i][2] +
                        " DIRECCION: " + matriz[i][3] +
                        " CORREO: " + matriz[i][4] +
                        " C.C: " + matriz[i][5]);

                buscar = true;

            }

        }
        if (buscar == false) {
            System.out.println("EL USUARIO NO SE HA ENCONTRADO");
        }
    }

    public static void eliminar(String matriz[][]) {
        boolean eliminar = false;
        System.out.println("Ingrese la cedula del usuario que desea eliminar: ");
        String dato = sc.next();

        for (int i = 0; i < matriz.length; i++) {

            if (matriz[i][5].equals(dato) || matriz[i][5] == null) {
                matriz[i][0] = Integer.toString(0);
                matriz[i][1] = Integer.toString(0);
                matriz[i][2] = Integer.toString(0);
                matriz[i][3] = Integer.toString(0);
                matriz[i][4] = Integer.toString(0);
                matriz[i][5] = Integer.toString(0);

                eliminar = true;

                System.out.println("SE HA ELIMINADO EL USUARIO");

            }

        }
        if (eliminar == false) {
            System.out.println("EL USUARIO NO SE HA ENCONTRADO");
        }
    }

    public static void actualiar(String matriz[][]) {
        boolean modificado = false;
        System.out.println("Ingrese la cedula del usuario que desea actualizar: ");
        String dato = sc.next();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j].equals(dato)) {

                    System.out.println("Ingrese el nombre del usuario ");
                    nombre = sc.next();
                    matriz[i][0] = nombre;

                    System.out.println("Ingrese la edad del usuario ");
                    edad = sc.nextInt();
                    matriz[i][1] = Integer.toString(edad);

                    System.out.println("Ingrese el telefono del usuario ");
                    telefono = sc.next();
                    matriz[i][2] = telefono;

                    System.out.println("Ingrese la direccion del usuario ");
                    direccion = sc.next();
                    matriz[i][3] = direccion;

                    System.out.println("Ingrese el correo del usuario ");
                    correo = sc.next();
                    matriz[i][4] = correo;

                    System.out.println("Ingrese la cedula del usuario ");
                    cc = sc.next();
                    matriz[i][5] = cc;

                    modificado = true;

                }
            }
        }
        if (modificado == false) {
            System.out.println("La cedula no existe dentro de la matriz");
        }

    }

    public static void imprimir(String matriz[][]) {
        System.out.println("NOMBRE  | EDAD |     TELEFONO     |     DIRECCION   |     CORREO      |   CEDULA");

        for (int x = 0; x < matriz.length; x++) {

            for (int y = 0; y < matriz[x].length; y++) {

                System.out.print(matriz[x][y]);

                if (y != matriz[x].length - 1)
                    System.out.print("\t");

            }
            System.out.println("|");
        }

    }

    public static void mostrarMayor(String matriz[][]) {

        int mayor = Integer.parseInt(matriz[0][1]);
        String nombreMayor = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            if (Integer.parseInt(matriz[i][1]) > mayor) {
                mayor = Integer.parseInt(matriz[i][1]);
                nombreMayor = matriz[i][0];

            }
        }
        System.out.println("el mayor es: " + nombreMayor);
    }

    public static void mostrarMenor(String matriz[][]) {

        int menor = Integer.parseInt(matriz[0][1]);
        String nombreMenor = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {

            if (Integer.parseInt(matriz[i][1]) < menor) {
                menor = Integer.parseInt(matriz[i][1]);
                nombreMenor = matriz[i][0];

            }
        }
        System.out.println("el menor es: " + nombreMenor);
    }
}
