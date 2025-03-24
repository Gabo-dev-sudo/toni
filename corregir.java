import javax.swing.JOptionPane;
public class corregir {
    public static void main(String[]args){
        int contraseña=1823, cont, opcion,saldo=1000,ingreso, retiro, decision;

        cont=Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu contraseña"));

        for(int i=1; cont!=contraseña; i++){
            cont=Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu contraseña"));
            if(i%5==0){
                for(int j=10; j>=1; j--){
                    JOptionPane.showMessageDialog(null,"Vuelve a intentarlo en "+j+" segundos");
                }
            }
        }

        do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog("Elige que opcion quieres realizar: \n1.Consultar saldo \n2.Ingresar saldo \n3.Retirar saldo \n4.Salir"));

            switch(opcion){
                case 1: JOptionPane.showMessageDialog(null,"Tu saldo es de: $"+saldo);
                break;

                case 2: ingreso=Integer.parseInt(JOptionPane.showInputDialog("Cantidad a ingresar: "));
                saldo+=ingreso;
                JOptionPane.showMessageDialog(null,
                "Cantidad ingresada correctamente. Tu nuevo saldo es de: $"+saldo);
                break;

                case 3: retiro=Integer.parseInt(JOptionPane.showInputDialog("Cantidad a retirar: "));
                saldo-=retiro;
                JOptionPane.showMessageDialog(null,
                "Cantidad ingresada correctamente. Tu nuevo saldo es de: $"+saldo);
                break;

                case 4: decision=Integer.parseInt(JOptionPane.showInputDialog("¿Estas seguro de salir? \n1.Si \n2.No"));
                switch (decision) {
                    case 1: break;
                }
                break;

                default: JOptionPane.showMessageDialog(null,"Opcion no valida!");
                break;
            }
        }while(opcion!=4);
       
    }
}
