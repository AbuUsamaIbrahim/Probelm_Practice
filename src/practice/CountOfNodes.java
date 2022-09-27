package practice;

import java.io.*;
import java.util.*;

public class CountOfNodes {

    /**
     The following is the data structure to represent a node of the tree
     */

    static class TreeNode {
        int value;
        List<TreeNode> childNodes = new ArrayList();
    }


    /**
     You just need to implement the following getSmallerNodeCount(TreeNode* rootNode) API,
     as explained in the problem description.
     */

    static int getSmallerNodeCount(TreeNode rootNode) {
        // this API should return the count of nodes whose value is less than the value in its parent node

        return 0;
    }



    /**
     The following code is for processing input and calling getSmallerNodeCount() API properly.
     Hence you need not worry about the following code,
     and you can just focus on implementing the getSmallerNodeCount() API correctly.
     */

    static Map<Integer, TreeNode> treeNodeMap = new HashMap();

    public static void main(String[] args) throws NumberFormatException, IOException {
        int testcaseCount, nodeCount, childCount, nodeValue, childNode;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        testcaseCount = Integer.parseInt(br.readLine());

        while (testcaseCount > 0) {
            nodeCount = Integer.parseInt(br.readLine());

            for (int i = 1; i <= nodeCount; i++) {
                if (treeNodeMap.get(i) == null) {
                    TreeNode treeNode = new TreeNode();
                    treeNodeMap.put(i, treeNode);
                }

                treeNodeMap.get(i).childNodes.clear();
            }

            for (int i = 1; i <= nodeCount; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");

                nodeValue = Integer.parseInt(st.nextToken());
                childCount = Integer.parseInt(st.nextToken());

                TreeNode treeNode = treeNodeMap.get(i);

                treeNode.value = nodeValue;
                treeNode.childNodes.clear();

                while (childCount > 0) {
                    childNode = Integer.parseInt(st.nextToken());
                    treeNode.childNodes.add(treeNodeMap.get(childNode));
                    childCount--;
                }
            }

            System.out.println(getSmallerNodeCount(treeNodeMap.get(1)));

            testcaseCount--;
        }
    }
}