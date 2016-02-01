package lang.parser;

import java.io.PrintWriter;
import org.antlr.runtime.Parser;

public class ParseErrorHandler {
    private int fErrorCount = 0;

    private String fFileName;
    private PrintWriter fErrWriter;
    
    /**
     * @param fileName The name of the parsed file - used for constructing
     * error strings.
     * @param errWriter Error messages are passed through to this 
     * writer.
     */
    public ParseErrorHandler(String fileName, PrintWriter errWriter)  {
        fFileName = fileName;
        fErrWriter = errWriter;
    }
    
    public String getFileName() {
        return fFileName;
    }
    
    public int errorCount() {
        return fErrorCount;
    }

    void incErrorCount() {
        fErrorCount++;
    }
    
    public void reportError(String error) {
        fErrWriter.println(fFileName + "error report:" + error);
        fErrWriter.flush();
        incErrorCount();
    }

}
