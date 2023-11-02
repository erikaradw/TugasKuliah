package JOptionPane;

//Memanggil kelas JOptionPane
import javax.swing.JOptionPane;

public class Jkonversisuhu{
    public static void main (String[]args)
    {
        String a1 = JOptionPane.showInputDialog("Suhu dalam derajat celcius");
        
        int celcius = Integer.parseInt(a1);
    
        double Fahreinheit = (celcius * 9/5) + 32;
        
        String hasil = String.valueOf(Fahreinheit);
        JOptionPane.showMessageDialog(null, "Maka, suhu dalam derajat fahreinheit \n" + hasil);
    }
}