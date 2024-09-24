package api;

import org.junit.Test;
import utilities.CAshwiseToken;
import utilities.Config;

public class PojoTest {

    @Test
    public void CreateCategory(){

        String url = Config.getProperty("cashwiseApiUrl") + "/api/myaccount/categories";
        String token = CAshwiseToken.getToken();


    }
}
