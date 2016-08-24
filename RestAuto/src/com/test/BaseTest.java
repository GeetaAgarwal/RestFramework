
public abstract class BaseTest {
     Configuration _config;
     
     @BeforeSuite
     public void beforeSuite(){
    	 _config = new Configuration();
     }
     
     @AfterSuite
     public void afterSuite(){
    	 _config = null;
     }
     
}
