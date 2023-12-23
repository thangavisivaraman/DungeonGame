package dungeon;
   import java.util.Scanner;
   
         public class Dungeon_Game_2 {
	
       public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter The Row And Column :  ");
	        int row = sc.nextInt();
	        int col = sc.nextInt();

	        System.out.println("Enter The Adventure Row And Column : ");
	        int advR = sc.nextInt();
	        int advC = sc.nextInt();

	        System.out.println("Enter The Gold Row and Column : ");
	        int goldR = sc.nextInt();
	        int goldC = sc.nextInt();

	        System.out.println("Enter The Monster Row and Column : ");
	        int monsterR = sc.nextInt();
	        int monsterC = sc.nextInt();

	        int steps = getMinMoves(row, col, advR, advC, goldR, goldC, monsterR, monsterC);
	        System.out.println("Minimum number of moves for the adventurer to reach gold without being caught by the monster: " + steps);
	    }

	    private static int getMinMoves(int row, int col, int advR, int advC, int goldR, int goldC, int monsterR, int monsterC) {
	         int advMoves = Math.abs(advR - goldR) + Math.abs(advC - goldC);
	        int monsterMoves = Math.abs(monsterR - goldR) + Math.abs(monsterC - goldC);

	        
	        if (advMoves <= monsterMoves) {
	            return advMoves;
	        } else {
	            return -1;
	        }
	    }
	}





