import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       double nota=0;
        double x,y;
        System.out.println("¿Cuanto resta X?");
        x=  sc.nextDouble();

        System.out.println("¿Cuanto suma Y?");
        y=  sc.nextDouble();
        for (int i = 0; i < 100; i++) {

            if(Math.random()<=0.75){
                nota = nota- x;
            }else{
                nota = nota+y;
            }
        }
        System.out.println("Tu nota es:"+ nota);
    }
}


