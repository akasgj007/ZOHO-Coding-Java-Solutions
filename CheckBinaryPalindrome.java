// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class CheckBinaryPalindrome {
    public static void main(String[] args) {
       int i = 8;
       String binaryOfInput = Integer.toBinaryString(i);
       System.out.println(binaryOfInput);
       StringBuilder sb = new StringBuilder(binaryOfInput);
       sb.reverse();
       System.out.println(sb);
       if(sb.toString().equals(binaryOfInput))
        System.out.println("Palindrome");
       else
        System.out.println("Not a Palindrome");
    }
}
