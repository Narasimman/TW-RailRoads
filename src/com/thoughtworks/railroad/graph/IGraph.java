package com.thoughtworks.railroad.graph;/** * This interface  * @author Narasimman * */public interface IGraph {  public boolean addVertex(Vertex v);  public boolean addEdge(Vertex from, Vertex to, int weight);  public String calculateDistance(Vertex from, Vertex[] nodes);}