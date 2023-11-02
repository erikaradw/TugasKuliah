package JOptionPane;

//Memanggil kelas JOptionPane
import javax.swing.JOptionPane;

public class Jpersegi{
    public static void main (String[]args)
    {
        String a1 = JOptionPane.showInputDialog("Masukan panjang persegi");
        String a2 = JOptionPane.showInputDialog("Masukan lebar persegi");
        
        int panjang = Integer.parseInt(a1);
        int lebar = Integer.parseInt(a2);
        int luas = panjang*lebar;
        int keliling = 2*(panjang + lebar);
        
        String Luas = String.valueOf(luas);
        String Keliling = String.valueOf(keliling);
        JOptionPane.showMessageDialog(null, "Luas Persegi Panjang   :  " +Luas + "\nKeliling Persegi Panjang   ; " + Keliling);
    }
}
