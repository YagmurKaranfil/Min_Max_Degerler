import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int value , number , smallest=0 , biggest=0;

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        value=input.nextInt();

        int i=1;
        while (i<=value){
            System.out.print(i+". sayıyı girin : ");
            number=input.nextInt();
            if(number<smallest)
                smallest=number;
            if(number>biggest)
                biggest=number;
            i++;
        }

        System.out.print("En Büyük Sayı : "+biggest);
        System.out.println("");
        System.out.print("En Küçük Sayı : "+smallest);


    }
}