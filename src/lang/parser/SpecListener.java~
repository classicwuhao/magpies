package lang.parser;

public final class SpecListener extends DBaseListener{
	private ASTSpec spec;
		
	public void enterSpec(DParser.SpecContext ctx) { 
			
	}

	public void exitSpec(DParser.SpecContext ctx){
		spec=new ASTSpec();
		spec.setName(ctx.getChild(2).getText());
		spec.setStruct(ctx.struct().t_struct);					
	}

	public void exitStruct(DParser.StructContext ctx){
		ASTStruct struct = new ASTStruct();
		struct.setName(ctx.getChild(2).getText());
		ctx.t_struct=struct;
	}
	
	public ASTSpec getSpec(){return spec;}

}
