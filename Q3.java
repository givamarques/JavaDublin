import java.util.Scanner;

public class Q3{
    public static void main(String[] args) {
        Scanner mar= new Scanner(System.in);

        System.out.println("Qual a nota, bença? ");
        double m1 = mar.nextDouble();
        double mark;

        if (m1>=0 && m1<=100){
            System.out.println("Tua nota é: "+(m1/100)*20+"(Fraca, hein Bença?)");
        } else{
            System.out.println("É a nota não é o saldo não, bença!");
        }
    }
}