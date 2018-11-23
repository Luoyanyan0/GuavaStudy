package guavademo1;

import com.google.common.base.Optional;

/**
 * @Auther: yanyan.luo
 * @Date: 2018/11/22 11:48
 * @Description:
 */
public class OptionalTester {
    public static void main(String args[]){
        OptionalTester guavaTester = new OptionalTester();
        Integer value1 =  null;
        Integer value2 =  new Integer(10);
        //Optional.fromNullable - if null ,return absent
        Optional<Integer> a = Optional.fromNullable(value1);
        System.out.println("====:"+a);
        //Optional.of - throws NullPointerException if passed parameter is null
        Optional<Integer> b = Optional.of(value2);
        System.out.println(guavaTester.sum(a,b));
    }

    public Integer sum(Optional<Integer> a, Optional<Integer> b){
        //Optional.isPresent - checks the value is present or not
        System.out.println("First parameter is present: " + a.isPresent());
        System.out.println("Second parameter is present: " + b.isPresent());
        //Optional.or - returns the value if present otherwise returns
        Integer value1 = a.or(new Integer(0));
        //Optional.get - gets the value, value should be present
        Integer value2 = b.get();
        return value1 + value2;
    }
}
