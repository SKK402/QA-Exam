import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShots {

    public static String captureScreenshot(WebDriver driver, String screenshotName) {
        String filePath = System.getProperty("user.dir") + "/screenshots/" + screenshotName + ".png";

        try {
            // Create screenshots directory if it doesn't exist
            File directory = new File(System.getProperty("user.dir") + "/screenshots/");
            if (!directory.exists()) {
                directory.mkdir();
            }

            File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileHandler.copy(source, new File(filePath));
            System.out.println("✅ Screenshot saved: " + filePath);

        } catch (IOException e) {
            System.out.println("❌ Exception while taking screenshot: " + e.getMessage());
        }

        return filePath;
    }
}
