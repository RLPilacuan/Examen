
package ec.edu.espe.data.information;

public class Student {
    private String name;
    private String apellido;

    public String getName() {
        return name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Student() {
        name =" ";
        apellido = " ";
    }

    public Student(String name, String apellido) {
        this.name = name;
        this.apellido = apellido;
    }
    
      
}
