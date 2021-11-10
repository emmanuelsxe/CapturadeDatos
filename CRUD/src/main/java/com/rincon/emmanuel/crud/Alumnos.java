package com.rincon.emmanuel.crud;

//Autor: Rincón García Emmanuel Ricardo

public class Alumnos {

    private String codigo;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int edad;
    private String licenciatura;

    private String materiaUno;
    private String materiaDos;
    private String materiaTres;
    private String materiaCuatro;
    private String materiaCinco;

    private String horarioUno;
    private String horarioDos;
    private String horarioTres;
    private String horarioCuatro;
    private String horarioCinco;

    public Alumnos() {

    }

    public Alumnos(
            String codigo, String nombre, String apellidoPaterno, String apellidoMaterno, int edad, String licenciatura,
            String materiaUno, String horarioUno, String materiaDos, String horarioDos, String materiaTres, String horarioTres,
            String materiaCuatro, String horarioCuatro, String materiaCinco, String horarioCinco
    ) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.edad = edad;
        this.licenciatura = licenciatura;

        this.materiaUno = materiaUno;
        this.horarioUno = horarioUno;

        this.materiaDos = materiaDos;
        this.horarioDos = horarioDos;

        this.materiaTres = materiaTres;
        this.horarioTres = horarioTres;

        this.materiaCuatro = materiaCuatro;
        this.horarioCuatro = horarioCuatro;

        this.materiaCinco = materiaCinco;
        this.horarioCinco = horarioCinco;

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getLicenciatura() {
        return licenciatura;
    }

    public void setLicenciatura(String licenciatura) {
        this.licenciatura = licenciatura;
    }

    public String getMateriaUno() {
        return materiaUno;
    }

    public void setMateriaUno(String materiaUno) {
        this.materiaUno = materiaUno;
    }

    public String getMateriaDos() {
        return materiaDos;
    }

    public void setMateriaDos(String materiaDos) {
        this.materiaDos = materiaDos;
    }

    public String getMateriaTres() {
        return materiaTres;
    }

    public void setMateriaTres(String materiaTres) {
        this.materiaTres = materiaTres;
    }

    public String getMateriaCuatro() {
        return materiaCuatro;
    }

    public void setMateriaCuatro(String materiaCuatro) {
        this.materiaCuatro = materiaCuatro;
    }

    public String getMateriaCinco() {
        return materiaCinco;
    }

    public void setMateriaCinco(String materiaCinco) {
        this.materiaCinco = materiaCinco;
    }

    public String getHorarioUno() {
        return horarioUno;
    }

    public void setHorarioUno(String horarioUno) {
        this.horarioUno = horarioUno;
    }

    public String getHorarioDos() {
        return horarioDos;
    }

    public void setHorarioDos(String horarioDos) {
        this.horarioDos = horarioDos;
    }

    public String getHorarioTres() {
        return horarioTres;
    }

    public void setHorarioTres(String horarioTres) {
        this.horarioTres = horarioTres;
    }

    public String getHorarioCuatro() {
        return horarioCuatro;
    }

    public void setHorarioCuatro(String horarioCuatro) {
        this.horarioCuatro = horarioCuatro;
    }

    public String getHorarioCinco() {
        return horarioCinco;
    }

    public void setHorarioCinco(String horarioCinco) {
        this.horarioCinco = horarioCinco;
    }
}
