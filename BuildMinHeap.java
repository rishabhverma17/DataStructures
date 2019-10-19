public class BuildMinHeap {
    public void build(int[] arr, int len){
        MinHeapify mh = new MinHeapify();
        int startIdx = (len/2)+1;
        for(int i = startIdx; i>=0; i--){
            mh.func_minHeapify(arr,len,i);
        }

        // print Min-Heap
        System.out.println("Min-Heap Representation of Array");
        for(int i=0; i<len; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
}
