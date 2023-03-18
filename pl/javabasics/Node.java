package pl.javabasics;

public class Node {

    public static int nodeCounter = 0;
    private Node lowerValue;
    private Node higherValue;
    private final int mainValue;

    public Node(int mainValue) {
        this.mainValue = mainValue;
        nodeCounter++;
    }

    public int getMainValue() {
        return mainValue;
    }

    public Node getLowerValue() {
        return lowerValue;
    }

    public void setLowerValue(Node lowerValue) {
        this.lowerValue = lowerValue;
    }

    public Node getHigherValue() {
        return higherValue;
    }

    public void setHigherValue(Node higherValue) {
        this.higherValue = higherValue;
    }

    public void printSubNodes(int tabsNum) {

        String tabs = "";

        for (int i = 0; i < tabsNum; i++) {

            tabs = tabs + "\t";
        }

        System.out.println(this.getLowerValue());
        System.out.println(this.getHigherValue());

        if (this.getHigherValue() != null) this.getHigherValue().printSubNodes(tabsNum+1);
        if (this.getLowerValue() != null) this.getLowerValue().printSubNodes(tabsNum);
    }

    @Override
    public String toString() {

        String lowerValue = (this.lowerValue != null) ? String.valueOf(this.lowerValue.mainValue) : "";

        String higherValue = (this.higherValue != null) ? String.valueOf(this.higherValue.mainValue) : "";

        return "Node{" +
                "lowerValue=" + lowerValue +
                ", higherValue=" + higherValue +
                ", mainValue=" + mainValue +
                " count=" + nodeCounter + "}";
    }
}
