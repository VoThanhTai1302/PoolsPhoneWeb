package DevToolsChrome;

import com.jayway.jsonpath.JsonPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.fetch.model.RequestId;
import org.openqa.selenium.devtools.v85.network.Network;
import org.openqa.selenium.devtools.v85.network.model.Response;

import java.util.Optional;
import java.util.concurrent.ExecutionException;

public class getNetworkTabData {

    public void getNetWorkTabData(WebElement verifycationCode) throws InterruptedException, ExecutionException {
        ChromeDriver driver = new ChromeDriver();
        DevTools devTools = driver.getDevTools();
        devTools.createSession();
        devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
        final String[] value = {null};

        final RequestId[][] requestId = {new RequestId[1]};
        devTools.addListener(Network.responseReceived(), responseConsumuer -> {
            Response response = responseConsumuer.getResponse();
            requestId[0][0] = responseConsumuer.getRequestId();
            if (response.getUrl().contains("/authenticate")) {
                System.out.println(response.getStatus() + " " + response.getUrl());
                try {
                    String responseBody = devTools.send(Network.getResponseBody(requestId[0][0])).getBody();
                    JsonPath jsonPath = new JsonPath(responseBody);
                    String code = jsonPath.get("code");
                    verifycationCode.sendKeys(code);
                } catch (Exception e) {
                    System.out.println("Error..." + e);
                }
            }
        });
        Thread.sleep(1000);
    }

}
