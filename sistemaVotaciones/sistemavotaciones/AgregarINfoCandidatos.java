/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemavotaciones;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author ag045
 */
public class AgregarINfoCandidatos {
    
    public void agragarinfo() {
        File archivos;
        FileWriter escribir;
        PrintWriter linea;
        String cann = "", infc = "";
        archivos = new File("gesitrarElecciones");
            try {
                archivos.createNewFile();
                cann = JOptionPane.showInputDialog(null, "ingresa nombre del candidato");
                infc = JOptionPane.showInputDialog(null, "ingresa una descripcion del candidato");
                
                escribir = new FileWriter(archivos);
                linea = new PrintWriter(escribir);
                linea.println(cann);
                linea.println(infc);
                linea.close();
                escribir.close();

            } catch (IOException exepcion) {
            }
        
        }
    
}
