/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finca;

/**
 *
 * @author deyle
 */


  public class cls_trabajador {
    private String str_id;
    private String str_nombre;
    private String str_apellido;
    private String str_contacto;
    private String str_correo;
    private String str_dirrecion;
    private String str_sexo;
    private double dlb_salario ;
    
    public cls_trabajador(String id,String nombre,String apellido,String contacto,String correo,String dirrecion,String sexo,double salrio){
    this.str_id=id;
    this.str_nombre=nombre;
    this.str_apellido=apellido;
    this.str_contacto=contacto;
    this.str_correo=correo;
    this.str_dirrecion=dirrecion;
    this.str_sexo=sexo;
    this.dlb_salario=salrio;
    }

    public String getStr_nombre() {
        return str_nombre;
    }

    public void setStr_nombre(String str_nombre) {
        this.str_nombre = str_nombre;
    }

    public String getStr_apellido() {
        return str_apellido;
    }

    public void setStr_apellido(String str_apellido) {
        this.str_apellido = str_apellido;
    }

    public String getStr_contacto() {
        return str_contacto;
    }

    public String getStr_id() {
        return str_id;
    }

    public void setStr_contacto(String str_contacto) {
        this.str_contacto = str_contacto;
    }

    public String getStr_correo() {
        return str_correo;
    }

    public void setStr_correo(String str_correo) {
        this.str_correo = str_correo;
    }

    public String getStr_dirrecion() {
        return str_dirrecion;
    }

    public void setStr_dirrecion(String str_dirrecion) {
        this.str_dirrecion = str_dirrecion;
    }

    public String getStr_sexo() {
        return str_sexo;
    }

    public void setStr_sexo(String str_sexo) {
        this.str_sexo = str_sexo;
    }

    public double getDlb_salario() {
        return dlb_salario;
    }

    public void setDlb_salario(double dlb_salario) {
        this.dlb_salario = dlb_salario;
    }
    
}


