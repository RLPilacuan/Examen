package ec.edu.espe.data.information;

public class Edad {
    private int anio;
    private int dia;
    private int mes;
    //GETTERS SETTERS

    public int getAnio() {
        return anio;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
    //Build
    public Edad() {
        anio=0;
        mes=0;
        dia=0;
    }

    public Edad(int anio, int dia, int mes) {
        this.anio = anio;
        this.dia = dia;
        this.mes = mes;
    }
    public void calcularEdad(int anio,int mes,int dia){
        
    }
   
    
}
