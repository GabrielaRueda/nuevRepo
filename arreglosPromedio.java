import javax.swing.JOptionPane;
public class arreglosPromedio {
    public static void main(String[] args) {
        
        String Materia[] = {"CALCDIF", "MATEDIS", "FUNDPRO", "FUNDINV", "QUIMICA",
            "DESSUS"};
        String Encabezado[] = {"Materia", "U1", "U2", "U3", "U4", "U5", "Promedio"};
        byte calificaciones[][] = new byte[6][5];
        byte x, y;
        
        double promedio;
        double[] promedioUnidad = new double[5];  
        double promedioFinal = 0;  
        
        // Ingresa calificaciones de las materias
        for (x = 0; x <= 5; x++) {  // filas
            for (y = 0; y < 5; y++) {  // columnas
                calificaciones[x][y] = Byte.parseByte(JOptionPane.showInputDialog(""
                        + "Ingresa Calificación de " + Materia[x] + " UNIDAD " + (y + 1)));
            }
        }

        // Impresión de encabezado
        
        
        for (x = 0; x < 7; x++) {  
            System.out.printf(Encabezado[x] + "\t");
        }
        System.out.println();

        for (x = 0; x <= 5; x++) {  // filas
            System.out.print(Materia[x] + "\t");
            int suma = 0; 

            for (y = 0; y < 5; y++) {   // columnas
                System.out.print(calificaciones[x][y] + "\t");
                suma += calificaciones[x][y];  
            }   
            promedio = suma / 5.0;
            System.out.printf("%.2f", promedio); 
            System.out.println();

            promedioFinal=promedioFinal + promedio;

            for (y = 0; y < 5; y++) {
                promedioUnidad[y]=promedioUnidad[y] + calificaciones[x][y];
            }
        }

        System.out.print("Promedio Unidad\t");
        for (y = 0; y < 5; y++) {
            System.out.printf("%.2f\t", promedioUnidad[y] / 6.0); 
        }
        System.out.println();

        promedioFinal=promedioFinal/ 6; 
        System.out.printf("Promedio Final: %.2f\n", promedioFinal);
    }
}
