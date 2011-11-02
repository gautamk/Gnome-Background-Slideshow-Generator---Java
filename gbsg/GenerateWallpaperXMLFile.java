/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package gbsg;

import java.io.*;

/**
 *
 * @author gautam
 */
public class GenerateWallpaperXMLFile{
    public GenerateWallpaperXMLFile(ListDirectory ld , File wallpaper_xml_file )throws IOException{
        int duration = 60 ,  transition = 5;
        File [] wall_list = ld.getDirectoryListing();
        PrintWriter pw
            = new PrintWriter(
                    new BufferedWriter(
                        new FileWriter(wallpaper_xml_file , false) ) );
        pw.println("<background>");
        pw.println(" <starttime>\n"+
                    "  <year>2009</year>\n"+
                    "  <month>08</month>\n"+
                    "  <day>04</day>\n"+
                    "  <hour>00</hour>\n"+
                    "  <minute>00</minute>\n"+
                    "  <second>00</second>\n"+
                 " </starttime>"
                );
        for(int i = 0;i<wall_list.length;i++){

            pw.println(" <static>");
                pw.println("  <duration>"+ duration +".0</duration>");
                pw.println("  <file>"+ wall_list[i].getAbsolutePath() +"</file>");
            pw.println(" </static>");

            if( i == wall_list.length - 1 ){
                pw.println(" <transition>");
                    pw.println("  <duration>"+ transition +".0</duration>");
                    pw.println("  <from>"+ wall_list[i].getAbsolutePath() +"</from>");
                    pw.println("  <to>"+ wall_list[0].getAbsolutePath() +"</to>");
                pw.println(" </transition>");
                break;
            }
            pw.println(" <transition>");
                pw.println("  <duration>"+ transition +".0</duration>");
                pw.println("  <from>"+ wall_list[i].getAbsolutePath() +"</from>");
                pw.println("  <to>"+ wall_list[i + 1].getAbsolutePath() +"</to>");
            pw.println(" </transition>");
        }
        pw.println("</background>");
        pw.flush();
        pw.close();
    }
}

