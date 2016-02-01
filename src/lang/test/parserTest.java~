package lang.test;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import lang.parser.*;
import java.io.*;
import java.util.*;

public class parserTest{

	public static void main (String args[]){
		DParser parser;
		DLexer lexer;

		System.out.println("*****Test Program for DParser*****");
		PrintWriter err=new PrintWriter(System.out,true);

			try {
				if (args.length>=1){
					lexer = new DLexer(new ANTLRFileStream(args[0]));
					CommonTokenStream token = new CommonTokenStream(lexer);
					parser = new DParser(token);
					
					ParserRuleContext tree = parser.spec();
					ParseTreeWalker walker = new ParseTreeWalker();
					SpecListener listener = new SpecListener();
					walker.walk(listener,tree);
					ASTSpec spec = listener.getSpec();
					//ASTSpec spec = parser.spec().t_spec;
					int errors=parser.getNumberOfSyntaxErrors(); 
					if (errors>0){
						System.err.println("========================================");
						System.err.println(errors+" syntax error(s) occurred in specification: "+args[0]);
					}else{
						System.err.println("specification is fine.");
						System.out.println(spec.getName());
						System.out.println(spec.getStruct().getName());
					}
					
				}
			}
			catch (RuntimeException e){
				System.err.println("Runtime error!!!");
			}
			catch (IOException e){
				e.printStackTrace();
			}
	}


}
