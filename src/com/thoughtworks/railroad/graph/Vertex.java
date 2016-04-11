package com.thoughtworks.railroad.graph;public class Vertex {  private final String name;  public Vertex(String name) {    this.name = name;  }  String getName() {     return name;  }  /*    * @see java.lang.Object#hashCode()   */  @Override  public int hashCode() {    final int prime = 31;    int result = 1;    result = prime * result + ((name == null) ? 0 : name.hashCode());    return result;  }  /*    * @see java.lang.Object#equals(java.lang.Object)   */  @Override  public boolean equals(Object obj) {    if (this == obj) {      return true;    }    if (obj == null) {      return false;    }    if (!(obj instanceof Vertex)) {      return false;    }    Vertex other = (Vertex) obj;    if (name == null) {      if (other.name != null) {        return false;      }    } else if (!name.equals(other.name)) {      return false;    }    return true;  }  @Override  public String toString() {    return "Vertex [name=" + name + "]";  }}