package lang.parser;

/* 
 * A general node for AST.
 */
public abstract class ASTNode{
	public String name;
	public ASTNode(){}
	public ASTNode(String s){name=s;}
	public String getName(){return name;}
	public void setName(String s){name=s;}
}
