class Solution {
    // my first problem added in my github
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int [] ans = new int[n];
        int cumval =0;
        int cumsum =0;
        for(int i=0;i<n;i++)
        {
            ans[i] = cumsum;
             cumval += boxes.charAt(i) == '0' ? 0 : 1;
            cumsum +=cumval;
        }
         cumval =0;
         cumsum =0;
         for(int i=n-1;i>=0;i--)
         {
            ans[i] +=cumsum;
            cumval += boxes.charAt(i) == '0' ? 0 : 1;
            cumsum+=cumval;

         }
         return ans;

        
    }
}