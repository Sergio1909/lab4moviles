package com.example.laboratorio4;

public class Publicacion {

    private String usuario;
    private int foto;
    private String fecha;
    private Comentario[] listaComentario;
    private String descripcion;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Comentario[] getListaComentario() {
        return listaComentario;
    }

    public void setListaComentario(Comentario[] listaComentario) {
        this.listaComentario = listaComentario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
