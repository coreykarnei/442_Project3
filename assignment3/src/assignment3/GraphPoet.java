/* EE422C Assignment #3 submission by
 * Corey Karnei
 * CLK2544
 */

package assignment3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GraphPoet {


    /**
     *
     * @param corpus text file from which to derive the poet's affinity graph
     * @throws IOException if the corpus file cannot be found or read
     */

    public GraphPoet(File corpus) throws IOException {
        File f = corpus;
        if(!(f.exists() && !f.isDirectory() && f.canRead())) {
            throw new IOException("corpus.txt not found or not readable");
        }
        String words[][] = this.getWords(corpus);
        for(int i =0; i < words.length; i++){
            for(int j =0; j < words[i].length; j++){
                System.out.println(words[i][j]);
            }
        }

        /* Read in the File and place into graph here */
    }

    public String[][] getWords(File inputFile){

    }
    /**
     * Generate a poem.
     *
     * @param input File from which to create the poem
     * @return poem (as described above)
     */
    public String poem(File input) throws IOException {
        File f = input;
        if(!(f.exists() && !f.isDirectory() && f.canRead())) {
            throw new IOException("input.txt not found or not readable");
        }

        /* Read in input and use graph to complete poem */
        String poem = "";
        return poem;
    }

}
