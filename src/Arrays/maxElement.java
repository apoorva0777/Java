package Arrays;

public class maxElement {
        public static void main(String[] args) {
            int[] arr={10,20,30,40,50};
            maxele(arr);
        }

        public static void maxele(int[] arr) {
            int max=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
            }
            System.out.println(max);
        }
    }

