import javax.swing.*;

public class Nombres {
    public static void main(String[] args) {
        String [] [] nombres = {
                {"Laura","Diego","paola","Frank"},
                {"lelany","santiago","jose","kate"},
                {"issa","caren","ronald","mallerly"}};

        int fila = (int) Math.floor(Math.random() * (2 - 1));
            int colunma = (int) Math.floor(Math.random() * (3.0));

        JOptionPane.showInputDialog(null," felicidades eres el ganador"+ nombres[fila][colunma]);


        }

    }
