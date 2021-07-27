/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author carli
 */
public class Empleado extends Persona{
     private String codigo_empleado;
     private String puesto;
     private String nit;

    public Empleado(String codigo_empleado, String puesto, String nit, String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento) {
        super(nombres, apellidos, direccion, telefono, fecha_nacimiento);
        this.codigo_empleado = codigo_empleado;
        this.puesto = puesto;
        this.nit = nit;
    }

  public String getCodigo_empleado() {
        return codigo_empleado;
    }

    public void setCodigo_empleado(String codigo_empleado) {
        this.codigo_empleado = codigo_empleado;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    
    @Override
     public void agregar(){
    System.out.println("Metodo agregar");
    System.out.println("Codigo Empleado: "+getCodigo_empleado());
    System.out.println("Puesto: "+getPuesto());
    System.out.println("Nit: "+getNit());
    System.out.println("Nombres: "+getNombres());
    System.out.println("Apellidos: "+getApellidos());
    System.out.println("Direccion: "+getDireccion());
    System.out.println("Telefono: "+getTelefono());
    System.out.println("Fecha Nacimiento: "+getFecha_nacimiento());
  
     }
   @Override
     public void modificar(){
    System.out.println("Metodo Modificar");
    System.out.println("Codigo Empleado: "+getCodigo_empleado());
    System.out.println("Puesto: "+getPuesto());
     System.out.println("Nit: "+getNit());
    System.out.println("Nombres: "+getNombres());
    System.out.println("Apellidos: "+getApellidos());
    System.out.println("Direccion: "+getDireccion());
    System.out.println("Telefono: "+getTelefono());
    System.out.println("Fecha Nacimiento: "+getFecha_nacimiento());
  
  
     }
   @Override
     public void eliminar(){
    System.out.println("Metodo Eliminar");
    System.out.println("Codigo Empleado: "+getCodigo_empleado());
    System.out.println("Puesto: "+getPuesto());
    System.out.println("Nit: "+getNit());
    System.out.println("Nombres: "+getNombres());
    System.out.println("Apellidos: "+getApellidos());
    System.out.println("Direccion: "+getDireccion());
    System.out.println("Telefono: "+getTelefono());
    System.out.println("Fecha Nacimiento: "+getFecha_nacimiento());
  
     }

   
}