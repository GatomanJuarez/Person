package Clases;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author By Gatoman
 */
public class Person {

    public String Nombre, Apellido, FechaN;
    int Edad;
    public char Genero;

    public void HappyBirthday() {
        Edad++;
        System.out.println("Edad: " + Edad);
    }

    public void Edad() {
        if (Edad < 18) {
            System.out.println(Nombre + " es menor de Edad");
        } else {
            System.out.println(Nombre + " es mayor de Edad");
        }
    }

    public int CalcularEdad(String FechaN) {
        Edad=0;
        Date FechaDeNacimiento = null;
        try{
            FechaDeNacimiento = new SimpleDateFormat("dd-MM-yyyy").parse(FechaN); 
        }
        catch (Exception ex) {
            System.out.println("Error:" + ex); 
        }
        Calendar FechaNacimiento = Calendar.getInstance();
        FechaNacimiento.setTime(FechaDeNacimiento);
        Calendar FechaActual = Calendar.getInstance();
        int Año = FechaActual.get(Calendar.YEAR) - FechaNacimiento.get(Calendar.YEAR);
        int Mes = FechaActual.get(Calendar.MONTH) - FechaNacimiento.get(Calendar.MONTH);
        int Dia = FechaActual.get(Calendar.DATE) - FechaNacimiento.get(Calendar.DATE);
        if (Mes < 0 || (Mes == 0 && Dia < 0)) {
            Año--;
        }
        Edad = Año;
        return Año;
    }
}
