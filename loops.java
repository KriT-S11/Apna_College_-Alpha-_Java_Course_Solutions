import java.util.*;

import javax.swing.plaf.synth.SynthStyleFactory; 

public class loops {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
         //Ques --> 1
         //Ans --> 2 times

         //Ques --> 2
         
         int evensum=0;
         int oddsum=0;
         boolean b=true;
         
         do{
            System.out.println("Enter number");
            int n = sc.nextInt();
            if (n%2==0){
                evensum=evensum+n;
            }
            else
                oddsum=oddsum+n;

            System.out.println("Want to continue - Press 1 else 0");
            int choice = sc.nextInt();
            if(choice==1){
                b=true;
            }
            else
                b=false;
         }while(b);
         System.out.println(evensum);
         System.out.println(oddsum);

         // Ques --> 3


        /*int n = sc.nextInt();
        int fact = n;

        for (int i=1;i<n;i++){
            fact=fact*(n-i);
        }
        System.out.println(fact);*/

        //Ques --> 4
        /*int mul;
        int n = sc.nextInt();

        for(int i=1;i<=10;i++){
            mul=n*i;
            System.out.println(n + "x" + i +"="+ mul);
        }*/

        //Ques --> 5
        // Ans --> Scope of i is declared for the for loop.


    }
}
