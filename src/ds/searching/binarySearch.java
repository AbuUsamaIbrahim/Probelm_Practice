package ds.searching;

 class BinarySearch {
    Node root;



    public static void main(String[] args) {
        BinarySearch bst = new BinarySearch();
        bst.add(5);
        bst.add(7);
        bst.add(1);
        bst.add(2);
        bst.add(9);
        System.out.println(bst);
    }
    class Node{
        int value;
        Node left;
        Node right;

         Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
    private Node addRecursive(Node current, int value){
        if(current == null){
            return new Node(value);
        }
        if (value < current.value){
            current.left = addRecursive(current.left,value);
        }else if(value > current.value){
            current.right = addRecursive(current.right,value);
        }else{
            return current ;
        }
        return current;
    }

    public void add(int value){
        root = addRecursive(root,value);
    }


}
