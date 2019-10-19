public class Main {
    public static void main(String[] args){
        // Binary Tree Representation of input array
        //                  1
        //               /     \
        //             3         5
        //           /    \     /  \
        //          4      6   13  10
        //         / \    / \
        //        9   8  15 17
        int arr[] = { 1, 3, 5, 4, 6, 13, 10,9, 8, 15, 17 };
        int n = arr.length;
        BuildMaxHeap bh = new BuildMaxHeap();
        bh.build(arr,n);
        System.out.println();

        int arr2[] = { 1, 3, 5, 4,9, 8, 15, 17,6, 13, 10 };
        int n2 = arr2.length;
        BuildMinHeap bmh = new BuildMinHeap();
        bmh.build(arr,n2);
    }
}
