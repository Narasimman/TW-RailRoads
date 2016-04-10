package com.thoughtworks.railroad.graph;public class Edge {  private final Vertex from;  private final Vertex to;  private final int distance;  public Edge() {    from = null;    to = null;    distance = 0;  }  public Edge(Vertex from, Vertex to, int d) {    this.from = from;    this.to = to;    distance = d;  }    public Vertex getSource() {    return from;  }    public Vertex getDestination() {    return to;  }  public int getDistance() {    return distance;  }  public String toString() {    return to.getName() + ": " + distance;  }  @Override  public int hashCode() {    final int prime = 31;    int result = 1;    result = prime * result + ((from == null) ? 0 : from.hashCode());    result = prime * result + ((to == null) ? 0 : to.hashCode());    return result;  }  @Override  public boolean equals(Object obj) {    if (this == obj) {      return true;    }    if (obj == null) {      return false;    }    if (!(obj instanceof Edge)) {      return false;    }    Edge other = (Edge) obj;    if (from == null) {      if (other.from != null) {        return false;      }    } else if (!from.equals(other.from)) {      return false;    }    if (to == null) {      if (other.to != null) {        return false;      }    } else if (!to.equals(other.to)) {      return false;    }    return true;  }}