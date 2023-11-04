/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemavotaciones;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ag045
 */
public class guardarContra {
     public void guardarContrasena(String contrasena) {
        try {
            FileWriter writer = new FileWriter("contrasena.txt");
            writer.write(contrasena);
            writer.close();
            System.out.println("Contraseña guardada en el archivo 'contrasena.txt'");
        } catch (IOException e) {
            e.printStackTrace();
        
        }
    
}
}
