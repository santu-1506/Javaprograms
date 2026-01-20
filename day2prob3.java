// Mr. Param is working with Strings.
// He is given a String S. He has to find the palindromes in S, 
// A palindrome can be a substring of S (Strictly substrings only, not subsequences).

// Your task is to find the count of the number of palindromes can be formed from S.

// NOTE: Count each occurence of palindromes if duplicate substrings found. 

// Input Format:
// -------------
// A string S

// Output Format:
// --------------
// Print an integer, number of palindromes.

// Sample Input-1:
// ---------------
// divider

// Sample Output-1:
// ----------------
// 9

// Explanation:
// -------------
// Palindromes are d, i, v, i, d, e, r, ivi, divid

// Sample Input-2:
// ---------------
// abcdef

// Sample Output-2:
// ----------------
// 6

// Explanation:
// -------------
// Palindromes are a, b, c, d, e, f.

import java.util.*;
public class day2prob3 {
    static int countPal(String s) {
        int n = s.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            count += check(s, i, i);
            count += check(s, i, i + 1);
        }
        return count;
    }
    static int check(String s, int l, int r) {
        int c = 0;
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            c++;
            l--;
            r++;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(countPal(s));
    }
}