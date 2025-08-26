//////// package coding;


import java.util.*;

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


         //SECOND LARGEST ELEMENT IN AN ARRAY
        // int arr [] = {10, 50, 50, 50, 25} ;

        // int largest = Integer.MIN_VALUE;
        // int second = Integer.MIN_VALUE;
        // for(int i=0 ;i< arr.length; i++){
        //     if(arr[i] > largest){
        //         second=largest;
        //         largest=arr[i];
        //     }
        //     else if(arr[i] > second && arr[i] != largest){
        //         second = arr[i];
        //     }
        // }
        // if(second == Integer.MIN_VALUE){
        //     System.out.println("no second largest element");
        // }
        // else{
        //     System.out.println(second);
        // }
       


        //FACTORIAL OF A NUMBER 

        // System.out.println("Enter number");
        // int n = sc.nextInt();
        // int fact=1;
        // for(int i=n; i>=1 ; i--){
        //     fact= fact * i;
        // }

        // System.out.println("factorial of "+ n + "is : " + fact);


        //MERGE TWO SORTED ARRAY INTO ONE 

        System.out.println("Enter first array size length");
        int  n = sc.nextInt();

        int arr1[] = new int[n];

        System.out.println("Enter array element");
        for(int i=0 ; i<n; i++){
            arr1[i]=sc.nextInt();
        }

        System.out.println("Enter second arary size length");
        int m=sc.nextInt();

        int arr2[] = new int[m];

        System.out.println("Enter array element");
        for(int i=0 ; i<m; i++){
            arr2[i]=sc.nextInt();
        }

        // System.out.println("merged the array: " + Arrays.toString(mergeArray(arr1,n,arr2,m)));
        //merged array into one
        int merged []= mergeArray(arr1,n,arr2,m);
        System.out.println("merged array element");
        for(int i=0 ; i< merged.length; i++){
            System.out.print(" " + merged[i]+ "  ");
        }

    }


    //MERGE TWO SORTED ARRAY INTO ONE
    public static int[] mergeArray(int arr1[],int n, int arr2[], int m){
        ArrayList <Integer> al = new ArrayList<>();

        for(int i=0; i<n; i++){
            al.add(arr1[i]);
        }

        for(int i=0; i<m; i++){
            al.add(arr2[i]);
        }
        // return arr2;
        int size = al.size();

        int array[] = new int [size];

        for(int i=0; i<al.size(); i++){
            array[i] =(int) al.get(i);
        }

        Arrays.sort(array);

        return array;
    }

    //MAX ELEMENT IN AN ARRAY
    public static int maxElement(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            if(arr[i] > max){
                max=arr[i];
            }
        }

        return max;
    }

    //FOR REVERSING THE STRING
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
