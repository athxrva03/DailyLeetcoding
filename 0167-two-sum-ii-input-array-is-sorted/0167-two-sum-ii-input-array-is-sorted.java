class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int r = 0 ; r < numbers.length ; r++){
            int comp = target - numbers[r];

            if(map.containsKey(comp)){
                return new int[] {map.get(comp)+1 , r+1};
            }

            map.put(numbers[r] , r);
        }

        return new int[] {-1,-1};
    }
}