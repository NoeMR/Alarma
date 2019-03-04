package alarma;

import javax.swing.JOptionPane;

public class Alarma {
    public static void main(String[] args) {
        int hora, minuto, segundo;
        
        do{
        hora=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la hora"));
        } while(hora<0);
        
        do{
        minuto=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la hora"));
        } while(minuto<0 || minuto>59);
        
        do{
        segundo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese los segunds"));
        } while(segundo<0 || segundo>59);
        
        JOptionPane.showMessageDialog(null,"La alarma sonará en: "+hora+" : "+minuto+" : "+ segundo);


    }
    
}
