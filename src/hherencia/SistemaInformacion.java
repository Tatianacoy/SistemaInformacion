
package hherencia;
import javax.swing.JOptionPane;

public class SistemaInformacion{
    
    public SistemaInformacion(){
    }
    
    public static void main(String[]args){
        int opcion;
        Persona sistemaInformacion = new Persona();
        try{
            OUTER:
            do {
                opcion = sistemaInformacion.leerDatoTipoEntero("Ingrese la opcion 1 para procesar los datos del empleado, 3 para salir:");
                switch (opcion) {
                    case 1:
                        JOptionPane.showMessageDialog(null,"Procesando datos del empleado");
                        Empleado manejadorEmpleado = new Empleado();
                        manejadorEmpleado = manejadorEmpleado.ingresarDatosEmpleado();
                        manejadorEmpleado.imprimirReporteEstadoEmpleado();
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null,"Saliendo del Sistema");
                        break OUTER;
                    default:
                        JOptionPane.showMessageDialog(null,"Opción inválida");
                        break;
                }
            } while (opcion <= 1 || opcion >= 3);
        }catch (Exception e){
        JOptionPane.showMessageDialog(null,"Error en la digitación: ");
        //  errorMain.printStackTrace();}
          
        }
    }

    void ingresarDatos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}   

