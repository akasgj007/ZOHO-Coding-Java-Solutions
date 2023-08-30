// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class ReverseStringWithoutChangingSpeacialChars {
    public static void main(String[] args) {
       String s = "a,k%a$sh";
       char a[] = s.toCharArray();
      
       int l = 0, r = s.length() - 1;
       while(l<r){
           if(!Character.isAlphabetic(a[l]))
                l++;
            else if(!Character.isAlphabetic(a[r]))
                r--;
            else{
                char temp = a[l];
                a[l] = a[r];
                a[r] = temp;
                l++;
                r--;
            }
       }
       String res = new String(a);
            
        System.out.println(res);
    }
}
