package practice;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * Created by IICT on 4/2/2019.
 */

public class Practice {


//    public static String getSmallestAndLargest(String s, int k) {
//        String smallest = "";
//        String largest = "";
//        //List<String>result = new ArrayList<String>();
//        Map<Integer,String>mp = new HashMap<>();
//        int m=k;
//        String tmp = "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";
//        for(int i=0;i<(s.length()+1)-k;i++){
//
//                mp.put(i,s.substring(i,m++));
//
//        }
//        for(Integer sub : mp.keySet()){
//            String s1 = mp.get(sub);
//            if(s1.compareTo(largest)>0){
//                largest=s1;
//            }
//
//            if (s1.compareTo(tmp)<0){
//                smallest=s1;
//
//                tmp=smallest;
//
//                //largest=smallest;
//            }
//
//        }
//        //System.out.println(mp);
//        // Complete the function
//        // 'smallest' must be the lexicographically smallest substring of length 'k'
//        // 'largest' must be the lexicographically largest substring of length 'k'
//
//        return smallest + "\n" + largest;
//    }

//    static boolean isAnagram(String a, String b) {
//        String a1= a.toLowerCase();
//        String b1= b.toLowerCase();
//        char[] s1 = a1.toCharArray();
//        char[] s2= b1.toCharArray();
//        if(s1.length!=s2.length)
//            return false;
//        Arrays.sort(s1);
//        Arrays.sort(s2);
//        return Arrays.equals(s1,s2);
//
//        // Complete the function
//
//    }


    /*
     * Complete the simpleArraySum function below.
     */
    static void plusMinus(int[] arr) {
        int p = 0, n = 0, z = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                p++;
            }
            if (arr[i] < 0) {
                n++;
            }
            if (arr[i] == 0) {
                z++;
            }
        }
        System.out.println(p / arr.length);
        System.out.println(n / arr.length);
        System.out.println(z / arr.length);
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] a = new int[nums.length];
        int p = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            a[i] = p;
            p *= nums[i];
        }
        p = 1;
        for (int i = 0; i < nums.length; i++) {
            a[i] *= p;
            p *= nums[i];
        }
        return a;
    }

    public static int maxSubArray(int[] nums) {
        int current_value;
        int max_global = current_value = nums[0];

        for(int i= 0;i<=nums.length-1;i++){
            current_value = current_value + nums[i];
            if(current_value > max_global)
                max_global = current_value;
            if(current_value < 0 )
                current_value = 0;
        }
        return max_global;
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        if (prices.length == 1) {
            return 0;
        }

        if (prices.length == 2 && prices[1] > prices[0]) {
            return (prices[1] - prices[0]);
        }

        for (int j = 0; j <= prices.length - 2; j++) {

            for (int i = j + 1; i <= prices.length - 1; i++) {

                int subProfit = 0;
                if (prices[i] > prices[j]) {
                    subProfit = prices[i] - prices[j];
                }

                if (subProfit > maxProfit) {
                    maxProfit = subProfit;
                }

            }
        }

        return maxProfit;
    }
    public static boolean containsDuplicate(int[] nums) {

        Set<Integer>set = new HashSet<>();

        for(Integer num : nums){
            if(set.add(num) == false){
                return false;
            }
        }
        return true;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        long n = 1234567899;
        long rem = 0;
        long res = 0;
        long newNum = 0;
        while (n != 0) {
            rem = n % 10;
            n = n / 10;
            newNum = (newNum + rem) * 10;
            if (n < 10) {
                newNum = newNum + n;
                break;
            }

        }
        int a [] = {-2,1};
      System.out.println(newNum);
//        System.out.println(maxProfit(a));
//        System.out.println(containsDuplicate(a));
//        System.out.println(productExceptSelf(a));
        System.out.println(maxSubArray(a));
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        int[] arr = new int[n];
//
//        String[] arrItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            int arrItem = Integer.parseInt(arrItems[i]);
//            arr[i] = arrItem
//        }
//
//        plusMinus(arr);
//
//        scanner.close();


        //Iterator<Character> itr = st.iterator();

        /*-------------STACK PROBLEM >>HACKERRANK->>>JAVA STACK-------------------------------*/
//        while(in.hasNext()){
//            Stack<Character> st1 = new Stack<>();
//            Stack<Character> st2 = new Stack<>();
//            String s = in.next();
//            if(s.length()%2==0){
//                for(int i=0;i<s.length();i++){
//                    if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[') {
//                        st1.push(s.charAt(i));
//                    }else{
//                        if(s.charAt(i)=='(' && st1.peek()!=')'){
//                            st1.push(s.charAt(i));
//                            break;
//                        }
//                        if(s.charAt(i)=='{' && st1.peek()!='}'){
//                            st1.push(s.charAt(i));
//                            break;
//                        }
//                        if(s.charAt(i)=='[' && st1.peek()!=']'){
//                            st1.push(s.charAt(i));
//                            break;
//                        }
//                        if(st1.empty()==true){
//                            st1.push(s.charAt(i));
//                            break;
//                        }
//                        else{
//                            st1.pop();
//                        }
//
//                    }
//                }
//                if(st1.empty()==true)
//                {
//                    System.out.println("true");
//                }else {
//                    System.out.println("false");
//                }
//            }else{
//                System.out.println("false");
//            }
//        }
        /*------------------------------PROGRAM ENDS HERE--------------------------*/

//            Scanner in = new Scanner(System.in);
//            while(in.hasNext()){
//                String IP = in.next();
//                System.out.println(IP.matches(new MyRegex().pattern));
//            }


    }


