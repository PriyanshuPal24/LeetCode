class Solution {
    public int sumOfUnique(int[] nums) {
         TreeMap<Integer,Integer> hm=new TreeMap<>();
		
		for(int i=0;i<nums.length;i++) {
	        hm.put(nums[i],hm.getOrDefault(nums[i], 0) +1 );
        }
        int sum=0;
        for(Integer key:hm.keySet() ){
            if(hm.get(key)==1){
                sum+=key;
            }
        }
        return sum;
    }
}
