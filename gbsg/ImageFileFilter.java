/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package gbsg;

import java.io.File;
import java.io.FileFilter;

/**
 *
 * @author gautam
 */
public class ImageFileFilter implements FileFilter{
    @Override
    public boolean accept(File pathname){
        if(pathname.isDirectory()) { return false; }

        String name = pathname.getName().toLowerCase();

        if(
            name.endsWith(".jpg")    ||
            name.endsWith(".jpeg")   ||
            name.endsWith(".png")    ||
            name.endsWith(".gif")
        ){ return true; }
        return false;
    }
}
