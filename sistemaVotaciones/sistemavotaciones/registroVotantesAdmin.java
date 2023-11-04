package sistemavotaciones;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author ag045
 */
public class registroVotantesAdmin {

    public void crearArchivosDeTexto() {
        File archivos;
        FileWriter escribir;
        PrintWriter linea;
        String titE = "", De = "", FI = "", FF = "";
        archivos = new File("gesitrarElecciones");
            try {
                archivos.createNewFile();
                titE = JOptionPane.showInputDialog(null, "ingresa el titulo de la eleccion:" + "Solicitando datos", 3);
                De = JOptionPane.showInputDialog(null, "ingresa una descripcion:" + "Solicitando datos", 3);
                FI = JOptionPane.showInputDialog(null, "ingresa la fecha de inicio:" + "Solicitando datos", 3);
                FF = JOptionPane.showInputDialog(null, "ingresa la fecha final:" + "Solicitando datos", 3);
                escribir = new FileWriter(archivos);
                linea = new PrintWriter(escribir);
                linea.println(titE);
                linea.println(De);
                linea.println(FI);
                linea.println(FF);
                linea.close();
                escribir.close();

            } catch (IOException exepcion) {
            }
        
        }
 
    }

