import javax.swing.JOptionPane;

public class Aula03Ex4 {
   public static void main (String arg[]){
      int a, b, c;
      String saida;
      a = Integer.parseInt(JOptionPane.showInputDialog("digite o primeiro:"));
      b = Integer.parseInt(JOptionPane.showInputDialog("digite o segundo:"));
      c = Integer.parseInt(JOptionPane.showInputDialog("digite o terceiro:"));
      
      if (a<b && a<c){
         saida = a + ", ";
         if (b<c){
            saida = saida + b + ", " + c;
         }
         else{
            saida = saida + c + ", " + b;
         }
      }
      else if (b<c) {
         saida = b + ", ";
         if (a<c){
            saida = saida + a + ", " + c;
         }
         else{
            saida = saida + c + ", " + a;
         }
      }
      else {
         saida = c + ", ";
         if (a<b){
            saida = saida + a + ", " + b;
         }
         else{
            saida = saida + b + ", " + a;
         }   
      }
      JOptionPane.showMessageDialog (null, saida);
   }
}