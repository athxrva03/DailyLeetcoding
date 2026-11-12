class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long op1 = ((long) cost1 * need1) + ((long) cost2 * need2);

        int common = Math.min(need1 , need2);
        long op2 = ((long) common * costBoth) + ((long) (need1 - common) * cost1) + ((long) (need2 - common) * cost2);

        int high = Math.max(need1 , need2);
        long op3 = (long) high * costBoth;

        long result = Math.min(op1 , Math.min( op2 , op3 ));
        return result;
    }
}