package dungeon;
import java.util.Scanner;

public class Dungeon_Game {

	public static void main(String[] args) {
		
    Scanner sc = new Scanner(System.in);

        // Input for dungeon dimensions
        System.out.println("Enter The Row And Column :  ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        // Input for adventure's initial position
        System.out.println("Enter The Adventure Row And Column : ");
        int advR = sc.nextInt();
        int advC = sc.nextInt();

        // Input for gold's position
        System.out.println("Enter The Gold Row and Column : ");
        int goldR = sc.nextInt();
        int goldC = sc.nextInt();

        // Calculate and display the minimum number of steps
        int steps = getAdvMinSteps(row, col, advR, advC, goldR, goldC);
        System.out.println("Minimum number of steps: " + steps);
    }

    // Function to calculate the minimum steps for the adventure to reach the gold
    private static int getAdvMinSteps(int row, int col, int advR, int advC, int goldR, int goldC) {

        // Calculate the minimum steps using Math.max
        return (Math.abs(advR - goldR)+ Math.abs(advC - goldC));
    }



	}


