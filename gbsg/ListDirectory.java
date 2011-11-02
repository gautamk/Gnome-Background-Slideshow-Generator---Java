/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package gbsg;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

/**
 *
 * @author gautam
 */
public class ListDirectory{
    private File dir;
    private File [] file_list;
    public static final int
            /**
             * Use this as the mode for Listing only filenames in
             * getDirectoryListingAsStringArray() method of this class.
             */
            FILE_NAMES_ONLY = 1 ,
            /**
             * Use this as the mode for Listing absolute Path of files in
             * getDirectoryListingAsStringArray() method of this class.
             */
            ABSOLUTE_PATH_NAMES = 2 ,
            /**
             * Use this as the mode for Listing filenames using getPath()
             * method of File class in
             * getDirectoryListingAsStringArray() method of this class.
             */
            PATH_NAMES_ONLY = 3,
            /**
             * Use this as the mode for Listing only canonical filenames in
             * getDirectoryListingAsStringArray() method of this class.
             */
            CANONICAL_PATH_NAMES = 4;

    public ListDirectory(String path)throws NotDirectoryException {
        this.setDirectory(path);
        file_list = this.dir.listFiles();
    }
    private void setDirectory (String path) throws NotDirectoryException{
        dir = new File(path);

        if( ! dir.isDirectory() ){
            throw new NotDirectoryException(dir);
        }
    }
    public ListDirectory(String path , FileFilter filter) throws NotDirectoryException {
        this(path);
        file_list = dir.listFiles(filter);
    }

    private File getFile(){ return dir; }
    public File getDirectory(){
        /**
         * Returns a the directory which is to be listed.
         *
         */
        return this.getFile(); }

    private File [] getFileList() { return file_list; }
    public File [] getDirectoryListing() {
        /**
         * Returns a list of files in the selected directory.
         */
        return this.getFileList(); }
    public String [] getDirectoryListingAsStringArray(final int mode)throws UnsupportedOperationException, IOException{
        /**
         * The method returns a string array containing the list of files based
         * on the specified mode
         * The available modes of are
         * ABSOLUTE_PATH_NAMES
         * PATH_NAMES_ONLY
         * CANONICAL_PATH_NAMES
         * FILE_NAMES_ONLY
         * which are available as constants in this class.
         */
        String [] listing = new String[file_list.length];
        for(int i=0;i<file_list.length;i++){

            switch(mode){
                case ABSOLUTE_PATH_NAMES:listing[i] = file_list[i].getAbsolutePath();
                    break;
                case PATH_NAMES_ONLY:listing[i] = file_list[i].getPath();
                    break;
                case CANONICAL_PATH_NAMES:listing[i] = file_list[i].getCanonicalPath();
                    break;
                case FILE_NAMES_ONLY:listing[i] = file_list[i].getName();
                    break;
                default: throw new UnsupportedOperationException("The selected mode is not supported");

            }

        }
        return listing;
    }
}
