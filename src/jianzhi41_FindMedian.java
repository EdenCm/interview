import java.util.Comparator;
import java.util.PriorityQueue;

public class jianzhi41_FindMedian {
    static class MedianFinder {
        private PriorityQueue<Integer> min_heap;
        private PriorityQueue<Integer> max_heap;
        /* initialize your data structure here. */
        public MedianFinder() {
            min_heap = new PriorityQueue<>();// 最小堆
            max_heap = new PriorityQueue<>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2 - o1;
                }
            });
        }
        // 维护两个堆，一个大堆，一个小堆，大堆里放小的元素 ，小堆里放大的元素，大堆的元素个数最多比小堆多一个
        public void addNum(int num) {
            // 先无条件向最大堆中添加数
            max_heap.add(num);
            // 如果小堆不为空且大堆最大的数大于小堆最小的数，则交换大堆堆顶与小堆堆顶的元素
            if (min_heap.size() != 0 && max_heap.peek() >min_heap.peek()){
                // 交换两个堆顶元素
                int maxv = max_heap.poll();
                int minv = min_heap.poll();
                max_heap.add(minv);
                min_heap.add(maxv);
            }
            // 维持大堆最多只能比小堆多一个元素
            if (max_heap.size() > min_heap.size()+1){
                min_heap.add(max_heap.poll());
            }
        }

        public double findMedian() {
            // 元素个数为奇数时
            if ((max_heap.size() + min_heap.size()) % 2 == 1) return max_heap.peek();
            // 元素个数 为偶数时
            return (max_heap.peek() + min_heap.peek()) / 2.0;
        }
    }

    public static void main(String[] args) {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(1);
        medianFinder.addNum(2);
        medianFinder.addNum(3);
        medianFinder.addNum(4);
        System.out.println(medianFinder.findMedian());
    }
}
