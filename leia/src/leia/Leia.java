package leia;
  import javax.swing.JOptionPane;
public class Leia {
    public static void main(String[] args) {
        String s1 = JOptionPane.showInputDialog("Digite um numero");
        String s2 = JOptionPane.showInputDialog("Digite um segundo numero");
        
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        
        int sum = n1 + n2;
        JOptionPane.showMessageDialog(null, sum);
    }
    
}
