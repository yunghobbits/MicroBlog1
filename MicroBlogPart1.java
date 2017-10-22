import static java.lang.System.out;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
public class MicroBlogPart1
{
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[]args)
    {
        out.println("         Blogs Are Cool");
        out.println(" -----Welcome to MICROBLOG!!!----- ");              
        System.out.println("");          
         
        //Post start
        //public static void thePost(){  }        
        blogPost[] allThePosts = {          
            new blogPost("PZeldaSwag","This meme is killer. https://goo.gl/images/jScRjN"),
            new blogPost("RingSlayer","Almost.... https://youtu.be/nU2URFx1ktU "),
            new blogPost("PZeldaSwag","My name is Zelda... not Links'..."),
            new blogPost("RingSlayer","All hobbits share a love for things that grow...."),
            new blogPost("ReySayWhat","BB-8!! Where are you!"),
            new blogPost("ReySayWhat","Oh hey..It's me! Watch the trailer! https://youtu.be/Q0CbN8sfihY"),
            new blogPost("ReySayWhat","I'm one with the force, and the force is with me."),       
            new blogPost("RingSlayer","Find you a friend like, Sam."),               
        }; 
        userInfo[] allUserNames= {
            new userInfo("https://goo.gl/images/NznvJY\n","PZeldaSwag\n","Zelda Fitzgerald\n","PrincessZelda@gmail.com"),
            new userInfo("https://goo.gl/images/8wjFFX\n","ReySayWhat\n","Rey of Jakku\n","Rey@yahoo.com"),
            new userInfo("https://goo.gl/images/kVMiBm\n","RingSlayer\n","Frodo Baggins, son of Drogo Baggins\n","RingSlayer1386@gmail.com"),               
        };       
        for (int i = 0; i < allThePosts.length; i++) {
            System.out.println("\nBlog #"+(i+1) +" "+ allThePosts[i].getUserName()+"\n"+allThePosts[i].getUserPost());
            
            //System.out.println("");           
        }
        System.out.println(""); 
        //UserInfo Start   
        // public static void theInfo(){  }                
        for (int i = 0; i < allUserNames.length; i++) {
            System.out.println("User Information: "+allUserNames[i].getUserInfo()+"\n");           
            //System.out.println("");
          
        }
                
    }    
}
  