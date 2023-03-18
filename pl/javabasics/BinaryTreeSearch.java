package pl.javabasics;

public class BinaryTreeSearch {

    private Node rootNode;

    public BinaryTreeSearch(int rootValue) {
        this.rootNode = new Node(rootValue);
    }

    public Node getRootNode() {

        return this.rootNode;
    }

    public void listAllNodes() {

        this.rootNode.printSubNodes(0);
    }
    
    public boolean isInTree(int value) {
        
        return this.isInNode(this.rootNode, value);
    }

    private boolean isInNode(Node node, int value) {

        if (node == null) return false;

        if (node.getMainValue() == value) return true;

        if (node.getMainValue() > value) {
                
                isInNode(node.getHigherValue(), value);
        } else {

            isInNode(node.getLowerValue(), value);
        }
        
        return false;
    }

    private boolean doesNodeExist(Node node) {

        return node != null;
    }

    public void add(int value) {

        this.rootNode = addToTree(this.rootNode, value);
    }

    public Node addToTree(Node node, int nodeValue) {

        if (node == null) {
            return new Node(nodeValue);
        }

        if (node.getMainValue() > nodeValue) {

            node.setLowerValue(addToTree(node.getLowerValue(), nodeValue));

        } else {

            node.setHigherValue(addToTree(node.getHigherValue(), nodeValue));

        }

        return node;
    }

    public static void main(String[] args) {

        int[] array = new int[]{0, 43, 22, 54, 100, 3, 10, 25, 75, 5};

        BinaryTreeSearch binaryTreeSearch = new BinaryTreeSearch(54);

        for (int i = 0; i < args.length; i++) {

            if (!binaryTreeSearch.isInTree(array[i]))
                binaryTreeSearch.addToTree(binaryTreeSearch.rootNode, array[i]);

        }

        binaryTreeSearch.listAllNodes();

    }
}
