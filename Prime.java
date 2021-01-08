public class Prime{
    public static void main(String [] args){


                int num = 100;
                int y = 1;
                boolean var;
                int i = 2;
                while(y <= num){
                    var = true;

                        while(i < y){

                            if(y % i == 0){
                                    var = false;
                            }

                            i++;
                        }
                        i = 2;

                        if(var){
                            System.out.print(y + " ");
                        }


                    y++;
                }


    }
}