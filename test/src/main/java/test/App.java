package test;


public class App 
{
    public boolean login(String user, String pass){
        if ("user".equals(user) && "pass".equals(pass)){
            return true;
        } else {
            return false;
        }
    }
}
