import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int n, firstNumb = 0, secondNumb=1, result; //define integer

        Scanner doa = new Scanner(System.in); //define scanner

        System.out.print(" Fibonacci Serisinde kaç elemana\n kadar görüntülemek istiyorsunuz? : ");
        n = doa.nextInt(); //get value from user
        System.out.println("Fibonacci Serisinde bulunan " +n+" adet elemanı ve hesaplama örüntüsü:");

        for(int i=0; i<=n; i++){//calculating
            System.out.print(firstNumb);
            result = firstNumb + secondNumb;
            firstNumb = secondNumb;
            secondNumb = result;

            System.out.print("+" + firstNumb);//printing
            System.out.println("=" + secondNumb);
        }
    }
}
