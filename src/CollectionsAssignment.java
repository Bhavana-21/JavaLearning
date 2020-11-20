import java.util.Scanner;


public class CollectionsAssignment{


	public void zigZag(String str, int rows)
    {
        if (rows == 1)
        {
            System.out.print(str);
            return;
        }

        char[] str1 = str.toCharArray();

        String[] sArray = new String[rows];
        for(int i = 0; i < sArray.length; i++){
           sArray[i] = "";
        }

        int row = 0;
        boolean down = true; // True on moving down in rows, else false
        for (int i = 0; i < str.length(); ++i)
        {
            sArray[row] = sArray[row] + (str1[i]);

            // If last row is reached, change direction to 'up'
            if (row == rows - 1)
            {
                down = false;
            }

            // If 1st row is reached, change direction to 'down'
            else if (row == 0)
            {
                down = true;
            }

            // If direction is down, increment, else decrement
            if (down) {
                row++;
            } else {
                row--;
            }
        }

        for (int i = 0; i < rows; i++) {
            System.out.println(sArray[i]);
        }
    }



	public static void main(String[] args)
	{
		CollectionsAssignment assignment = new CollectionsAssignment();
		String str = "PROKARMAISHIRING";

		// Reading the # of rows from console....
		Scanner in = new Scanner(System.in);
		int iRows = in.nextInt(); // Converting the rows to int type

		// Calling the Zigzag method..
		assignment.zigZag(str, iRows);
	}

}
