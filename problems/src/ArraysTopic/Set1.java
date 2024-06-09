package ArraysTopic;

import Util.Utils;

import java.util.*;

public class Set1 {
/*
Find the Largest element in an array
 */
    public static void problem1(){
        int[] inputArr=Utils.getArray();
        //method1
        int largest=method1_1(inputArr);
        System.out.println(largest);

    }
/*
Second-Largest Element in an Array without sorting
 */
    public static void problem2(){
        int[] inputArr=Utils.getArray();

        if(inputArr.length<=1)
            System.out.println("No 2nd largest element");
        else if(inputArr.length==2){
             if(inputArr[0]==inputArr[1])
                 System.out.println("No 2nd largest element");
             else{
               int secLargest= Math.min(inputArr[0], inputArr[1]);
             }
        }else{
            int first=inputArr[0];
            int second=-1;
            for(int e:inputArr){

                if(e>first){
                    second=first;
                    first=e;
                }else if(e!=first && e>second){
                    second=e;
                }
            }
            System.out.println("2nd Largest:"+second);

        }
    }

    public static void problem3(){
        int[] input=Utils.getArray();
        int[] result={-1,-1,-1,-1};
//        result[0]=input[0];
        int i=0;
        for(int e:input){
            int k=result.length-1;
            for(int j=0;j<result.length;j++){
                if(e>result[j]){
                    while(k>j){
                        result[k]=result[k-1];
                        k--;
                    }
                    result[j]=e;
                    break;
                }
            }
        }
        Utils.printArray(result);
    }
    public static void problem4(){
        int[] input=Utils.getArray();

        if(input.length<=1)
            System.out.println("Sorted");
        else{
            int next=input[1];
            int prev=input[0];
            int j=1;boolean flag=true;
            while(j<input.length-1){
                if(next>=prev)
                {   j++;
                    prev=next;
                    next=input[j];
                }else {
                    flag=false;break;
                }
            }
            if(flag)
                System.out.println("Sorted");
            else
                System.out.println("Not sorted");
        }

    }
    public static void problem5(){
        int[] input=Utils.getArray();

        ArrayDeque<Integer> stack=new ArrayDeque<>();
        for(int e:input){
            if(stack.isEmpty())
                stack.push(e);
            else{
                int top=stack.peek();
                if(top!=e)
                    stack.push(e);
            }
        }
        for(int i=stack.size()-1;i>=0;i--){
            input[i]=stack.pop();
        }
        Utils.printArray(input);
    }
    public static void problem6(){
        int[] arr1 = {1,2,3,4,5};
       int[] arr2 = {2,3,4,4,5};
       ArrayList<Integer> list=new ArrayList<>();
       for(int e:arr1){
           if(!list.contains(e))
               list.add(e);
       }
        for(int e:arr2){
            if(!list.contains(e))
                list.add(e);
        }
        Collections.sort(list);
        System.out.println(list);

    }
    public static void problem7(){
        int[] test={1,0,1,1,0,1,0,0,1,1,1,0};
        int i=0;int maxOne=0;int oneCounter=0;
        while(i<test.length){
            if(test[i]==0){
                maxOne=Math.max(maxOne,oneCounter);
                i++;oneCounter=0;
            }else {
                oneCounter++;
                i++;
            }
        }
        System.out.println(maxOne);
    }
    public static void problem8(){
        int[]arr = {4,1,2,1,4,2};
        int xor=0;
        for(int i=0;i<arr.length;i++){
            xor=xor^arr[i];
        }
        System.out.println(xor);
    }
    public static void problem9(){
//        int[] arr={10, 5, 2, 7, 1, 9};
        int[] arr={2,3,5,1,9};
        int k=10; int max=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                if(sum==k){
                    max=Math.max(max,j-i+1);
                }else if(sum>k){
                    break;
                }
            }
        }
        System.out.println("Length: "+max);
    }
    public static int method1_1(int[] arr){
        int max=-1;
        for (int j : arr) {
            max = Math.max(max, j);
        }
        return max;
    }

    public static void main(String[] args) {
        Set1.problem9();
    }
}
