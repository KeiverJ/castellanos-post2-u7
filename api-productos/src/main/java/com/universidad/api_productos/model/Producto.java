package com.universidad.api_productos.model;

/**
 * Modelo que representa un producto en la API REST.
 * Jackson serializa/deserializa esta clase a/desde JSON automáticamente.
 */
public class Producto {

    private Long id;
    private String nombre;
    private String descripcion;
    private Double precio;

    // Constructor vacío requerido por Jackson para deserializar JSON
    public Producto() {
    }

    public Producto(Long id, String nombre, String descripcion, Double precio) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    // Getters y Setters requeridos por Jackson
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String d) {
        this.descripcion = d;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}