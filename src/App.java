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

        String cedula05 = matriz[0][5];
        String cedula15 = matriz[1][5];
        String cedula25 = matriz[2][5];
        String cedula35 = matriz[3][5];
        String cedula45 = matriz[4][5];
        String cedula55 = matriz[5][5];

        if (cedula05.equals(cedula15) || cedula05.equals(cedula25) || cedula05.equals(cedula35)
                || cedula05.equals(cedula45) || cedula05.equals(cedula55)) {
            System.out.println("ERROR LA CEDULA " + cedula05 + " YA HA SIDO INGRESADA ");

        } else if (cedula15.equals(cedula05) || cedula15.equals(cedula25) || cedula15.equals(cedula35)
                || cedula15.equals(cedula45) || cedula15.equals(cedula55)) {
            System.out.println("ERROR LA CEDULA " + cedula15 + " YA HA SIDO INGRESADA ");

        } else if (cedula25.equals(cedula05) || cedula25.equals(cedula15) || cedula25.equals(cedula35)
                || cedula25.equals(cedula45) || cedula25.equals(cedula55)) {
            System.out.println("ERROR LA CEDULA " + cedula25 + " YA HA SIDO INGRESADA ");

        } else if (cedula35.equals(cedula05) || cedula35.equals(cedula15) || cedula35.equals(cedula25)
                || cedula35.equals(cedula45) || cedula35.equals(cedula55)) {
            System.out.println("ERROR LA CEDULA " + cedula35 + " YA HA SIDO INGRESADA ");

        } else if (cedula45.equals(cedula05) || cedula45.equals(cedula15) || cedula45.equals(cedula25)
                || cedula45.equals(cedula35) || cedula45.equals(cedula55)) {
            System.out.println("ERROR LA CEDULA " + cedula45 + " YA HA SIDO INGRESADA ");

        } else if (cedula55.equals(cedula05) || cedula55.equals(cedula15) || cedula55.equals(cedula25)
                || cedula55.equals(cedula35) || cedula55.equals(cedula45)) {
            System.out.println("ERROR LA CEDULA " + cedula55 + " YA HA SIDO INGRESADA ");
        }

    }

    public static void buscar(Object matriz[][]) {
        boolean buscar = false;
        System.out.println("Ingrese la cedula del usuario que desea buscar: ");
        String dato = sc.next();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j].equals(dato)) {
                    System.out.print(" Nombre: " + matriz[i][0] +
                            " EDAD: " + matriz[i][1] +
                            " TELEFONO: " + matriz[i][2] +
                            " DIRECCION: " + matriz[i][3] +
                            " CORREO: " + matriz[i][4] +
                            " C.C: " + matriz[i][5]);

                    buscar = true;

                }
            }
        }
        if (buscar == false) {
            System.out.println("EL USUARIO NO SE HA ENCONTRADO");
        }
    }

    public static void eliminar(Object matriz[][]) {
        boolean eliminar = false;
        System.out.println("Ingrese la cedula del usuario que desea eliminar: ");
        String dato = sc.next();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j].equals(dato)) {
                    matriz[i][0] = null;
                    matriz[i][1] = null;
                    matriz[i][2] = null;
                    matriz[i][3] = null;
                    matriz[i][4] = null;
                    matriz[i][5] = null;

                    eliminar = true;

                    System.out.println("SE HA ELIMINADO EL USUARIO");

                }
            }
        }
        if (eliminar == false) {
            System.out.println("EL USUARIO NO SE HA ENCONTRADO");
        }
    }

    public static void actualiar(Object matriz[][]) {
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
