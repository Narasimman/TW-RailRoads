package com.thoughtworks.railroad.main;import java.io.BufferedReader;import java.io.File;import java.io.FileReader;import java.io.IOException;import com.thoughtworks.railroad.exception.WrongInputException;import com.thoughtworks.railroad.view.Parser;/** * The main driver file that parses the input file and executes commands This * takes two inputs a graph file with the graph structure a command file with * the list of commands. *  * Sample graph format  * AB5, BC4, CD8, DC8, DE6, AD5, CE2, EB3, AE7 *  * Sample command format  * Distance: A-B-C  * Distance: A-D  * Distance: A - D - C * Distance: A - E - B - C - D  * Distance: A - E - D  * Paths: MAX_STOPS , 3 ,C - C * Paths: EXACT_STOPS , 4 , A-C  * Shortest: A-C  * Shortest: B - B  * PATHS: MAX_DISTANCE , 30 , C- C *  * @author Narasimman *  */public class Driver {  public static String execute(String graphFileName, String commandFileName) {    File graphFile = null;    File commandFile = null;    BufferedReader br = null;     try {      graphFile = new File(graphFileName);      Parser parser = new Parser(graphFile);      commandFile = new File(commandFileName);      br = new BufferedReader(new FileReader(commandFile));      StringBuffer sb = new StringBuffer();      while (br.ready()) {        String command = br.readLine().toUpperCase();        sb.append(parser.execute(command) + "\r\n");      }      br.close();      return sb.toString();    } catch (IOException e) {      throw new WrongInputException("Invalid Inbput File");    }  }  public static void main(String[] args) {    if (args.length < 2) {      throw new IllegalArgumentException(          "Invalid Input File. Usage: java Driver <Graph.txt> <Commands.txt>");    }    System.out.println(Driver.execute(args[0], args[1]));  }}