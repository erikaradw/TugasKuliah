package JOptionPane;

//Memanggil kelas JOptionPane
import javax.swing.JOptionPane;

public class Jsegitiga{
    public static void main (String[]args)
    {
        String a1 = JOptionPane.showInputDialog("Masukan tinggi segitiga");
        String a2 = JOptionPane.showInputDialog("Masukan panjang alas segitiga");
        
        int tinggi = Integer.parseInt(a1);
        int alas = Integer.parseInt(a2);
        double luas = 0.5*alas*tinggi;
        
        String Luas = String.valueOf(luas);
        JOptionPane.showMessageDialog(null, "Luas Segitiga   :  " +Luas);
    }
}