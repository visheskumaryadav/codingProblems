package Util;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Utils {

    public static  void printArray(int[] arr){
        System.out.println();
        for (int t : arr) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    public static <T> void printList(List<T> list){
        System.out.println();
        for(T t:list){
            System.out.print(t + " ");
        }
        System.out.println();
    }

    public static <K,V> void printMap(Map<K,V> map){
        System.out.println();
        Set<Map.Entry<K, V>> entrySet = map.entrySet();
        for(Map.Entry<K,V> e:entrySet){
            System.out.print("{"+e.getKey()+":"+e.getValue()+"}");
        }
        System.out.println();
    }
    public static int[] getArray(){
        System.out.println("Enter the array Size:");
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the array elements:");
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("DONE");
        return arr;
    }
}
