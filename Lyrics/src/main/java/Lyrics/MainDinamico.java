package Lyrics;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import javax.imageio.ImageIO;

public class MainDinamico {
    public static void main(String[] args) {
        try {
            String autor = JOptionPane.showInputDialog("Ingrese el nombre del autor:");
            String cancion = JOptionPane.showInputDialog("Ingrese el nombre de la canción:");
            String urlImagen = JOptionPane.showInputDialog("Ingrese la URL de la imagen de portada:");

            JTextArea textArea = new JTextArea(10, 30);
            JScrollPane scrollPane = new JScrollPane(textArea);

            int result = JOptionPane.showConfirmDialog(null, scrollPane,
                    "Pegue la letra de la canción", JOptionPane.OK_CANCEL_OPTION);

            if (result != JOptionPane.OK_OPTION) return;

            String letraRaw = textArea.getText();
            String[] letra = letraRaw.split("\\r?\\n");

            URL url = new URL(urlImagen);
            Image imgOriginal = ImageIO.read(url);

            Image scaledIcon = imgOriginal.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
            ImageIcon iconAlbum = new ImageIcon(scaledIcon);

            Image scaledImg = imgOriginal.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
            ImageIcon imgAlbum = new ImageIcon(scaledImg);

            JLabel label = new JLabel(autor + " - " + cancion);
            label.setFont(new Font("Arial", Font.BOLD, 20));
            label.setIcon(iconAlbum);
            label.setHorizontalTextPosition(JLabel.CENTER);
            label.setVerticalTextPosition(JLabel.BOTTOM);

            JOptionPane.showMessageDialog(null, label, autor + " - " + cancion, JOptionPane.PLAIN_MESSAGE);

            for (String verso : letra) {
                if (!verso.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null,
                            verso.trim(),
                            autor + " - " + cancion,
                            JOptionPane.INFORMATION_MESSAGE,
                            imgAlbum);

                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}