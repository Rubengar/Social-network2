
/**
 * Write a description of class JoinGroupPost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JoinGroupPost extends Post
{
    // instance variables - replace the example below with your own
    private String group;
    /**
     * Constructor for objects of class JoinGroupPost
     */
    public JoinGroupPost(String author,String group)
    {
        super(author);
        this.group = group;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getGroupName()
    {
        // put your code here
        return group;
    }
}
