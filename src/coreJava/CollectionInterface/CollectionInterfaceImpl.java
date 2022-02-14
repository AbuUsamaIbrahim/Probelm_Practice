package coreJava.CollectionInterface;

import java.util.*;

public class CollectionInterfaceImpl {
 public static void main(String[] args){
     List<String>stringList = new ArrayList<>();
     List<String>stringList1 = new LinkedList<>();
     Set<String> stringSet = new HashSet<>();
     Set<String> stringSet1 = new TreeSet<>();
     Set<String> stringSet2 = new LinkedHashSet<>();
     Map<Long,String>longStringMap = new HashMap<>();
     Map<Long,String>longStringMap1 = new TreeMap<>();
     Map<Long,String>longStringMap2 = new Hashtable<>();
     Map<Long,String>longStringMap3 = new LinkedHashMap<>();
 }
}
