package util;

public final class EmptyResource<R> implements Resource{
	R resource;
	
	public EmptyResource(R res){resource = res;}
	public boolean isEmptyResource(){return true;}
}
