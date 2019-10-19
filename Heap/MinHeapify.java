public class MinHeapify {
    public void func_minHeapify(int[] arr,int len, int root){
        int minElementIdx = root;
        int left = 2*len + 1;
        int right = 2*len + 2;

        if(left < len && arr[left] < arr[minElementIdx]){
            minElementIdx = left;
        }

        if(right < len && arr[right] < arr[minElementIdx]){
            minElementIdx = right;
        }

        if(minElementIdx != root){
            int temp = arr[root];
            arr[root] = arr[minElementIdx];
            arr[minElementIdx] = temp;

            func_minHeapify(arr,len,minElementIdx);
        }
    }
}
