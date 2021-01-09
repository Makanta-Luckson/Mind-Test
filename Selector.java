import java.util.Arrays;
public class Selector{
    public static void main(String [] args){

        
           int numbers[] = {12,34,17,30,10, 7, 20,11,15};
      

             System.out.println(Arrays.toString(numbers));

            Arrays.sort(numbers);
            System.out.println(Arrays.toString(numbers));

               int n = numbers.length;

               System.out.println(numbers[n - 2]);









    }
}