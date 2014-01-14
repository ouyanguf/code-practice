class Solution{
    public static long countWays(long n, long[] map){
        if(n<0)
            return 0;
        if(n==0)
            return 1;
        map[(int)n] = countWays(n-1,map) + countWays(n-2,map) + countWays(n-3,map);
        return map[(int)n];
    }
}
