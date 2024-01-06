import java.util.Scanner;
import java.util.Random;

class RSPGame{
    public static void main(String[] args)
    {
        while(true){
            String[] rps = { "R","S","P"};
            String computermove = rps[new Random().nextInt(rps.length)];

            Scanner sc = new Scanner(System.in);
            String playermove;

            while(true){
                System.out.println("Please enter Your Move");
                System.out.println(" R)ock, P)aper or S)cissor");
                playermove = sc.nextLine();

                if(playermove.equals("R") || playermove.equals("P") || playermove.equals("S")){
                    break;
                }
                System.out.println(playermove + " is not a valid move");
            }
            System.out.println("Computerplayed :" + computermove);

            if(playermove.equals(computermove)){
                System.out.println(" The game was Tie !!");
            }
                else if (playermove.equals("R")) {
                    if(computermove.equals("P")){
                        System.out.println("You Lose!!");
                    } else if(computermove.equals("S")) {
                        System.out.println("You Win!!");
                    }
                }
                else if (playermove.equals("P")) {
                    if(computermove.equals("S")){
                        System.out.println("You Lose!!");
                    } else if(computermove.equals("R")) {
                        System.out.println("You Win!!");
                    }
                }
                else if (playermove.equals("S")) {
                    if(computermove.equals("R")){
                        System.out.println("You Lose!!");
                    } else if(computermove.equals("P")) {
                    System.out.println("You Win!!");
                    }
                }
            System.out.println("Play Again!!");
            System.out.println("Yes or No");
            String playagain = sc.nextLine();
            
            if(!playagain.equals("yes")) {
                break;
            }
            
        }
        System.out.println("Please Quit");    
    }

    
}