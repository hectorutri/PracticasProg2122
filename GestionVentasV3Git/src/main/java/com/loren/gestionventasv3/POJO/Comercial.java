/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loren.gestionventasv3.POJO;

/**
 *
 * @author DAW
 */
public class Comercial {
     //Atributos
    private Long id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private float comision;
    //Constructores
    //Constructor por defecto
    public Comercial() {
        super();
    }
    //Constructor Parametrizado
    public Comercial(Long id, String nombre, String apellido1, String apellido2, float comision) {
        this.id = id;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.comision = comision;
    }
    
    //Getters && Setters

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido1
     */
    public String getApellido1() {
        return apellido1;
    }

    /**
     * @param apellido1 the apellido1 to set
     */
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    /**
     * @return the apellido2
     */
    public String getApellido2() {
        return apellido2;
    }

    /**
     * @param apellido2 the apellido2 to set
     */
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    /**
     * @return the comision
     */
    public float getComision() {
        return comision;
    }

    /**
     * @param comision the comision to set
     */
    public void setComision(float comision) {
        this.comision = comision;
    }
    
    //Métodos de la clase

    @Override
    public String toString() {
        return "Comercial{" + "id=" + id + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", comision=" + comision + '}';
    }
 }
