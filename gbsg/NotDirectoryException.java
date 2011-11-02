/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package gbsg;
import java.io.File;
/**
 *
 * @author gautam
 */
public class NotDirectoryException extends Exception{
    private File dir;

    public NotDirectoryException(){
        super("The Given path is not a directory");
    }
    public NotDirectoryException(File dir){
        this();
        this.dir = dir;
    }
    public NotDirectoryException(String message , File dir){
        super(message);
        this.dir = dir;
    }

    public File getDirectory(){
        return dir;
    }
}
