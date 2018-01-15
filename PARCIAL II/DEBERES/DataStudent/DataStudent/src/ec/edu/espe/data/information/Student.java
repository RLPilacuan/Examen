
package ec.edu.espe.data.information;


public class Student {
    private String name;
    private long cedula;
    private String apellido;
    private int anioActual;
    private int mesActual;
    private int diaActual;
    private Materia m[];
    private Edad e;
    //Getters Setters

    public String getName() {
        return name;
    }

    public long getCedula() {
        return cedula;
    }

    public String getApellido() {
        return apellido;
    }

    public int getAnioActual() {
        return anioActual;
    }

    public int getMesActual() {
        return mesActual;
    }

    public int getDiaActual() {
        return diaActual;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setAnioActual(int anioActual) {
        this.anioActual = anioActual;
    }

    public void setMesActual(int mesActual) {
        this.mesActual = mesActual;
    }

    public void setDiaActual(int diaActual) {
        this.diaActual = diaActual;
    }
    //Build
    public Student() {
        name=" ";
        cedula=0;
        apellido=" ";
        anioActual=0;
        mesActual=0;
        diaActual=0;
    }

    public Student(String name, long cedula, String apellido, int anioActual, int mesActual, int diaActual) {
        this.name = name;
        this.cedula = cedula;
        this.apellido = apellido;
        this.anioActual = anioActual;
        this.mesActual = mesActual;
        this.diaActual = diaActual;
    }   
}
