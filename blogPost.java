public class blogPost
{
    //public static int nextPostNum=0;    
    public String postComment;
    public String postUserName;
    public blogPost(String postUserName, String postComment)
    {     
        this.postComment=postComment; 
        this.postUserName=postUserName;
    }   
        
    public String getUserPost()
    {             
        return postComment;       
    }
    
    public String getUserName()
    {             
        return postUserName;       
    }
    
    
}