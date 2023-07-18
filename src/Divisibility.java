import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=scanner.nextInt();
        System.out.println("Enter the array elements");
        int array[]=new int[size];
        int count=0;
        for (int i = 0; i < size; i++) {
            array[i]=scanner.nextInt();
            if(array[i]%3==0){
                count++;
            }
        }
        System.out.println("no.of elements divisible by 3: "+count);
    }
}
