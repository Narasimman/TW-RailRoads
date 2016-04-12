package com.thoughtworks.railroad.model.condition;import com.thoughtworks.railroad.model.Path;/** * Condition that keeps track of the maximum distance allowed in the current * considered path in the graph *  * @author Narasimman *  */public class MaxDistanceCondition implements Condition {  private final int max;  public MaxDistanceCondition(int m) {    max = m;  }  @Override  public boolean pass(Path path) {    if (path == null) {      return false;    }    return path.getDistance() < max;  }}