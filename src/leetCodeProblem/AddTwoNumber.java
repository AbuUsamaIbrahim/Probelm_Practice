package leetCodeProblem;

import org.w3c.dom.NodeList;

import java.util.LinkedList;

public class AddTwoNumber {
    public static LinkedList solution(LinkedList l1, LinkedList l2){
        LinkedList listNode = new LinkedList();
       int count = l1.size();
            if(l1.size()>l2.size()){
               count = l1.size();
            }
            if(l1.size()<l2.size()){
                count = l2.size();
            }
            while (count != 0){

            }


        return listNode;
    }

    public static void main(String [] args){
        LinkedList<Integer> l1 = new LinkedList();
        LinkedList<Integer> l2 = new LinkedList();
        for(int i=0;i<9;i++){
            l1.add(9);
            if(i<4){
                l2.add(9);
            }
        }
        LinkedList<Integer> listNode = new LinkedList();
        listNode = solution(l1,l2);
        System.out.println("");
    }
}
