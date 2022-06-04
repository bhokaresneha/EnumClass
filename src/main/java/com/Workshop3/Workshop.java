/* problem statement=>
Java program to find non-repeating elements in an array
Input : arr[8] = [10, 20, 40, 30, 50, 20, 10, 20]
Output : 40 30 50
* */

package com.Workshop3;
public class Workshop {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        // initializing array
        int arr[]=new int[]{10,20,40,30,50,20,10,20};
        // finding no duplicate values
        for(int i=0;i<arr.length;i++) {
            int count = 1;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j])
                    count++;
            }
            if (count == 1) {
                System.out.println(arr[i]);
            }
        }
    }}
