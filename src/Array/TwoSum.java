package Array;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution,
 * and you may not use the same element twice.
 * Example: Given nums = [2, 7, 11, 15], target = 9,  Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
 *
 * @author home-pc
 * @create2017 -08 -15 -19:29
 */
public class TwoSum {
    public static int[] twoSum(int [] numbers,int target){
        int m[]=new int[2];
        Map<Integer,Integer> a=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            if(a.containsKey(target-numbers[i])){
                m[1]=i;
                m[0]=a.get(target-numbers[i]);
                return m;
            }else
                a.put(numbers[i], i);
        }
        return m;
    }
    public static void main(String[] args) {
        int[] nums={-1,2,3,5};
        int []q=new int [2];
        int target=5;
        q=twoSum(nums, target);
        for(int i=0;i<q.length;i++){
            System.out.print(q[i]+" ");
        }
    }

}
