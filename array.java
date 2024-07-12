import java.util.Scanner;
public class array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int marks[]=new int[100];
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        marks[1]=marks[1]+1;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
    }
}
