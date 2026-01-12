import java.util.HashMap;

public class Hashmaps_1 {
    public static int sumHighestAndLowestFrequency(int[] nums) {
        HashMap<Integer,Integer> maps=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int num=nums[i];

            if(maps.containsKey(num)){
                maps.put(num,maps.get(num)+1);
            }
            else{
                maps.put(num,1);
            }
        }

        int highestFreq=0;
        int lowestFreq=Integer.MAX_VALUE;

        for(int key:maps.keySet()){
            int freq=maps.get(key);
            int value=maps.get(key);
            if(freq>highestFreq){
                highestFreq=freq;
            }
            if(value<lowestFreq){
                lowestFreq=value;
            }
        }
        int sum=lowestFreq+highestFreq;
        return sum;
    }

    public static void main(String[] args) {
        int[] nums={1, 2, 2, 3, 3, 3};
        int result=sumHighestAndLowestFrequency(nums);
        System.out.println(result);
    }
}
