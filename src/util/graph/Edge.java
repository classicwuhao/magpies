package util.graph;
import util.*;

public abstract class Edge<A, B>{
	A a;
	B b;
	
	public Edge(A x, B y){a=x;b=y;}	
	public A getA(){ return a;}
	public B getB(){return b;}
	
	public String toString(){
		return "<"+a+","+b+">";
	}
}
