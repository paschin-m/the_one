package org.example;

public class Node {
    public String nodeName;
    protected Integer nodeValue;
    public Node prewNode;
    public Node nextNode;

    public Node() {
        this.nodeValue=0;
        this.nodeName="Какой-то имя для узла выраловрадывра";
    }
    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node getPrewNode() {
        return prewNode;
    }

    public void setPrewNode(Node prewNode) {
        this.prewNode = prewNode;
    }
    public Integer getNodeValue() {
        return nodeValue;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public void setNodeValue(Integer nodeValue) {
        this.nodeValue = nodeValue;
    }
     public String toString(){
        return this.getNodeName();
     }
}
