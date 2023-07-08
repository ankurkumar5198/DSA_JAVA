import java.io.*;

class maxprod {
    static int maxSubarrayProduct(int arr[]) {

        int result = arr[0];
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int mul = arr[i];

            for (int j = i + 1; j < n; j++) {

                result = Math.max(result, mul);
                mul *= arr[j];
            }

            result = Math.max(result, mul);
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 20, -5, 8, 1, 25 };
        System.out.println("Maximum Sub array product is "
                + maxSubarrayProduct(arr));
    }
}
//Till maximum sum of hour glass in  a matrix