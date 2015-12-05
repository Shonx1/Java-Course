import java.util.Scanner;

public class SpiralMatrixWithDirection {
	
	public static void main(String[] args)
    {
		int[][] matrix;
		
		matrix = getInput();
 
        fillMatrix(matrix);
 
        printMatrix(matrix);
        
    }
	
	public static int[][] getInput()
	{
		Scanner input = new Scanner(System.in);
        System.out.println("N = ");
        int n = input.nextInt();
        int[][] matrix = new int[n][n];
        input.close();
        return matrix;
	}
 
	public static void fillMatrix(int[][] matrix)
    {
    	int n = matrix.length;
        int positionX = 0;
        int positionY = 0;
 
        int direction = 3; // The initial direction is "left"
        int stepsCount = n - 1; // Perform n - 1 step in the current direction
        int stepPosition = 0; // 0 steps already performed
        int stepChange = 3; // Steps count will change after 3 steps
 
        for (int i = 1; i <= n * n; i++)
        {
            // Fill the current cell with the current value
            matrix[positionY][positionX] = i;
 
            // Check for direction / step changes
            if (stepPosition < stepsCount)
            {
                stepPosition++;
            }
            else
            {
                stepPosition = 1;
                if (stepChange == 1)
                {
                    stepsCount--;
                }
                stepChange = (stepChange + 1) % 2;
                direction = (direction + 1) % 4;
            }
 
            // Move to the next cell in the current direction
            switch (direction)
            {
                case 0:
                	//down
                    positionY++;
                    break;
                case 1:
                	//right
                    positionX--;
                    break;
                case 2:
                	//up
                    positionY--;
                    break;
                case 3:
                	//left
                    positionX++;
                    break;
            }
        }
    }
 
	public static void printMatrix(int[][] matrix)
    {
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println();
        }
    }
}
