package org.orangehrm.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.orangehrm.pages.LoginPage;
import org.orangehrm.testComponents.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.List;

public class orangehrmlogintest extends BaseTest
{


      @Test(dataProvider = "getData")
      public void LoginMultipleUsers(HashMap<String,String> input) throws  InterruptedException
      {
            loginPage.validLogin(input.get("email"), input.get("password"));
      }

      @DataProvider(name = "getData")
      public Object [] [] getData() throws IOException {
            List<HashMap<String,String>> data = getJsonDataToMap(System.getProperty("user.dir")+"//src//test//java//org//orangehrm//testdata//logintestData.json");
            return new Object[][]  {{data.get(0)}, {data.get(1)}};

      }


}
