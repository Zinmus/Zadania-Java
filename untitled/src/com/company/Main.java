package com.company;

public class Main {

    public static void main(String[] args)
    {
	    int[] numbers = {9, 9, 2, 1};
	    int[] minutes = new int[3];
	    int current = 0;
	    for(int i = 0; i <= 3; i++)
	    {
	        for(int j = 0; j <= 3; j++)
	        {
	            if(i != j)
	            {
                    current = numbers[i] * 10 + numbers[j];
                }
	            if(current <= 23)
                {
                    int m = 0;
                    for(int n = 0; n <= 3; n++)
                    {
                        if(n != i)
                        {
                            if(n != j)
                            {
                                minutes[m] = numbers[n];
                                m++;
                            }
                        }
                    }
                }
            }
        }
    }
}
