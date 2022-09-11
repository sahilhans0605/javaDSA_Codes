package priorityQueue;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class FindTheMedianInRunningStreamOfNumbers {
    PriorityQueue<Integer> minHeap, maxHeap;
    boolean even;
    public FindTheMedianInRunningStreamOfNumbers() {
        minHeap = new PriorityQueue<>();//right side
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());//leftSide
        even = true;
    }
//    To basically heap ka use krke sort kiya humne
    public void addNum(int num){
        if(even){//ab even elements hai filhaal....toh element addkrenge toh odd ho jaayenge...toh finally maxHeap mein aana chahiye elmement
            minHeap.offer(num);//minheap mein daalo aur vha se sabse chhota element nikaal ke maxHeap mein daalo...
            maxHeap.offer(minHeap.poll());
        }else{//odd elements hai toh ab add krne pe...even ho jaayenge...toh dono mei equal finally minheap mein jaana chahiye...
            maxHeap.offer(num);
            minHeap.offer(maxHeap.poll());
        }
    }

    public double findMedian(){
        if(even){
            return( minHeap.peek()+maxHeap.peek())/2.0;
        }else{
            return maxHeap.peek();
        }
    }


    public static void main(String[] args) {

    }
}
