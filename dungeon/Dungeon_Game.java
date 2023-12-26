package dungeon;
import java.util.Scanner;

public class Dungeon_Game_4 {

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

        System.out.println("Enter The Trigger Row and Column : ");
        int triggerR = sc.nextInt();
        int triggerC = sc.nextInt();

        int steps = getMinMovesWithTriggers(row, col, advR, advC, goldR, goldC, monsterR, monsterC, triggerR, triggerC);

        
        if (steps != -1) {
            System.out.println("Minimum number of steps: " + steps);
        } else {
            System.out.println("No solution exists.");
        }
    }

    private static int getMinMovesWithTriggers(int row, int col, int advR, int advC, int goldR, int goldC,
                                               int monsterR, int monsterC, int triggerR, int triggerC) {
        
        int advToGold = Math.abs(advR - goldR) + Math.abs(advC - goldC);
        int advToTrigger = Math.abs(advR - triggerR) + Math.abs(advC - triggerC);
        int monsterToGold = Math.abs(monsterR - goldR) + Math.abs(monsterC - goldC);
        int monsterToTrigger = Math.abs(monsterR - triggerR) + Math.abs(monsterC - triggerC);

        
        if (advToGold >monsterToGold) {
            
            return Math.abs(advToTrigger + monsterToGold);
        } else {
            
            return advToGold;
        }
    }
}
