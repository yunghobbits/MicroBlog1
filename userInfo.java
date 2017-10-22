public class userInfo
{
    public String webPic;
    public String userName;
    private String realName;
    public String emailAdd;

    public userInfo(String webPic, String userName, String realName, String emailAdd)
    {
        this.webPic=webPic;
        this.userName=userName;
        this.realName=realName;
        this.emailAdd=emailAdd;
    }
    
    public String getUserInfo()
    { 
        return userName+realName+webPic+emailAdd ;
    }

}