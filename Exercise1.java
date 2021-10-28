package com;

public class Exercise1 {

	public static int sumOfSeries(int n, int o,int p )
    {
        int sum = 0;
        for (int x=1; x<=n; x++)
            sum += x*x*x;
            return sum;
    }

	public static void main(String[] args) {
		
		 
	        System.out.println(sumOfSeries(10, 6, 7 ));
	}

}
