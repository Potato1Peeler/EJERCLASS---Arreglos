package depart;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Depart {
    private final String[] departamentos = {"Ropa", "Deportes", "Juguetería"};
    private final int[][] datos = new int[12][departamentos.length];
    private final String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    private int encontrarIndice(String[] vector, String dato) {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i].equals(dato)) {
                return i;
            }
        }
        throw new IllegalArgumentException("El dato '" + dato + "' no está en el vector.");
    }

    public void ponerVentasMensuales(String departamento, Map<String, Integer> ventasMensuales) {
        int deptIndex = encontrarIndice(departamentos, departamento);

        for (Map.Entry<String, Integer> entry : ventasMensuales.entrySet()) {
            String mes = entry.getKey();
            int ventas = entry.getValue();
            int mesIndex = encontrarIndice(meses, mes);
            datos[mesIndex][deptIndex] = ventas;
        }
    }

    public int buscarVentas(String mes, String departamento) {
        int mesIndex = encontrarIndice(meses, mes);
        int deptIndex = encontrarIndice(departamentos, departamento);
        return datos[mesIndex][deptIndex];
    }

    public void eliminarVentas(String departamento) {
        int deptIndex = encontrarIndice(departamentos, departamento);
        for (int i = 0; i < 12; i++) {
            datos[i][deptIndex] = 0;
        }
    }

    public void matrizVentas() {
        System.out.println("Mes        Ropa     Deportes  Juguetería");
        for (int fila = 0; fila < 12; fila++) {
            System.out.printf("%-10s %7d %10d %12d%n",
                meses[fila],
                datos[fila][0],
                datos[fila][1],
                datos[fila][2]);
        }
    }

    public static void main(String[] args) {
        Depart tienda = new Depart();

        Map<String, Integer> ventasRopa = new HashMap<>();
        ventasRopa.put("Enero", 1000);
        ventasRopa.put("Febrero", 1100);
        ventasRopa.put("Marzo", 1200);
        ventasRopa.put("Abril", 1300);
        ventasRopa.put("Mayo", 1400);
        ventasRopa.put("Junio", 1500);
        ventasRopa.put("Julio", 1600);
        ventasRopa.put("Agosto", 1700);
        ventasRopa.put("Septiembre", 1800);
        ventasRopa.put("Octubre", 1900);
        ventasRopa.put("Noviembre", 2000);
        ventasRopa.put("Diciembre", 2100);

        Map<String, Integer> ventasDeportes = new HashMap<>();
        ventasDeportes.put("Enero", 5001);
        ventasDeportes.put("Febrero", 100);
        ventasDeportes.put("Marzo", 3200);
        ventasDeportes.put("Abril", 3100);
        ventasDeportes.put("Mayo", 5400);
        ventasDeportes.put("Junio", 1000);
        ventasDeportes.put("Julio", 20000);
        ventasDeportes.put("Agosto", 50000);
        ventasDeportes.put("Septiembre", 11800);
        ventasDeportes.put("Octubre", 1900);
        ventasDeportes.put("Noviembre", 98000);
        ventasDeportes.put("Diciembre", 12100);

        Map<String, Integer> ventasJugueteria = new HashMap<>();
        ventasJugueteria.put("Enero", 100);
        ventasJugueteria.put("Febrero", 890);
        ventasJugueteria.put("Marzo", 3764);
        ventasJugueteria.put("Abril", 8922);
        ventasJugueteria.put("Mayo", 8971);
        ventasJugueteria.put("Junio", 5673);
        ventasJugueteria.put("Julio", 8721);
        ventasJugueteria.put("Agosto", 5420);
        ventasJugueteria.put("Septiembre", 5678);
        ventasJugueteria.put("Octubre", 1128);
        ventasJugueteria.put("Noviembre", 12974);
        ventasJugueteria.put("Diciembre", 142170);

        tienda.ponerVentasMensuales("Ropa", ventasRopa);
        tienda.ponerVentasMensuales("Deportes", ventasDeportes);
        tienda.ponerVentasMensuales("Juguetería", ventasJugueteria);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el mes a buscar: ");
        String ventasMes = scanner.nextLine();
        System.out.print("Ingrese el departamento a buscar: ");
        String ventasDepart = scanner.nextLine();

        try {
            int ventasMesDepartamento = tienda.buscarVentas(ventasMes, ventasDepart);
            System.out.println("La venta del mes buscado es: " + ventasMesDepartamento);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        tienda.matrizVentas();

        System.out.print("¿De qué departamento deseas eliminar las ventas? ");
        String ventasDepartEliminar = scanner.nextLine();

        try {
            tienda.eliminarVentas(ventasDepartEliminar);
            System.out.println("\nVentas luego de eliminar el departamento " + ventasDepartEliminar + ":");
            tienda.matrizVentas();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}

