package js6;

/*
 * Farhan Novaldi
 * 21343024
 * Informatika
 */
/**
 * @author Farhan_Nvl
 */
import javax.swing.JOptionPane;

public class Latihan2a {
    public static void main(String[] args) {
        String angka = "";
        angka = JOptionPane.showInputDialog("Silahkan masukkan angka ");
        int input = Integer.valueOf(angka).intValue();
        String hasil = "";
        if (input >= 1 && input <= 10) {
            hasil += "Valid number";
        } else {
            hasil += "Invalid Number";
        }
        JOptionPane.showMessageDialog(null, hasil);
    }
}