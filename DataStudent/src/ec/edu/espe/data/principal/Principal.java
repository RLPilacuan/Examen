
package ec.edu.espe.data.principal;

import ec.edu.espe.data.information.Materia;
import ec.edu.espe.data.information.Student;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
     int numberStudents;
     int validar,pierde;
     String nombreAlumno,apellidoAlumno,nombreMateria;
     float n1,n2,n3,promedio;
     validar=0;
     pierde=0;
     do{
        System.out.println("Ingrese el numero de estudiantes: ");
        numberStudents=sc.nextInt();
        if(numberStudents<0){
            System.out.println("ERROR AL INGRESAR NUMERO...");
        }
    }while(numberStudents<0);
    Student s[]=new Student[numberStudents];
    Materia m[]=new Materia[3];
        for(int i=0;i<s.length;i++){
            System.out.println("\t\t\tDATOS DEL ESTUDIANTE "+(i+1));
            sc.nextLine();
            System.out.println("Ingrese nombre estudiante: ");
            nombreAlumno=sc.nextLine();
            System.out.println("Ingrese apellido estudiante: ");
            apellidoAlumno=sc.nextLine();
            s[i]=new Student(nombreAlumno,apellidoAlumno);
            for(int j=0;j<m.length;j++){
            System.out.println("***MATERIA***"+(j+1));
            sc.nextLine();
            System.out.println("Ingrese nombre de la materia: ");
            nombreMateria=sc.nextLine();
            
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
                m[j]=new Materia(n1,n2,n3,nombreMateria);
                promedio=m[j].calcularPromedio(n1, n2, n3);
                System.out.println(String.format("Promedio: %.2f", promedio));
                if(promedio>14.00){
                    System.out.println("FELICIDADES APROBADO....");
                 validar++;
                }
                if(promedio<=14 && promedio>=12){
                    System.out.println("SUPLETORIO...");
                    validar=validar;
                }
                if(promedio<12){
                    System.out.println("PIERDE...");
                    pierde--;
                    validar--;
                }
            }     
        }
         //PRINT
             for(int i=0;i<s.length;i++){
            System.out.println("\t\t\tDATOS DEL ESTUDIANTE "+(i+1)
                +"\nNombre del estudiante: "+s[i].getName()
                +"\nApellido del estudiante: "+s[i].getApellido());
            for(int j=0;j<m.length;j++){
                System.out.println("\t\tMateria "+(j+1)
                +"\nNombre Materia: "+m[j].getNameMateria()
                +"\nNota 1: "+m[j].getN1()
                +"\nNota 2: "+m[j].getN2()
                +"\nNota 3: "+m[j].getN3());      
            }
        }
             if(validar>=2){
                 System.out.println("EL ESTUDIANTE PASO EL SEMESTRE...");
             }
             else{
                 if(pierde<=-2 && validar==1){
                 System.out.println("YA perdio el semestre");
                 }
                 else{
                      System.out.println("EL ESTUDIANTE AUN NO PASA EL SEMESTRE...");
                 }
                
             }
            
    }
    
}
