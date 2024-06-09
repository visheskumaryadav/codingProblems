package ArraysTopic;

public class Set2 {

    public static void problem1(){
        int[]test={1,2,3,4};

        for(int i=0;i<test.length;i++){
            for(int j=i;j<test.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(test[k]+" ");
                }
                System.out.println();
            }
        }
    }

    public static void problem2(){
        int[] test={-1, 2, 3};int k=15;
        int l=0; int sum=test[0];int max=0;
        for(int r=1;r<test.length;r++){
            if(sum==k){
                max=Math.max(max,r-l);
            }

            while(sum>k){
                sum-=test[l];
                l++;
            }
            sum+=test[r];
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        problem2();
    }
}
