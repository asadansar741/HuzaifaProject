package array;

public class SmallestAndLargestNum {
    public static void main(String[] args) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        System.out.println(smallest + "  "+ largest);
        int arr[]= {5,41,85,68,75,23,25,45,85,6,32,5,2,5,2,};
        for (int i=0; i<arr.length; i++){
            if (arr[i]>largest)
                largest = arr[i];
            if (arr[i] < smallest)
                smallest = arr[i];
        }

        System.out.println("Smallest : "+ smallest + " and Largest : "+largest);
    }
}
