
package hherencia;

import javax.swing.JOptionPane;

public class Empleado extends Persona{
    private double salario;
    private String codigoLaboral;
    private boolean esEmpleadoFijo;
    
    public Empleado(){
        
    }
    
    public Empleado (String nombre, String apellido, int edad, int peso,double salario, String codigoLaboral, boolean esEmpleadoFijo){
        super(nombre, apellido, edad, peso);
        this.salario = salario;
        this.codigoLaboral = codigoLaboral;
        this.esEmpleadoFijo = esEmpleadoFijo;
    }
    
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getCodigoLaboral() {
        return codigoLaboral;
    }
    public void setCodigoLaboral(String codigoLaboral) {
        this.codigoLaboral = codigoLaboral;
    }
    public boolean isEsEmpleadoFijo() 
    {
        return esEmpleadoFijo;
    }
    public void setEsEmpleadoFijo(boolean esEmpleadoFijo) 
    {
        this.esEmpleadoFijo = esEmpleadoFijo;
    }
    
    public double calcularSalario (boolean esEmpleadoFijo, double valorHora, int numeroHorasTrabajadas)
    {
        double salario = 0.0;
        double bono = 0.0;
        if (esEmpleadoFijo == true){
            bono = 5200.00;
        }
        else{
            bono = 1200.00;
        }
        salario = numeroHorasTrabajadas * valorHora + bono;
        return (salario);
    }
    public void imprimirAsignacionSalario (String nombre, double sueldo){
        JOptionPane.showMessageDialog(null,"El empleado " + nombre +" recibe un salario de " + sueldo);
    }
    
    public Empleado ingresarDatosEmpleado (){
        Empleado nuevoEmpleado = new Empleado();
    
    String nombre = "";
    String apellido = "";
    int edad = 0;
    double peso = 0.0;
    int numeroHoras = 0;
    double valorHora = 0.0;
    double salario = 0.0;
    boolean esEmpleadoFijo = false;
    String codigo = "";
    codigo = leerDatoTipoCadena("Ingrese el código del empleado: ");
    nombre = leerDatoTipoCadena("Ingrese el nombre del empleado: ");
    apellido = leerDatoTipoCadena("Ingrese el apellido del empleado: ");
    edad = leerDatoTipoEntero("Ingrese la edad del empleado: ");
    peso = leerDatoTipoReal("Ingrese el peso del empleado: ");
    
    numeroHoras = leerDatoTipoEntero("Ingrese el número de horas trabajadas por el empleado: ");
    valorHora = leerDatoTipoReal("Ingrese el valor de la hora: ");
    esEmpleadoFijo = leerDatoTipoBooleano("¿El empleado es fijo(true/false)?: ");
    salario = calcularSalario(esEmpleadoFijo, valorHora,numeroHoras);
    
    nuevoEmpleado.setNombre(nombre);
    nuevoEmpleado.setApellido(apellido);
    nuevoEmpleado.setCodigoLaboral(codigo);
    nuevoEmpleado.setEdad(edad);nuevoEmpleado.setPeso(peso);
    nuevoEmpleado.setSalario(salario);
    nuevoEmpleado.setEsEmpleadoFijo(esEmpleadoFijo);
    return (nuevoEmpleado);
    }
    
    public void imprimirReporteEstadoEmpleado(){
        imprimirDatosPersona();
        JOptionPane.showMessageDialog(null,"El codigo laboral del empleado es:"+codigoLaboral);
        imprimirAsignacionSalario(nombre,salario);
        if(esEmpleadoFijo==true){
            JOptionPane.showMessageDialog(null,"El empleado es un trabajador fijo de la empresa");
        }
        else{
            JOptionPane.showMessageDialog(null,"El empleado es un trabajador contratado de la empresa");
        }
    }
    
    public void definirEstadoPersona(int edad){
        String estado="";
        if (edad<10){
            estado="Menor de edad legal";
        }
        else{
            estado="Mayor de edad legal";
        }
        JOptionPane.showMessageDialog(null,"LA persona" + nombre + "" + apellido + "es" + estado);
    }

    private void setNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setApellido(String apellido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}   
