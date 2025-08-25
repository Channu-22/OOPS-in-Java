//////// package coding;


import java. util.*;
public class Array {
    public static void main(String[] args) {
        // System.out.println("Hello, sinnur!");

         Scanner sc = new Scanner (System.in);
      /*  //find MAXIMUM ELEMENT IN AN ARRAY
        //
        System.out.println("Enter array size");
        int n=sc.nextInt();
        int arr[] = new  int[n];
        System.out.println("Enter Array Element");
        for(int i=0; i<n; i++ ){
             arr[i]=sc.nextInt();
        }

        // int max=Integer.MIN_VALUE;
        // for(int i=0 ; i<n ; i++){
        //     if(arr[i]>max){
        //         max=arr[i];
        //     }
        // }

        // System.out.println("max element is " + maxElement(arr));
        */ 


        //EVEN AND ODD INT THE ARRAY OR LIST
        /* 
        int arr[] = {10,25,40,56,75};

        int even = 0;
        int odd = 0;
        for(int i : arr){
            if(i % 2 == 0 ){
                even++;
            }
            else{
                odd++;
            }

        }
        System.out.print("evenCount " + even + "   " +  "oddCount " + odd);
        */

        //REVERSE THE STRING 
        String str = "sinnur";

        
        

        // String reverse = "";
        // for(int i=str.length()-1 ; i >= 0; i-- ){
        //     reverse =  reverse + str.charAt(i);
        // }
        // System.out.println("reverse string is :" + reverse);

        //USING TWO POINTER APPROACH 
        // System.out.println(reverseString(str));



        //FIBANACCI SERIES UPTO TO N TERMS 
        /*
         * 
        // System.out.println("Enter n serios of fibanaccio");
        int fib = sc.nextInt();

        int a=0;
        int b=1;
        for(int i=0; i<fib ; i++){
            int c= a+b;

            // System.out.println(a);

            a=b;
            b=c;

        }
        */


        //NUMBER IS PRIME OR NOT 

        /*
         * System.out.println("Enter a number");
        int prime=sc.nextInt();
        if(prime == 0 || prime == 1){
            System.out.println("not prime");
        }
       
        else{
             int count=0;
        for(int i=2; i< prime ; i++){
            if(prime%i == 0){
                count++;
            }
        }
        if(count > 0 ){
            System.out.println("number is not prime");
        }
        else{
            System.out.println("number is prime");
        }
        }
         */

       






    }

    public static int maxElement(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            if(arr[i] > max){
                max=arr[i];
            }
        }

        return max;
    }

    public static String reverseString(String str){
        char ch[]= str.toCharArray();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }

        return new String(ch);

    }
}
