
package ec.edu.espe.data.information;

public class Materia {
   private String name;
   private String nrc;
   private int curso;
   private String nombreProfesor;
   private float n1;
   private float n2;
   private float n3;
   
   //GETTERS SETTERS
    public String getName() {
        return name;
    }

    public String getNrc() {
        return nrc;
    }

    public int getCurso() {
        return curso;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public float getN1() {
        return n1;
    }

    public float getN2() {
        return n2;
    }

    public float getN3() {
        return n3;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNrc(String nrc) {
        this.nrc = nrc;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }

    public void setN3(float n3) {
        this.n3 = n3;
    }
    //Build

    public Materia() {
        name=" ";
        nrc=" ";
        curso=0;
        nombreProfesor=" ";
        n1=0.0f;
        n2=0.0f;
        n3=0.0f;
    }

    public Materia(String name, String nrc, int curso, String nombreProfesor, float n1, float n2, float n3) {
        this.name = name;
        this.nrc = nrc;
        this.curso = curso;
        this.nombreProfesor = nombreProfesor;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }  
    //Method
    public float calcularPromedio(float nota1,float nota2,float nota3){
        float promedio;
        promedio=((nota1+nota2+nota3)/3);
        return promedio;
    }
}
