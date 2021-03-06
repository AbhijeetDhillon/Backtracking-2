// Time Complexity :O(n2^n) n is the length of the nums array. 
// Space Complexity :O(n2^n) n is the length of the nums array
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :I'm confused with the time and space complexity


// Your code here along with comments explaining your approach

class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> subsets(int[] nums) {
        result = new ArrayList<>();
        if(nums == null || nums.length ==0) return result;
        helper(nums, new ArrayList<>() , 0);
        return result;
    }
    
    private void helper(int[] nums, List<Integer> temp,int index){
        //base
        if(index==nums.length){ 
            result.add(temp);
            return;
        }
        
        //logic
        //do not select
        helper(nums,new ArrayList<>(temp),index+1);
        
        //select
        temp.add(nums[index]);
        helper(nums,new ArrayList<>(temp),index+1);
    
        
        }
    }
