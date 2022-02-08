package helpers;

import config.UserBrowserstackConfig;
import org.aeonbits.owner.ConfigFactory;

import static io.restassured.RestAssured.given;

public class Browserstack {
    public static String videoUrl(String sessionId) {

        UserBrowserstackConfig userMobileConfig = ConfigFactory.create(UserBrowserstackConfig.class);

        String user = userMobileConfig.user();
        String key = userMobileConfig.key();

        return given()
                .auth().basic(user, key)
                .when()
                .get("https://api-cloud.browserstack.com/app-automate/sessions/" + sessionId + ".json")
                .then()
                .statusCode(200)
                .log().body()
                .extract()
                .path("automation_session.video_url");
    }
}
