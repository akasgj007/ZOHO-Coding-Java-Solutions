// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class SecondLargestElem{
    public static void main(String[] args) {
        int arr[] = new int[]{12, 35, 1, 10, 34, 1};
        int first = arr[0];
        int second = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>first){
                second = first;
                first = arr[i];
            }
            else if(arr[i]>second && arr[i]<first){
                second = arr[i];
            }
            System.out.println(i+" : "+first+"-"+second);
        }
        System.out.println(second);
    }
}
