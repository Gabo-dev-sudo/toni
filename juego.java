import javax.swing.JOptionPane;
public class juego{
    public static void main(String[]args){
        int numero, contador=0;
        int aleatorio=(int)(Math.random()*100);

        do{
            numero=Integer.parseInt(JOptionPane.showInputDialog("Intenta adivinar el numero entre 1 y 100"));

            if(numero>aleatorio){
                JOptionPane.showMessageDialog(null,"Ingresa un numero menor");
            }else{
                JOptionPane.showMessageDialog(null,"Ingresa un numero mayor");
            }   
            contador++;

        }while(numero!=aleatorio);{
            JOptionPane.showMessageDialog(null,"Adivinaste el numero en "+contador+" intentos");
        }
    }
}
