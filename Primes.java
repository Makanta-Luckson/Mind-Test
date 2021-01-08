import java.util.*;
public class Primes{

    public static void main(String [] args){

        Random ran = new Random();
        int array[] = new int[10];

        for(int x = 0; x < array.length; x++){
            array[x] = ran.nextInt(36) + 10;
        }

                    for(int i = 0; i < array.length; i++){

                        System.out.println(array[i]);
                        System.out.println();

                       
                                for(int x = 1; x <= array[i]; x++){
                                        boolean var = true;
                                        for(int y = 2; y < x; y++){
                                            if(x % y == 0){
                                                var = false;
                                            }
                                        }

                                        if(var && x > 1){
                                            System.out.print(x + " ");
                                        }
                                       
                                }//second loop
                                             System.out.println();
                    }//first loop


    }
}