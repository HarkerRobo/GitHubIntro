import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 
 */

public class CommitToMeFirst
{
    /*
     * Add something to this method. Print out hello world or your name or 
     * make the program do anything else interesting (though please don't give
     * those who run it viruses or wreck their computers).
     */
    public static void main(String[] args){
        System.out.println("Hi, I'm Joel");
        hi();
    }
    
    public static void hi(){
        //No knowledge of this is required, just an example of what you can do
        JFrame frame = new JFrame("To say hello with");
        frame.setSize(100, 50);
        frame.add(new JLabel("  Hi all of you! "));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
