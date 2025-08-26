//////// package coding;


import java.util.*;

public class Array {
    public static void main(String[] args) {
        // System.out.println("Hello, sinnur!");

         Scanner sc = new Scanner (System.in);
        // QUESTION 1 : find MAXIMUM ELEMENT IN AN ARRAY
        // System.out.println("Enter array size");
        // int n=sc.nextInt();
        // int arr[] = new  int[n];
        // System.out.println("Enter Array Element");
        // for(int i=0; i<n; i++ ){
        //      arr[i]=sc.nextInt();
        // }

        // int max=Integer.MIN_VALUE;
        // for(int i=0 ; i<n ; i++){
        //     if(arr[i]>max){
        //         max=arr[i];
        //     }
        // }
        // System.out.println("max element is " + maxElement(arr));
         

        // QUESTION 2: EVEN AND ODD INT THE ARRAY OR LIST
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


        // QUESTION 3: REVERSE THE STRING 
        // String str = "sinnur";

        // String reverse = "";
        // for(int i=str.length()-1 ; i >= 0; i-- ){
        //     reverse =  reverse + str.charAt(i);
        // }
        // System.out.println("reverse string is :" + reverse);

        //USING TWO POINTER APPROACH 
        // System.out.println(reverseString(str));


        // QUESTION 4:FIBANACCI SERIES UPTO TO N TERMS 
        /*
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


        // QUESTION 5: NUMBER IS PRIME OR NOT 

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


         // QUESTION 6: SECOND LARGEST ELEMENT IN AN ARRAY
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
       

        // QUESTION 7: FACTORIAL OF A NUMBER 

        // System.out.println("Enter number");
        // int n = sc.nextInt();
        // int fact=1;
        // for(int i=n; i>=1 ; i--){
        //     fact= fact * i;
        // }

        // System.out.println("factorial of "+ n + "is : " + fact);


        // QUESTION 8: MERGE TWO SORTED ARRAY INTO ONE 

        // System.out.println("Enter first array size length");
        // int  n = sc.nextInt();

        // int arr1[] = new int[n];

        // System.out.println("Enter array element");
        // for(int i=0 ; i<n; i++){
        //     arr1[i]=sc.nextInt();
        // }

        // System.out.println("Enter second arary size length");
        // int m=sc.nextInt();

        // int arr2[] = new int[m];

        // System.out.println("Enter array element");
        // for(int i=0 ; i<m; i++){
        //     arr2[i]=sc.nextInt();
        // }

        // // System.out.println("merged the array: " + Arrays.toString(mergeArray(arr1,n,arr2,m)));
        // //merged array into one
        // int merged []= mergeArray(arr1,n,arr2,m);
        // System.out.println("merged array element");
        // for(int i=0 ; i< merged.length; i++){
        //     System.out.print(" " + merged[i]+ "  ");
        // }


        // QUESTION 9: COUNT THE FREQUENCY OF ELEMENTS IN AN ARRAY

        // System.out.println("Enter first array size length");
        // int  n = sc.nextInt();

        // int arr1[] = new int[n];
        // System.out.println("Enter array element");
        // for(int i=0 ; i<n; i++){
        //     arr1[i]=sc.nextInt();
        // }

        // HashMap<Integer, Integer> hm =new HashMap<>();
        // for(int arr : arr1){
        //     hm.put(arr,hm.getOrDefault(arr,0) + 1 );
        // }

        // hm.forEach((key,value) -> 
        //     System.out.println("key is : " + key + "  value are :" +value )
        // );


        // QUESTION 10: FIND THE MISSING NUMBER IN THE RANGE FROM 1 TO N

        //  System.out.println("Enter first array size length");
        // int  n = sc.nextInt();
        // int arr1[] = new int[n];
        // System.out.println("Enter array element");
        // for(int i=0 ; i<n; i++){
        //     arr1[i]=sc.nextInt();
        // }
        // System.out.println("missing number is: "+missingNumber(arr1));


        // QUESTION 11: NUMBER IS ARMSTRONG OR NOT

        // System.out.println("Enter a number");
        // int n=sc.nextInt();
        // if(isArmstrong(n)){
        //     System.out.println("is Armstrong number");
        // }
        // else{
        //     System.out.println("Not Armstrong number");
        // }


        // QUESTION 12: FIND THE INTERSECTION OF TWO ARRAY



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

        int intersected[] = intersection(arr1,arr2);


        System.out.println("Intersection array are : ");

        for(int i=0; i<intersected.length; i++){
            System.out.println(intersected[i]+ " ");
        }


        

    }

    //FIND THE INTERSECTION OF TWO ARRAY
    public static int[] isIntersected(int arr1[], int n, int m,int arr2[]){
        // int pointer = 0;
        int i=0;
        int j=0;

        ArrayList <Integer> al= new ArrayList<>();
 
        while(i<n && j<m){

            if( arr1[i] > arr2[j]){
                j++;
            }
            else if(  arr1[i] < arr2[j]){ 
                i++;
            }
            else{
                al.add(arr1[i]);
                i++;
                j++;
            }
        }
        int copied [] = new int[al.size()];
        for(int k=0 ; k<al.size(); k++ ){

            copied[k] = al.get(k);

        }
        return copied;
    }

    //THE INTERSECTION OF TWO ARRAY USING HASHSET OR TREESET
    public static int[] intersection(int arr1[], int arr2[]){
        HashSet<Integer> hs = new HashSet<>();
        for(int i: arr1){
            hs.add(i);
        }

        HashSet<Integer> inter= new HashSet<>();
        for(int i : arr2){
            if(hs.contains(i)){
                inter.add(i);
            }
        } 
        int counter=0;
        int result[] = new int[inter.size()];
        for(int i : inter){
            result[counter++] = i;
        }

        return result;
    }


    //NUMBER IS ARMSTRONG OR NOT
    public static boolean isArmstrong(int num){
        int original=num;
        int sum=0;
        //couting digits
        int digits = String.valueOf(num).length();
        while(num > 0){
            int digit = num % 10;
            sum = (int)(sum + Math.pow(digit, digits));
            num = num/10;
        }
        //checking armstrong condition 
        return original == sum;
    }

    //FIND THE MISSING NUMBER IN THE RANGE FROM 1 TO N
    public static int missingNumber(int arr[]){
        for(int i=0; i<arr.length; i++){

            if(arr[i] != i+1){
                return i+1;
            }
        }
        return  arr.length+1;
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
            //elemet is greater thank max max=element
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
