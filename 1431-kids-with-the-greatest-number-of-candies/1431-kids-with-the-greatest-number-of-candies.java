class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;
        int max=0;
        for(int i=0;i<n;i++){
            if(candies[i]>max){
                max=candies[i];
            }
            
        }
        List<Boolean> result=new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            candies[i]=candies[i]+extraCandies;
            if(candies[i]<max){
                result.add(false);
            }
            else{
                result.add(true);
            }
        }
        return result;
        
    }
}