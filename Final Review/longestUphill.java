/*
You are walking along a hiking trail. On this hiking trail, there is elevation marker at every kilometer. 
The elevation information is represented in an array of integers. For example, if the elevation array is [100, 50, 20, 30, 50, 40], 
that means at kilometer 0, the elevation is 100 meters; at kilometer 1, the elevation is 50 meters; at kilometer 2, the elevation is 20 meters; 
at kilometer 3, the elevation is 30 meters; at kilometer 4, the elevation is 50 meters; at kilometer 5, the elevation is 40 meters.

b) Write a method called longestUphill that returns the elevation change in meters of the longest uphill section. 
In the example above, the method should return 30 because the longest uphill section is from kilometer 2 with 20 meters to kilometer 4 
with 50 meters. The elevation change is 50 - 20 = 30 meters.

Note: A flat section with no elevation change is not considered part of an uphill.
*/

public int longestUphill(int[] elevation)
{
    int highest = 0;
    int current = 0;
    int count = 0;
    for(int i = 0; i < elevation.length-1; i++)
    {
        if(elevation[i] < elevation[i+1])
        {
            count = elevation[i+1] - elevation[i];
            current = current + count;
            for(int k = i+1; k < elevation.length-1; k++)
            {
                if(elevation[k] < elevation[k+1])
                {
                    count += elevation[k+1] - elevation[k];
                    current = count + current;
                }
                else
                {
                    if(highest < count)
                    {
                        highest = count;

                    }
                    i = k;
                    break;
                }
            }
        }
    }
    return highest;
}
