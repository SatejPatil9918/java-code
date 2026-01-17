import java.util.Arrays;

//input1 =8
 //input2={1, -6, -5, -12, 1, 3, 8, -3}

public class Rockwellqts {
    public static int circuitboard(int input1,int[] input2){
        Arrays.sort(input2);     //{-12, -6, -5, -3, 1, 1, 3, 8}

        int left=0;
        int right=input2.length-1;
        int[]arr=new int[input1];
        int idx=0;
        while(left<=right){

            if(left==right){
                arr[idx++]=input2[left];
            }else{
                arr[idx++]=input2[right];
                arr[idx++]=input2[left];
            }
            right--;
            left++;
        }
        int maxSum = 0;
        for (int i = 0; i < input1 - 1; i=i+2) {
            maxSum += Math.abs(arr[i] - arr[i + 1]);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int input1=5;
        int[]input2={-99,-1,0,50,10};
        int result=circuitboard(input1,input2);
        System.out.println(result);
    }
}
