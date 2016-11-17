package com.example.gonzalo.saveyourdreams.Clases;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Gonzalo on 09/11/2016.
 */

public class Pesadilla {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    private String titulo;
    private Date time;
    private String id;
    private String descripcion;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFormattedTime(){
        return dateFormat.format(time);
    }
}
