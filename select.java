public class select{

    public static void main(String[] args){
        int arr[]={1,4,-5,7,8};
        int max=4;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The maximum element in the array is: "+max);
    }
}