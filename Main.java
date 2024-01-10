import java.util.*;
public class Main {
    static int operation(int n){
        int rem=0,sum=0;
        while(n>0){
       rem=n%10;
       sum+=rem*rem;
        n/=10;
        }
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the case number:");
        int n=sc.nextInt();
        sc.nextLine();
        switch(n){
            case 1:{     // Regex expression - sanjai kumar
                System.out.print("Enter the expression:");
                String s=sc.nextLine();
                String[] arr=s.split("[^a-z A-Z]");
                for(String x:arr)
                System.out.println(x);
                break;
            }
            case 2:{   // Happy number - Gajapathi
                System.out.print("Enter the number:");
                int num=sc.nextInt();
                int temp=num;
                int slow=num;
                int fast=num;
                do{
                    slow=operation(slow);
                    System.out.println(slow+" ");
                    fast=operation(operation(fast));
                    System.out.println(fast+" ");
                }
                while(slow!=fast);
                if(slow==1)
                System.out.println("Number is a happy number!");
                else
                System.out.println("Number is not a happy number!");
                break;
            }
        }
    }
}
