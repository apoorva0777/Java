package Arrays;

public class min_element_in_an_array {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        minele(arr);
    }

    public static void minele(int[] arr) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
