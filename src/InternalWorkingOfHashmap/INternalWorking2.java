package InternalWorkingOfHashmap;

public class INternalWorking2 {
    public static void main(String[] args) {
//        Insert/Search/Delete-->All operations in O(1)
//        Elements are stored in random fashion
//        HASH---->calculated for storing key values
//        MAP--->Maps key and value
//        Hashing uses hash function takes input and generate same output for same input
//        for different input---same output can be generated--->collision
//        Hash functions1******* -->Map larger values to smaller values.example--->h(2192354)=7
//h("elephant")=3
//h({name="anuj"})=2
//        IN java hashcode method maps only in integer
//        hashing in general is converting big value to small value...
//        2********Should be O(1) or O(len) in case of string

//        EXAMPLE OF HASH FUNCTIONS:::::
//        for LARGER(int) keys h(key)=key%n;...n is a small number(integer)
        //for STRING keys ...weighted sum "cat"/"act"
//        h(key)=s[0]*x^0+s[1]*x^1+s[2]*x^2....where^ is power  not XOR and s[0] are the respective index ascii values of characters
//        FOR OBJECTS--->according to their properties..like if it is string use string...so these non primitive can be solved from primitive

    }

}
