
package ec.edu.espe.data.information;

public class Materia {
   private float n1;
   private float n2;
   private float n3;
   private String nameMateria;
   //GETTERS SETTERS

    public String getNameMateria() {
        return nameMateria;
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

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }

    public void setN3(float n3) {
        this.n3 = n3;
    }

    public void setNameMateria(String nameMateria) {
        this.nameMateria = nameMateria;
    }
    
    //Build
    public Materia() {
        n1=0.0f;
        n2=0.0f;
        n3=0.0f;
        nameMateria=" ";
    }

    public Materia(float n1, float n2, float n3, String nameMateria) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.nameMateria = nameMateria;
    }
    
     //Method
    public float calcularPromedio(float nota1,float nota2,float nota3){
        float promedio;
        promedio=((nota1+nota2+nota3)/3);
        return promedio;
    }    
   
}
