package assignments;

import java.util.Arrays;

public class Assignment35_Copy_one_array_to_another
{
public static void main(String[] args) 
{
    int rollno1[] = new int[4];
    
    rollno1[0] = 10;
    rollno1[1] = 20;
    rollno1[2] = 30;
    rollno1[3] = 40;

    int rollno2[] = new int[4];

    // Copying rollno1 to rollno2
    for (int i = 0; i < 4; i++) 
    {
        rollno2[i] = rollno1[i];
    }

    // Print both arrays
    System.out.println("rollno1: " + Arrays.toString(rollno1));
    System.out.println("rollno2: " + Arrays.toString(rollno2));
  
    
 
}


}
