public class ARRAY1{

    public static int multi(){
        int arr[]={1,2,3,4,5};
        int a=1;

        for(int i=0;i<arr.length;i++){
            a=a*arr[i];
        }
        return a;
    }
    public static void main(String []args){

        int result=multi();
        System.out.println("The multiplication of array elements is: "+result);
    }
}