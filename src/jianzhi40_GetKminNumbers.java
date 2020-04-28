import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class jianzhi40_GetKminNumbers {
    static class Solution {
        // 方法一快排 O(n) = nlogn
        private int[] array;
        public int[] getLeastNumbers(int[] arr, int k) {
            if (arr == null || arr.length == 0) return new int[0];
            int[] res = new int[k];// 返回数组
            array = arr;
            quickSort(array, 0, arr.length - 1);

            for (int i = 0; i < k; i++) {
                res[i] = array[i];
            }
            return res;
        }
        // 快速排序
        private void quickSort(int[] arr, int start, int end) {
            if (start >= end) return;

            int mid = arr[start];
            int l = start;
            int r = end;
            while (l < r) {
                while (l < r && arr[r] >= mid) {
                    r -= 1;
                }
                arr[l] = arr[r];

                while (l < r && arr[l] < mid){
                    l += 1;
                }
                arr[r] = arr[l];
            }
            arr[l] = mid;
            quickSort(arr,start,l-1);
            quickSort(arr,l+1,end);
        }


        // 方法二 建立容量为k的最大堆
        public int[] getLeastNumbers2(int[] arr, int k) {
            int[] res = new int[k];
            MaxHeap<Integer> maxHeap = new MaxHeap<>(k);
            for (int i : arr) {
                if (maxHeap.size()< k ){
                    maxHeap.add(i);
                }else if (maxHeap.findMax() >= i){
                        maxHeap.extractMax();
                        maxHeap.add(i);
                }
            }
            while (!maxHeap.isEmpty()){
                res[k-1] = maxHeap.extractMax();
                k -= 1;
            }
            return res;
        }
    }

    public static void main(String[] args) {
        int[] array = {6,5,4,3,2,1};
        Solution solution = new Solution();
        int[] leastNumbers = solution.getLeastNumbers(array, 3);
//        System.out.println(Arrays.toString(leastNumbers));
        // 测试堆
        MaxHeap<Integer> maxHeap = new MaxHeap<>(array.length);
        for (int num : array) {
            maxHeap.add(num);
        }
//        System.out.println(maxHeap.findMax());

        // 测试堆方法
        int[] leastNumbers2 = solution.getLeastNumbers2(array, 3);
        System.out.println(Arrays.toString(leastNumbers2));
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        priorityQueue.add(2);
        priorityQueue.add(3);
        priorityQueue.add(1);
        priorityQueue.add(3);
        priorityQueue.add(5);
        System.out.println(priorityQueue.poll());
//        System.out.println(priorityQueue.remove(priorityQueue.size()-1));
        System.out.println(priorityQueue.peek());

    }
}
