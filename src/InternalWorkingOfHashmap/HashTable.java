package InternalWorkingOfHashmap;

import org.w3c.dom.Node;

public class HashTable {
    public static void main(String[] args) {
//        Hashtable is an array of node
        Node[] hashTable = new Node[7];
//        let 's take hash function as...h(key)=key%7;

//        Node {//these full nodes are stored in hashtables
//            K key
//            V value
//            int hash
//            node next
//        }
//        int keys[] = {24, 1612, 17, 18, 10, 9};
//        key = 24;
//        value=~
//        hash = 24 % 7 = 3;(index value for array)
//        next= 17(next node...next element);
//
//        key = 17;
//        value=~
//        hash = 17 % 7 = 3;(index)
//        next= null;
//
//        key = 16;
//        value=~
//        hash = 16 % 7 = 2;(index)....same hash value means
//        next= null;
//
//
//
//        key = 12;
//        value=~
//        hash = 12 % 7 = 5;(index)
//        next= null;
//

//        16-->9(2)/24---17---10(3)/18--->4/12--->5(in hashtable)

//GET FUNCTION*****************get(12)

//firstly we will calculate the hashcode of 12...returns index after traversing in hash table
//if chain length crosses the threshold on particular bucket then convert it into self balancing binary tree O(logn)

    }
}
