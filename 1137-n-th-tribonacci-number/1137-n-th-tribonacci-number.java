class Solution {
    private int funn(ArrayList<Integer>dp,int n){
        //base case
        if(n==0) return 0;
        if (n == 1 || n == 2) return 1;
        if (dp.get(n) != -1){
            return dp.get(n);
        }
        int result = funn(dp, n - 1) + funn(dp, n - 2) + funn(dp, n - 3);
        dp.set(n, result);
        return result;
    }
    public int tribonacci(int n) {
        ArrayList<Integer> dp = new ArrayList<>(Collections.nCopies(n + 1, -1));
        return funn(dp, n);
    }
}