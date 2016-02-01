package test;
import util.*;
import util.graph.*;

public class test{

	public static void main (String args[]){
		FiniteResource<String> m1 = new FiniteResource<String>("Modules");
		FiniteResource<String> m2 = new FiniteResource<String>("Demo");
		
		m1.add("m1");m1.add("m2");
		m2.add("p1");m2.add("p2");
		
		IntEdge<Element, Element> edge = new IntEdge<Element, Element>(m1.get("m1"),m2.get("p2"));
		
		
		System.out.println(edge);
		System.out.println(m1);
		System.out.println(m2);
	}

}
