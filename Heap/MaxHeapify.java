public class MaxHeapify {
    public void heapify(int[] arr,int len,int root){
        // Initialize Largest as Root
        int largestElementIdx = root;
        int left = 2*root + 1;
        int right = 2*root + 2;

        if(left < len && arr[left] > arr[largestElementIdx]){
            largestElementIdx = left;
        }

        if(right < len && arr[right] > arr[largestElementIdx]){
            largestElementIdx = right;
        }

        if(largestElementIdx != root){
            // Swap
            int temp = arr[root];
            arr[root] = arr[largestElementIdx];
            arr[largestElementIdx] = temp;

            heapify(arr,len,largestElementIdx);
        }
    }
}
