import java.util.Scanner;

public class arreglos {
    public static void main(String[]args){
        Scanner entrada= new Scanner(System.in);
        int a[]= new int[10];
        int b[]= new int[10];
        int c[]= new int[20];

        System.out.println("Llene el arreglo A");
        for(int i=0; i<10; i++){
            System.out.print(i+": ");
            a[i]=entrada.nextInt();
        }

        System.out.println("Llene el arreglo B");
        for(int i=0; i<10; i++){
            System.out.print(i+": ");
            b[i]=entrada.nextInt();
        }

        System.out.println("Arreglo C: ");
        int j=0;
        for(int i=0; i<10; i++){
            c[j]=a[i];
            j++;
            c[j]=b[i];
            j++;
        }

        for(int i=0; i<20; i++){
            System.out.println(c[i]);
        }
    }
}                     