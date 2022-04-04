package com.loren.gestionventasv3.POJO;

import java.sql.Date;

/**
 * @author Héctor Utrillas Escapa
 */
public class Pedido {
  //Atributos
    private long id;
    private double total;
    private Date fecha;
    private Cliente cliente;
    private Comercial comercial;
    
    //Constructores
    //Constructor por defecto
    public Pedido() {
        super();
    }
    
    //Constructor parametrizado

    public Pedido(long id, double total, Date fecha, Cliente cliente, Comercial comercial) {
        this.id = id;
        this.total = total;
        this.fecha = fecha;
        this.cliente = cliente;
        this.comercial = comercial;
    }
    
    //Getters && Setters

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the comercial
     */
    public Comercial getComercial() {
        return comercial;
    }

    /**
     * @param comercial the comercial to set
     */
    public void setComercial(Comercial comercial) {
        this.comercial = comercial;
    }
    
    //Métodos de la clase
    //Este toString no es óptimo
    @Override
    public String toString() {
        return "Pedido{" + "id=" + id + ", total=" + total + ", fecha=" + fecha + ", cliente=" + cliente + ", comercial=" + comercial + '}';
    }
    
    
            
}
