/*
You are walking along a hiking trail. On this hiking trail, there is elevation marker at every kilometer. 
The elevation information is represented in an array of integers. For example, if the elevation array is 
[100, 50, 20, 30, 50, 40], that means at kilometer 0, the elevation is 100 meters; at kilometer 1, the elevation is 50 meters; 
at kilometer 2, the elevation is 20 meters; at kilometer 3, the elevation is 30 meters; at kilometer 4, the elevation is 50 meters; 
at kilometer 5, the elevation is 40 meters.

a) Write a method called dangerousDescent that determines whether there is a downhill section in the hiking trail with a slope 
of more than -0.05. The slope is calculated by the rise in elevation over the run in distance. For example, the last kilometer section has 
a gradient of -0.01 because the rise in elevation is 40 - 50 = -10 meters. The distance covered in 1000 meters. -10 / 1000 = 0.01.

Your method should return true if there exists a dangerous descent in the given array, false otherwise.
*/

public boolean dangerousDescent(int[] elevation)
{
    for (int i=1; i <elevation.length; i++)
    {
        double difference = (elevation[i] - elevation[i-1])/1000;
        if ((difference)*100 < -5)
        {
            return true;
        }
        
    }
    return false;
}
