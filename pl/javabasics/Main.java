package pl.javabasics;
import objects.AccessTest;

import java.lang.instrument.Instrumentation;

public class Main {

    public static void main(String[] args) {

        AccessTest accessTest = new pl.javabasics.AccessTest();

        int[] array = new int[]{0, 43, 22, 54, 100, 3, 10, 25, 75, 5};

        BinaryTreeSearch binaryTreeSearch = new BinaryTreeSearch(54);

        for (int j : array) {

            if (!binaryTreeSearch.isInTree(j))
                binaryTreeSearch.addToTree(binaryTreeSearch.getRootNode(), j);

        }

        System.out.println(Node.nodeCounter);
        binaryTreeSearch.listAllNodes();

    }
}
