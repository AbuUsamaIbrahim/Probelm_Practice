package coreJava.CollectionInterface;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class CollectionInterfaceImpl {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<Integer> intList = new ArrayList<>();
        List<String> stringList1 = new LinkedList<>();
        Set<String> stringSet = new HashSet<>();
        Set<String> stringSet1 = new TreeSet<>();
        Set<String> stringSet2 = new LinkedHashSet<>();
        Map<String, String> longStringMap = new HashMap<>();
        Map<Long, String> longStringMap1 = new TreeMap<>();
        Map<String, String> longStringMap2 = new Hashtable<>();
        Map<Long, String> longStringMap3 = new LinkedHashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            intList.add((int)(Math.random()*201+i));
        }
        intList.stream().sorted().forEach(r->System.out.println(r));

        longStringMap.put("dsd", null);
        longStringMap.put("Second", "Got 2");
        Set<Map.Entry<String, String>> set = longStringMap.entrySet();
        for (Map.Entry<String, String> i : set) {
            System.out.println(i.getKey() + i.getValue());
        }
    }
}
