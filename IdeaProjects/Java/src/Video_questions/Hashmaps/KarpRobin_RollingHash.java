package Video_questions.Hashmaps;

public class KarpRobin_RollingHash {
        public void search(String text, String pattern) {
            int n = text.length();
            int m = pattern.length();
            int base = 256; // number of possible characters
            int mod = 101;  // a prime number to reduce collisions

            long patternHash = 0;
            long textHash = 0;
            long h = 1; // base^(m-1) % mod

            // Precompute h = (base^(m-1)) % mod
            for (int i = 0; i < m - 1; i++)
                h = (h * base) % mod;

            // Compute hash of pattern and first window of text
            for (int i = 0; i < m; i++) {
                patternHash = (base * patternHash + pattern.charAt(i)) % mod;
                textHash = (base * textHash + text.charAt(i)) % mod;
            }

            // Slide the pattern over text
            for (int i = 0; i <= n - m; i++) {
                // If hash values match, check characters one by one
                if (patternHash == textHash) {
                    if (text.substring(i, i + m).equals(pattern)) {
                        System.out.println("Pattern found at index: " + i);
                    }
                }

                // Compute hash for next window
                if (i < n - m) {
                    textHash = (base * (textHash - text.charAt(i) * h) + text.charAt(i + m)) % mod;

                    // Handle negative hash value
                    if (textHash < 0)
                        textHash += mod;
                }
            }
        }

        public static void main(String[] args) {
            KarpRobin_RollingHash rk = new KarpRobin_RollingHash();
            rk.search("ABCCDDAEFG", "CDD");
        }
}
//public class SimpleRabinKarp {
//
//    public void search(String text, String pattern) {
//        int patternLength = pattern.length();
//        long patternHash = pattern.hashCode();
//        long textHash = text.substring(0, patternLength).hashCode();
//
//        for (int i = 0; i <= text.length() - patternLength; i++) {
//            // If hash matches, verify with actual string comparison
//            if (textHash == patternHash) {
//                if (text.substring(i, i + patternLength).equals(pattern)) {
//                    System.out.println("Pattern found at index: " + i);
//                }
//            }
//
//            // Update textHash for next substring window
//            if (i < text.length() - patternLength) {
//                String nextWindow = text.substring(i + 1, i + 1 + patternLength);
//                textHash = nextWindow.hashCode();
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        SimpleRabinKarp rk = new SimpleRabinKarp();
//        rk.search("ABCCDDAEFG", "CDD");
//    }
//}
