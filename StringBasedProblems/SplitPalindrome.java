public class SplitPalindrome {

    public static boolean isPalindrome(String s) {
        String r = "";
        for(int i=s.length()-1;i>=0;i--)
            r+=s.charAt(i);
        return r==s? true:false;
    }
    public static void main(String[] args) {
        String s = "nayannamantenet";
        int n = s.length();
        for(int i=0;i<n-1;i++) {
            String s1 = s.substring(0, i);
            int k = 1;
            if(isPalindrome(s1)){
                String s2 = s.substring(i+1,i+k);
                String s3="";
                    if(isPalindrome(s2))
                        s3 = s.substring(i+k, n);
                
            }
        }
    }
}
