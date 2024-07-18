package DevToolsChrome;

import com.jayway.jsonpath.JsonPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.network.Network;
import org.openqa.selenium.devtools.v85.network.model.RequestId;
import org.openqa.selenium.devtools.v85.network.model.Response;
import org.testng.annotations.Test;

import java.util.Optional;
import java.util.concurrent.ExecutionException;

public class getNetworkTabData {

    @Test
    public void getNetWorkTabData(WebElement verifycationCode) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        DevTools devTools = driver.getDevTools();
        devTools.createSession();
        devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
        final String[] value = {null};

        devTools.addListener(Network.responseReceived(), responseConsumuer -> {
            Response response = responseConsumuer.getResponse();
            RequestId requestId = responseConsumuer.getRequestId();
            if (response.getUrl().contains("/authenticate")) {
                System.out.println(response.getStatus() + " " + response.getUrl());
                try {
                    String responseBody = devTools.send(Network.getResponseBody(requestId)).getBody();
                    String code = JsonPath.parse(responseBody).read("$.code");
                    verifycationCode.sendKeys(code);
                } catch (Exception e) {
                    System.out.println("Error..." + e);
                }
            }
        });
        Thread.sleep(1000);
    }

}
