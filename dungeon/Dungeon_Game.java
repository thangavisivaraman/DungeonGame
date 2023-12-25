package dungeon;
import java.util.Scanner;

public class Dungeon_Game_3 {

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

        // Create a StringBuilder to store the adventurer's path
        StringBuilder path = new StringBuilder();

        int steps = getMinMoves(row, col, advR, advC, goldR, goldC, monsterR, monsterC, path);

        // Check if a solution exists before printing the path
        if (steps != -1) {
            System.out.println("Minimum number of steps: " + steps);
            System.out.println("Path: " + path.toString());
        } else {
            System.out.println("No solution exists.");
        }
    }

    private static int getMinMoves(int row, int col, int advR, int advC, int goldR, int goldC, int monsterR, int monsterC, StringBuilder path) {
        int advMoves = Math.abs(advR - goldR) + Math.abs(advC - goldC);
        int monsterMoves = Math.abs(monsterR - goldR) + Math.abs(monsterC - goldC);

        // Initialize variables to track adventurer's position
        int currentR = advR;
        int currentC = advC;

        // Check if the adventurer can reach the gold before the monster
        if (advMoves <= monsterMoves) {
            // Update the path for each step
            while (currentR != goldR || currentC != goldC) {
                path.append("(" + currentR + "," + currentC + ")->");

                // Move towards the gold
                if (currentC < goldC) {
                    currentC++;
                } else if (currentC > goldC) {
                    currentC--;
                } else if (currentR < goldR) {
                    currentR++;
                } else {
                    currentR--;
                }
            }

            // Append the last position to the path
            path.append("(" + currentR + "," + currentC + ")");

            return advMoves;
        } else {
            return -1;
        }
    }
}







