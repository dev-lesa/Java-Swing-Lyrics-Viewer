package Lyrics;

import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;

public class MainQuemado {
    public static void main(String[] args) {
        ImageIcon originalIcon = new ImageIcon("src/main/resources/img.png");
        Image imgBase = originalIcon.getImage();

        Image portadaEscalada = imgBase.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
        ImageIcon iconAlbum = new ImageIcon(portadaEscalada);

        Image versoEscalado = imgBase.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        ImageIcon imgAlbum = new ImageIcon(versoEscalado);

        JLabel label = new JLabel("Nsqk - Si En Tu Mente Estuve");
        Font fuenteGrande = new Font("Arial", Font.BOLD, 20);
        label.setFont(fuenteGrande);
        label.setIcon(iconAlbum);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);

        String[] letra = {
                "¿Cuántos días han pasado",
                "Que yo no sé nada de ti?",
                "Hora pico, seis y cuarto",
                "En mi carro estacionados",
                "Y no has pensado en qué decir",
                "Cuéntame siquiera qué animales viste en las nubes",
                "Cuéntame siquiera si contaste carros y autobuses",
                "Que solo quiero saber",
                "Si una mariposa viste en tu ventana",
                "Cómo te pediste el café por la mañana",
                "Y si en tu mente estuve",
                "Dime dónde has estado",
                "Porque en mis sueños yo te vi",
                "Te vi",
                "Y me dijiste: \"oyе, Rodri",
                "No imaginas lo que hoy ví\"",
                "Y ya te quería decir",
                "Cuéntame siquiera qué animales viste en las nubes",
                "Cuéntame siquiera si contaste carros y autobuses",
                "Que solo quiero saber",
                "Si una mariposa viste en tu ventana",
                "Cómo te pediste el café por la mañana",
                "Y si en tu mente estuve",
                "Cuéntame siquiera si pensaste lo mismo de siempre",
                "Cuéntame siquiera si soñaste con un campo verde",
                "Que solo quiero saber",
                "Si todas las cosas que te prometiste",
                "Ya están por llegar o cuántas ya cumpliste",
                "Y si es que quieres verme",
                "Y solo quiero saber",
                "Y solo quiero saber",
                "Y solo quiero saber",
                "Y solo quiero saber",
                "Cuéntame siquiera qué animales viste en las nubes",
                "Cuéntame siquiera si contaste carros y autobuses",
                "Que solo quiero saber",
                "Si una mariposa viste en tu ventana",
                "Cómo te pediste el café por la mañana",
                "Y si en tu mente estuve yo",
                "Si estuve yo"
        };

        JOptionPane.showMessageDialog(null, label, "Nsqk - Si En Tu Mente Estuve", JOptionPane.PLAIN_MESSAGE);

        for (String verso : letra) {
            JOptionPane.showMessageDialog(null,
                    verso,
                    "Nsqk - Si En Tu Mente Estuve",
                    JOptionPane.INFORMATION_MESSAGE,
                    imgAlbum);
        }
    }
}