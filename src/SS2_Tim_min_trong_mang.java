import java.util.Scanner;
public class SS2_Tim_min_trong_mang {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử: ");
        int size = sr.nextInt();
        int []arr= new int [size];
        for (int i=0;i<size;i++){
            System.out.print("Nhập phần tử: arr["+i+"]= ");
            arr[i]=sr.nextInt();
        }
        int min=arr[0];
        for (int i=0;i<size;i++){
            if (arr[i]<min){
               min=arr[i];

            }
        }
        System.out.println("Giá trị min của mảng là :"+min);

    }
}
