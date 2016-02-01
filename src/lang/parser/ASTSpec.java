package lang.parser;

import java.util.*;
public final class ASTSpec extends ASTNode{
	private ASTStruct struct;
	private List<ASTPlan> plans = new ArrayList<ASTPlan>();
	
	public ASTSpec(){}
	public ASTSpec(String n){super(n);}
	public void addPlan(ASTPlan plan){plans.add(plan);}
	public void setStruct(ASTStruct s){struct=s;}
	public ASTStruct getStruct(){return struct;}
		
}
