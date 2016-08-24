import org.apache.http.HttpStatus;
import org.testng.annotations.BeforeClass;

import com.test.BaseTest;
import com.util.RestUtil;


public class GitHubTest extends BaseTest {
	
	RestUtil util;
	
	@BeforeClass
	public void beforeClass(){
		util = new RestUtil();
	}
	
	@Test
	public void testStatusCode(){
		assertEquals(HttpStatus.SC_OK)
	}
	

}
