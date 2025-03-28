import javax.swing.JOptionPane;
public class EntradaExemplo{
    public static void main(String[] args) {
     int resposta = JOptionPane.showConfirmDialog(null, args, null, 0);
     
     if (resposta == JOptionPane.YES_OPTION){
        JOptionPane.showMessageDialog(null, args, null, resposta);
     } else {
        JOptionPane.showMessageDialog(null, args, null, resposta);
     }
    }
}