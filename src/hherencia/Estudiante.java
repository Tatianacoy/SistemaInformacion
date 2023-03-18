package hherencia;
import javax.swing.JOptionPane;
import java.util.ArrayList;
    

public class Estudiante extends SistemaInformacion {
    private String carnet;
    private double promedioNotas;
    private int numeroMaterias;

    public Estudiante() {
        super();
        this.carnet = "";
        this.promedioNotas = 0.0;
        this.numeroMaterias = 0;
    }

    public Estudiante(String nombre, String apellido, int edad, String carnet, double promedioNotas, int numeroMaterias) {
        
        this.carnet = carnet;
        this.promedioNotas = promedioNotas;
        this.numeroMaterias = numeroMaterias;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public double getPromedioNotas() {
        return promedioNotas;
    }

    public void setPromedioNotas(double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }

    public int getNumeroMaterias() {
        return numeroMaterias;
    }

    public void setNumeroMaterias(int numeroMaterias) {
        this.numeroMaterias = numeroMaterias;
    }

    public void calcularPromedio() {
        double totalNotas = 0.0;
        for (int i = 0; i < numeroMaterias; i++) {
            System.out.print("Ingrese la nota de la materia " + (i + 1) + ": ");
            double nota = input.nextDouble();
            totalNotas += nota;
        }
        this.promedioNotas = totalNotas / numeroMaterias;
    }

    public void leerNotasEstudiante() {
        calcularPromedio();
    }

    public void ingresarDatosEstudiante() {
        super.ingresarDatos();
        System.out.print("Ingrese el carnet del estudiante: ");
        this.carnet = input.next();
        System.out.print("Ingrese el numero de materias que cursa: ");
        this.numeroMaterias = input.nextInt();
        calcularPromedio();
    }

    public void imprimirReporteNotasEstudiante() {
        System.out.println("Datos del Estudiante:");
        System.out.println("\tNombre: " + super.getNombre());
        System.out.println("\tApellido: " + super.getApellido());
        System.out.println("\tEdad: " + super.getEdad());
        System.out.println("\tCarnet: " + this.carnet);
        System.out.println("\tNumero de materias: " + this.numeroMaterias);
        System.out.println("\tPromedio de notas: " + this.promedioNotas);
    }
}






