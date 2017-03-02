package Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author By Gatoman
 */
public class PersonTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person uno = new Person();
        uno.Nombre = "Jesus";
        uno.Apellido = "Juarez";
        uno.FechaN = JOptionPane.showInputDialog("Fecha de Nacimiento con el  formato:\ndd-mm-aaaa con ' '");
        uno.CalcularEdad(uno.FechaN);
        uno.Genero = 'H';
        uno.HappyBirthday();
        uno.Edad();

        Person Ana = new Person();
        Ana.Nombre = "Ana";
        Ana.Apellido = "Martinez";
        Ana.FechaN = JOptionPane.showInputDialog("Fecha de Nacimiento con el  formato:" + "\ndd-mm-aaaa con ' '");
        Ana.CalcularEdad(uno.FechaN);
        Ana.Genero = 'M';
        Ana.HappyBirthday();
        Ana.Edad();
    }

}
