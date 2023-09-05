package test;

import pages.login;
import pages.logout;

public class login_test 
{
    public static void valid()
    {
    	login.orange();
    	login.loginun("Admin");
    	login.loginpw("admin123");
    	login.submit();
    	
    	
    }
    
    public static void invalid()
    {
    	login.loginun("minad");
    	login.loginpw("admin123");
    	login.submit();
    }
    
    public static void validun_empty_pw()
    {
    	login.loginun("admin");
    	login.loginpw("");
    	login.submit();
    }
}
