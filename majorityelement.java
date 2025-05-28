class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        int n=nums.length;
        int t=n/3;
        Map<Integer,Integer> map=new HashMap<>();
        for(int vote:nums){
            map.put(vote,map.getOrDefault(vote,0)+1);
        }
        List<Integer> ans=new ArrayList<>();
        for(Map.Entry<Integer,Integer>entry :map.entrySet()){
            if(entry.getValue()>t){
                ans.add(entry.getKey());
                
            }
        }
        Collections.sort(ans);
        return ans;
        // Your code goes here.
    }
}
