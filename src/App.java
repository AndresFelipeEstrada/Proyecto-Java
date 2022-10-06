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
                System.out.println("Escribe una de las opciones: ");
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
                        break;
                    case 6:
                        salir = true;
                        break;
                }
            } catch (Exception e) {
                System.out.println("ERROR EN EL SISTEMA: " + e);
                sc.next();
            }
        }

        // mayorMenor(matriz);
        sc.close();
    }

    public static void agregar() {

        for (int i = 0; i < 6; i++) {

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

                    System.out.println("SE HA ELIMINA EL USUARIO");

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
                    matriz[i][1] = edad;

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

    public static void imprimir(Object matriz[][]) {

        System.out.println("NOMBRE  | EDAD |     TELEFONO     |     DIRECCION   |     CORREO      |   CEDULA");
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {

                System.out.print(matriz[x][y]);

                if (y != matriz[x].length - 1)
                    System.out.print("\t");

            }
            System.out.println("|");
        }

        System.out.println("--------------------MAYOR Y MENOR----------------------------------------------");
        int numeroMayor;
        int numeroMenor;
        numeroMayor = numeroMenor = (int) matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                
                if (Integer.parseInt((String) matriz[i][1]) > numeroMayor) {
                    numeroMayor = Integer.parseInt((String) matriz[0][1]);
                }
    
                if (Integer.parseInt((String) matriz[i][1]) <= numeroMenor) {
                    numeroMenor = Integer.parseInt((String) matriz[0][1]);
                }
            }
        }

        System.out.println("Numero mayor: " + numeroMayor);
        System.out.println("Numero menor: " + numeroMenor);

    }

    public static void verificacion(String cc, Object matriz[][]) {
        boolean encontrado = false;
        for (int i = 0; i < matriz.length; i++) {

            if (matriz[i][0].equals(cc)) {
                encontrado = true;
            } else {
                encontrado = false;
            }

        }
        if (encontrado == true) {
            System.out.println("La cedula " + cc + " esta registrado");
        } else {
            System.out.println("La cedula " + cc + " no esta registrado");
        }

    }
}
