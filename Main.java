public class Main {

    public static void setrid(int[] arr){
        boolean rozbite = true;

        while(rozbite){
            rozbite = false;
            for(int i=1; i<arr.length; i++){
                if(arr[i-1]>arr[i]){
                    rozbite = true;
                    int k = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = k;
                }
            }
        }
    }

    public static void main(String[] args) {
       int[] arr = {13,5,8,123,1,2};
       setrid(arr);
       for(int i: arr){
           System.out.println(i);
       }
    }
}