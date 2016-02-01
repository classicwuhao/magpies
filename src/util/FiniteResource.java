package util;
import java.util.*;
public class FiniteResource<R> implements Resource{
	private String resourceName;
	private int k=0;
	List<Element<R>> resources = new ArrayList<Element<R>>();
	
	public FiniteResource(String name){resourceName=name;}

	public void add (R r){
		resources.add(new Element(r,k++,resourceName));
	}
	public void clear(){resources.clear();k=0;}
	public R get(int i){
		return resources.get(i).getValue();

	}
	public Element get(R r){
		for (Element<R> e : resources)
			if (e.getValue() == r) return e;
			
		return null;
	}

	public int size(){return resources.size();}
	public boolean isEmptyResource(){return false;}
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for (Element<R> e : resources)
			sb.append(e.getValue()+",");
		int k = sb.lastIndexOf(",");
		if (k!=-1) sb.delete(k,k+1);
		sb.append("]");
		return sb.toString();
	}
}
