// User function Template for Java

class Solution {
    void pushZerosToEnd(int[] arr) {
        int pos=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[pos];
                arr[pos]=temp;
                
            
        
        pos++;
            }
        }
    }
}
