public class Arraysortbubble {
    public static void main(String[] args) {
        int[] arr = {23, -1, 4, 2, 2, 18};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) { //arr[i]<arr[j] for decending order
                    int tem = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tem;
                }
            }
        }
        for (int v : arr) {
            System.out.print(v + " ");
        }
    }
}