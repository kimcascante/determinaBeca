package Semana4;

/**
 * Nombre del programa: 
 * Descripcion: A usted se le pide realizar un programa que determine si un estudiante de una institución
    universitaria es candidato a que le den una beca. Un estudiante puede optar por una
    beca solamente si lleva el bloque de cuatro materias completo, y no perdió ninguna
    materia, por lo que el sistema siempre va a recibir las notas de las cuatro materias y
    todas las notas van a ser superiores a 70. El estudiante tiene derecho a la beca si el
    promedio de las notas de las materias del cuatrimestre es igual o superior a noventa, y
    si ninguna nota está por debajo de 8. También podría tener derecho a la beca si el
    promedio de las materias del cuatrimestre es igual a superior a 85, fue asistente durante
    el cuatrimestre y la calificación que se le otorgó como asistente fue de una A o una B.
    Si su calificación como asistente fue de una C no tiene derecho a beca, sin importar el
    promedio. 
 * Autor: Kimberly C.
 * Fecha de creacion:
 * Modificado por:
 * fecha de modificacion:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ej3w4 {
    public static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream escribir = System.out;

    public static void main(String[] args) throws IOException{ 
        String aptoBeca;
        double notaMateriaUno;
        double notaMateriaDos;
        double notaMateriaTres;
        double notaMateriaCuatro;
        double promedioNotas;
        String asistente;
        char notaAsistente;

        escribir.println("El estudiante fue asistente:");
        asistente = leer.readLine();

        if (asistente.equalsIgnoreCase("Si")){
            escribir.println("Digite la nota de Asistente");
            notaAsistente = leer.readLine().charAt(0);
            if(notaAsistente == 'A' || notaAsistente == 'B'){
                aptoBeca = "El estudiante si tiene derecho a  una beca";
            } else {
                aptoBeca = "El estudiante no tiene derecho a  una beca";

            }
        } else {
            aptoBeca = "El estudiante no tiene derecho a  una beca";
        }

        escribir.println("Digite la nota de la primer materia:");
        notaMateriaUno = Double.parseDouble(leer.readLine());
        if (notaMateriaUno<70){
            escribir.println("No aplica para una beca");
        } else {
            escribir.println("Digite la nota de la segunda materia");
            notaMateriaDos = Double.parseDouble(leer.readLine());
            if(notaMateriaDos<70){
                escribir.println("No aplica para una beca");
            } else {
                escribir.println("Digite la nota de la tercer materia");
                notaMateriaTres = Double.parseDouble(leer.readLine());
                if (notaMateriaTres<70){
                    escribir.println("No aplica para una beca");
                } else {
                    escribir.println("Digite la nota de la cuarta materia");
                    notaMateriaCuatro = Double.parseDouble(leer.readLine());
                    if (notaMateriaCuatro<70){
                        escribir.println("No aplica para una beca");
                    } else {
                        promedioNotas = (notaMateriaUno + notaMateriaDos + 
                        notaMateriaTres + notaMateriaCuatro) / 4;
                        if (promedioNotas>=90){
                            aptoBeca = "El estudiante si es candidato para una beca";
                        } else if (promedioNotas>=85 && asistente.equalsIgnoreCase("Si")) {
                            aptoBeca = "El estudiante si es candidato para una beca";
                        } else {
                            aptoBeca = "No aplica para una beca";
                        }
                    }
                }
            }
        } 
     
        escribir.println(aptoBeca);
        
    }
}