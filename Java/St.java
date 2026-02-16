package Java;

// Palindrome

// Count frequency

// Remove duplicates

// Anagram

// First non-repeating character

public class St {
    public static void main(String[] args) {
        // Reverse String
        // String s = "hello world";
        // String revString = "";
        // for (int i = 0; i < s.length(); i++) {
        //     revString = s.charAt(i) + revString;
        //     // System.out.print(" "+s.charAt(i));
        // }
        // System.out.println(revString);

        // Palindrome
        // String s = "FUN";
        // String rev = "";
        // for (int i = 0; i < s.length(); i++) {
        //     rev = s.charAt(i) + rev;
        // }
        // if(s.equals(rev))
        //     System.out.println("Palindrome");
        // else
        //     System.out.println("Not Palindrome");

        // Count frequency
        // String s = "hello world";
        // String n = s.replaceAll(" ", "");
        // String s1[] = n.split("");

        // for (int i = 0; i < s1.length; i++) {
        //     int c = 0;
        //     for (int j = 0; j < s1.length; j++) {
        //         if (s1[i].equals(s1[j]))
        //             c++;
        //     }
        //     System.out.println(s1[i] + " " + c);
        // }

        // Anagram
        // String s1 = "listen";
        // String s2 = "silent";
        // char a1[] = s1.toCharArray();
        // char a2[] = s2.toCharArray();
        // Arrays.sort(a1);
        // Arrays.sort(a2);
        // if (Arrays.equals(a1, a2))
        //     System.out.println("Anagram");
        // else
        //     System.out.println("Not Anagram");

        // Rotate String
        String s = "abcdef";
        int k = 3;
        String s1="";
        String s2="";
        for (int i = 0; i < k; i++) {
            s1 += s.charAt(i) ;
        }
        for (int i = k; i < s.length(); i++) {
            s2 += s.charAt(i);
        }
        System.out.println(s2+s1);

    }
}
