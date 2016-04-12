package com.thoughtworks.railroad.model;import java.util.ArrayList;import java.util.Collections;import java.util.List;/** * Represents the path in a grapg *  * @author Narasimman *  */public class Path implements Comparable<Path> {  private List<Edge> edgeList = new ArrayList<Edge>();  private int weight = 0;  private Path() {  }  private Path(Path other) {    edgeList.addAll(other.getEdgeList());    this.weight = other.getDistance();  }  public static Path emptyPath() {    return new Path();  }  public static Path copyPath(Path other) {    return new Path(other);  }  public void addEdge(Edge edge) {    edgeList.add(edge);    weight += edge.getDistance();  }  public void removeLastEdge() {    if (!edgeList.isEmpty()) {      Edge lastEdge = edgeList.get(edgeList.size() - 1);      this.weight -= lastEdge.getDistance();      edgeList.remove(edgeList.size() - 1);    }  }  public int getDistance() {    return weight;  }  public int getNumOfNodes() {    return edgeList.size();  }  public Vertex getLastNode() {    Vertex node = null;    if (!edgeList.isEmpty())      node = edgeList.get(edgeList.size() - 1).getDestination();    return node;  }  public List<Edge> getEdgeList() {    return Collections.unmodifiableList(edgeList);  }  @Override  public int compareTo(Path other) {    return this.getDistance() - other.getDistance();  }  @Override  public String toString() {    StringBuilder sb = new StringBuilder();    sb.append("Path [edgeList=\n");    for (Edge e : edgeList)      sb.append(e.toString() + " ");    sb.append(",\nWeight=" + weight + "]\n");    return sb.toString();  }}