package ec.edu.espe.data.principal;

import ec.edu.espe.data.information.Edad;
import ec.edu.espe.data.information.Materia;
import ec.edu.espe.data.information.Student;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
    int numberStudents; 
    String name;
    long cedula;
    String apellido;
    int anioActual;
    int mesActual;
    int diaActual;
    int anioNacimiento;
    int mesNacimiento;
    int diaNacimiento;
    String nombreMateria;
    String nrc;
    int curso;
    String nombreProfesor;
    float n1;
    float n2;
    float n3;
    float promedio;
    Scanner sc=new Scanner (System.in);
    do{
        System.out.println("Ingrese el numero de estudiantes: ");
        numberStudents=sc.nextInt();
        if(numberStudents<0){
            System.out.println("ERROR AL INGRESAR NUMERO...");
        }
    }while(numberStudents<0);
    Student s[]=new Student[numberStudents];
    Edad e=new Edad();
    Materia m[]=new Materia[2];
        for(int i=0;i<s.length;i++){
            System.out.println("\t\t\tDATOS DEL ESTUDIANTE "+(i+1));
            sc.nextLine();
            System.out.println("Ingrese nombre: ");
            name=sc.nextLine();
            System.out.println("Ingrese cedula: ");
            cedula=sc.nextLong();
            sc.nextLine();
            System.out.println("Ingrese apellido: ");
            apellido=sc.nextLine();
            System.out.println("***FECHA DE NACIMIENTO***");
            System.out.println("Ingrese año: ");
            anioNacimiento=sc.nextInt();
            System.out.println("Ingrese mes: ");
            mesNacimiento=sc.nextInt();
            System.out.println("Ingrese dia: ");
            diaNacimiento=sc.nextInt();
            do{
                System.out.println("Ingrese año: ");
                anioActual=sc.nextInt();
                if(anioActual!=2017){
                    System.out.println("ERROR AL INGRESAR AÑO...");
                }
            }while(anioActual!=2017);
            do{
                System.out.println("Ingrese mes: ");
                mesActual=sc.nextInt();
                if(mesActual<0 || mesActual>12){
                    System.out.println("ERROR EN EL MES...");
                }
            }while(mesActual<0 || mesActual>12);
            do{
                 System.out.println("Ingrese dia: ");
                diaActual=sc.nextInt();
                if(diaActual<0){
                    System.out.println("ERROR EN EL DIA...");
                }
            }while(diaActual<0);
           
            s[i]=new Student(name,cedula,apellido,anioActual,mesActual,diaActual);
            
            for(int j=0;j<m.length;j++){
                System.out.println("***MATERIA***"+(j+1));
                sc.nextLine();
                System.out.println("Ingrese nombre de la materia: ");
                nombreMateria=sc.nextLine();
                System.out.println("Ingrese nrc: ");
                nrc=sc.next();
                System.out.println("Ingrese curso: ");
                curso=sc.nextInt();
                sc.nextLine();
                System.out.println("Ingrese nombre profesor: ");
                nombreProfesor=sc.nextLine();
                do{
                    System.out.println("Ingrese nota 1: ");
                    n1=sc.nextFloat();
                    if(n1<0.0 || n1>20.0){
                        System.out.println("ERROR AL INGRESO DE NOTAS...");
                    }
                }while(n1<0.0 || n1>20.0);
                
                do{
                    System.out.println("Ingrese nota 2: ");
                    n2=sc.nextFloat();
                    if(n2<0.0 || n2>20.0){
                        System.out.println("ERROR AL INGRESO DE NOTAS...");
                    }
                }while(n2<0.0 || n2>20.0);
                
                do{
                    System.out.println("Ingrese nota 3: ");
                    n3=sc.nextFloat();
                    if(n3<0.0 || n3>20.0){
                        System.out.println("ERROR AL INGRESO DE NOTAS...");
                    }
                }while(n3<0.0 || n3>20.0);
                m[j]=new Materia(nombreMateria,nrc,curso,nombreProfesor,n1,n2,n3);   
                promedio=m[j].calcularPromedio(n1, n2, n3);
                System.out.println(String.format("Promedio: %.2f", promedio));
                if(promedio>=14.00){
                    System.out.println("FELICIDADES APROBADO....");
                }
                else{
                    System.out.println("FELICIDADES REPROBADO...");
                }
            }
        }
        //PRINT
        for(int i=0;i<s.length;i++){
            System.out.println("\t\t\tDATOS DEL ESTUDIANTE "+(i+1)
                +"\nNombre del estudiante: "+s[i].getName()
                +"\nApellido del estudiante: "+s[i].getApellido()
                +"\nCedula del estudiante: "+s[i].getCedula()
                +"\nAño: "+s[i].getAnioActual()
                +"\nMes: "+s[i].getMesActual()
                +"\nDIA: "+s[i].getDiaActual());
            
            for(int j=0;j<m.length;j++){
                System.out.println("\t\tMateria "+(j+1)
                +"\nNombre Materia: "+m[j].getName()
                +"\nNRC: "+m[j].getNrc()
                +"\nCURSO: "+m[j].getCurso()
                +"\nNombre Profesor: "+m[j].getNombreProfesor()
                +"\nNota 1: "+m[j].getN1()
                +"\nNota 2: "+m[j].getN2()
                +"\nNota 3: "+m[j].getN3());      
            }
        }
    }
}
