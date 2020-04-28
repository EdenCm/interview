import java.util.ArrayList;
import java.util.List;
public class MaxHeap<E extends Comparable<E>>  {

    private List<E> data;

    public MaxHeap(int capacity){
        data = new ArrayList<>(capacity);
    }
    public MaxHeap() {
        data = new ArrayList<>();
    }
    // 返回数组元素个数
    public int size(){
        return data.size();
    }
    public boolean isEmpty(){
        return data.isEmpty();
    }
    private int parent(int index){
        if (index == 0 ){
            throw new IllegalArgumentException("index-0 doesn't have parent.");
        }
        return (index - 1) / 2;
    }
    // 输入父亲索引，返回左孩子索引
    private int leftChild(int index){
        return index * 2 + 1;
    }
    // 有孩子索引
    private int rightChild(int index){
        return index * 2 + 2 ;
    }
    public void add(E e){
        data.add(e);
        sift_up(data.size() -1);
    }
    // 完成数组中两个数的交换
    private void swap(int i ,int j){
        E temp = data.get(i);
        data.set(i,data.get(j));
        data.set(j,temp);
    }
    // 元素上浮
    private void sift_up(int k){
        while (k > 0 && data.get(parent(k)).compareTo(data.get(k)) < 0 ){
            swap(parent(k),k);
            k = parent(k);
        }
    }
    // 看一下堆中最大元素
    public E findMax(){
        if (data.size() == 0) {
            throw new IllegalArgumentException("Can not findMax when heap is empty!");
        }
        return data.get(0);
    }
    public E extractMax(){
        E ret = findMax();
        swap(0,data.size()-1);
        data.remove(data.size() -1);
        sift_down(0);
        return ret;
    }
    private void sift_down(int k) {

        while (leftChild(k) < data.size()) { // 左孩子越界了
            int j = leftChild(k); // j 为左孩子索引
            if (j + 1 < data.size() &&  data.get(j +1).compareTo(data.get(j))> 0 ){
                // 如果有右孩子且右孩子的值大于左孩子，则把右孩子赋值给左孩子
                j = rightChild(k);
            }
//            k 代表父节点，父节点的值大于两个孩子，则下沉结束
            if (data.get(k).compareTo(data.get(j))>= 0){
                break;
            }
            swap(k,j);
            k = j;
        }
    }


}
