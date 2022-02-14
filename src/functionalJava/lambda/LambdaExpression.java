package functionalJava.lambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LambdaExpression {
    public static void main(String[] args){
        List<Integer>integerList = new ArrayList<>();
        integerList.add(4);
        integerList.add(46);
        integerList.add(24);
        integerList.add(44);
        integerList.add(94);
        integerList.add(94);
        Collections.sort(integerList,(n1,n2)->n1.compareTo(n2));
        integers(integerList,"Sorting using Collection");
        integers(integerList.stream().distinct().collect(Collectors.toList()),"Duplicate removed");
        System.out.println(sum(integerList));
    }

    public static Integer sum(List<Integer>integerList){
        return integerList.stream().collect(Collectors.summingInt(Integer::intValue));
    }

    public static void integers(List<Integer>integerList,String operationType){
        System.out.println("----------------   "+operationType+"  -----------------------------");
        for (int i=0;i<integerList.size();i++){
           System.out.println(integerList.get(i));
       }
    }
}
