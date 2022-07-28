package InternalWorkingOfHashmap;

public class InternalWorking {
    public static void main(String[] args) {
//        Hashing --> object ko kisi value(integer) mein convert kr deta hai-->basically hash code
//        Internal working of hashmap uses equals and hash code methods...which are defined in custom classes
//        so lets keep custom class aside and talk about primitive type
//        hash(i1)==hash(i2)--->collision
//        Hashing of strings
//        for act and cat they are both same ascii value
        int hash = 7;//hash in java starts from 0...just taking 7 aise hi
        String str = "CAT";//our own hash function
        String str2 = "ACT";
        System.out.println(str.hashCode());
        System.out.println(str2.hashCode());
        for (int i = 0; i < str.length(); i++) {//this function of multiplying with 31 gives a high probability that hash values will be different
            hash = hash * 31 + str.charAt(i);
        }
//        Hashing of custom classes....equals and hashcode..
//        Calculating index from hashcode....index = hashCode & (n-1)...where n is equal to number of buckets....or size of array
//        and number of buckets is 16...what is importance of finding index
//        key/value/hash/next are stored in buckets....for each key
//        if we override a different value with same key...then hash code remains same and only value changes
//PUT--------        they are stored in linked list...if 2 hashmap have same hashcode then collision occurs and they form a singly linked list on a single bucket
//GET-------- for using map.getKey();...we traverse linked list...and we check hashcode by hashcode....and return index
//DELETE-----        using delete ---we find hashcode....prev-->next = curr-->next

//        LOAD FACTOR AND REHASHING---->
//        when entries in hashmap...crosses the threshold values...the size of bucket gets doubled i.e 16-->32
//        If bucket size is 16 and load factor is 0.75...threshold value is 12
//        ThresholdValue = loadFactor*bucketSize..then rehashing is performed
//        on increasing load factor it creates size fastly so as to maintain balance java has said standard load factor as 0.75
//        hashcode function does not have a fixed TC...like for string it is length of string...and for integer we do mod
//        when no hashcode is same and all buckets have one value...O(1)
//        self balancing tree--O(logn)
//        singly linked list on buckets--->O(n)...worst
    }
}