public class StringDistance {
    public static void main(String[] args) {
        String s = "flawn", s1 = "law";
        int n1 = s.length(),n2 = s1.length(),sum=0;
        sum+=(int)Math.abs(n1-n2);
        System.out.println(sum);
        
        // int min = n1>n2? n2:n1;
        for(int i=0;i<n2;i++){
            if(s.contains(s1.substring(0, i)));
                
        }
        System.out.println(sum);
    }
}

// Given two strings str1 and str2, write a function to compute the Levenshtein distance between them. The Levenshtein distance is defined as the minimum number of single-character edits (insertions, deletions, or substitutions) required to change one string into the other.

// Example 1: "kitten", "sitting" should return 3, as changing index 0 ('k' to 's'), 4 ('e' to 'i') and 6 (adding 'g') are enough to transform the strings.

// Example 2: "flaw", "lawn" should return 2, as changing index 0 (dropping 'f') and 3 (adding 'n') is enough to transform the strings.

// Input Format

// str1 : a string str2 : a string

// Constraints

// (1 <= len(str1), len(str2) <= 1000)

// Output Format

// Return an integer, representing the Levenshtein distance between str1 and str2.

// Sample Input 0

// kitten sitting
// Sample Output 0

// 3
// Explanation 0

// Minimum number of edits required: 3 Substituting 'k' with 's' - 1 Substituting 'e' with 'i' - 1 Inserting 'g' - 1

// Sample Input 1

// flaw lawn
// Sample Output 1

// 2
// Explanation 1

// Minimum number of edits - 2 Removing 'f' - 1 Inserting 'n' - 1