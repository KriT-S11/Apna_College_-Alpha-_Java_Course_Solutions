import java.util.Scanner

;
import javax.lang.model.util.ElementScanner14;
public class ConditionalStatements {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         
        //Ques --> 1

        float n = sc.nextFloat();
        
        if (n>0){
            System.out.print("Positive");
        }
        else{
            System.out.println("Negative");
        }

        //Ques --> 2

        /*double temp = 103.5;
        String result = (temp > 100.0) ? "You have a Fever" : "You don't have a Fever";
        System.out.println(result);*/

        //Ques --> 3

        /*int input = sc.nextInt();

        switch (input){
            case 1: System.out.println("Monday");
                    break;
            case 2: System.out.println("Tuesday");
                    break;
            case 3: System.out.println("Wednesday");
                    break;
            case 4: System.out.println("Thursday");
                    break;
            case 5: System.out.println("Friday");
                    break;
            case 6: System.out.println("Saturday");
                    break;
            case 7: System.out.println("Sunday");
                    break;
            default:System.out.println("Enter Valid Input Between 1-7");

        }*/

        //Ques --> 4

        /*x = False
          y = 63*/

        //Ques --> 5

        /*int year = sc.nextInt();
        boolean leap = false;

        if (year%4==0){
            
            if(year%100==0){
                
                if(year%400 == 0){
                    leap = true;
                }
                else
                   leap = false;
            }
            else{
                leap = true;
            }
        }
        else
           leap = false;

    if (leap)
        System.out.println("Leap Year");
    else
        System.out.println("Not a Leap Year");*/
            
    }
    
}
