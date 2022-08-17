import java.util.Scanner;

public class Variables{
    public static void main(String args[]){
       
        Scanner sc = new Scanner (System.in);
        // The Code for questions are commented out, Remove the comment operator from that specific Question.
        // Ques 1
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        float ans = (a+b+c)/3.0f;
        System.out.print(ans);

        // Ques 2
        
        /*float side = sc.nextFloat();
        float area = (side*side);
        System.out.println(area);*/

        // Ques 3

        /*float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();

        float cost = (pen+pencil+eraser);
        float GST = cost*0.18f;

        float bill=cost+GST;
        System.out.println(bill);*/
        
    }
}

