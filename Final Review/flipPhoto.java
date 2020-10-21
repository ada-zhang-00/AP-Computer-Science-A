/*
Your friend’s photo editing software has stopped working so you volunteer to help. 
She wants all the pictures reversed in the horizontal direction along the y-axis so that items on the left side of the 
picture are now on the right side, and vice versa. Pictures are stored as 2-D arrays, where each “pixel” stores a single brightness value.

In other words, you need a method that will take a 2-D array and reverse its columns so that the first becomes the last, 
the second becomes the second to last, and so on. Given the following starter code, write the method to help your friend.
*/

public int[][] flipPhoto(int[][] picture)
{

    
    int rows = picture.length;
    int cols = picture[0].length;
    int[][] result= new int[rows][cols];

    for (int r = 0; r < rows; r++)
    {
        for (int c = 0; c < cols/2+1; c++)
        {
            result[r][cols-c-1]=picture[r][c];
            result[r][c]=picture[r][cols-c-1];
        }
    }
        return result;    
}