//    public static void main(String []argh){
//        Scanner in = new Scanner(System.in);
//        int t=in.nextInt();
//        for(int i=0;i<t;i++){
//            int a = in.nextInt();
//            int b = in.nextInt();
//            int n = in.nextInt();
//            for(int j = 0;j<n;j++){
//                for(int k=0;k<=j;k++){
//                    a+=((Math.pow(2,k))*b);
//                    //System.out.printf("InnerLoop: %d \n",a);
//                }
//                System.out.printf("%d ",a);
//                a=0;
//            }
//            System.out.printf("\n");
//        }
//        in.close();
//    }

//    static class FastReader{
//        BufferedReader br;
//        StringTokenizer st;
//        public FastReader(){
//            br = new BufferedReader(new InputStreamReader(System.in));
//        }
//        String next(){
//            while (st == null || !st.hasMoreElements()){
//                try {
//                    st = new StringTokenizer(br.readLine());
//                }catch (IOException e){
//                    e.printStackTrace();
//                }
//            }
//            return st.nextToken();
//        }
//        int nextInt(){
//            return Integer.parseInt(next());
//        }
//        long nextLong(){
//            return Long.parseLong(next().trim());
//        }
//        double nextDouble(){
//            return Double.parseDouble(next());
//        }
//        String nextLine(){
//            String str = "";
//            try {
//                str = br.readLine();
//            }catch (IOException e){
//                e.printStackTrace();
//            }
//            return str;
//        }
//    }
//    public static void main(String args[]) throws Exception{
//        FastReader fr =new FastReader();
//        String s = fr.nextLine();
//        System.out.printf("%-3s/n"+s);
////        int count = 0;
////      List<Long> arr = new ArrayList<Long>();
////        while (true){
////            //int n = fr.nextInt();
////
////            arr.add(fr.nextLong());
////            if(arr.size()>2){
////                Collections.sort(arr);
////                if(arr.size()%2==1){
////                    int mid = arr.size()/2;
////                    System.out.println(arr.get(mid));
////                }else{
////                    System.out.println((arr.get((arr.size()/2)-1)+arr.get((arr.size()/2)))/2);
////                }
////            }else{
////                if (arr.size() == 2){
////                    System.out.println((arr.get(count-1)+arr.get(count))/2);
////                }else{
////                    System.out.println(arr.get(count));
////                }
////            }
////
////            count++;
//           // System.out.println("Count "+count);
//        }
////        StringTokenizer st = new StringTokenizer("This is practising java");
//////        if(st.nextToken().equals("This"))
//////            System.out.println("Great");
////        while(st.countTokens() > 0)
////            System.out.println("E: "+st.nextElement());
//
}
//
//private class MyRegex{
//
//}

