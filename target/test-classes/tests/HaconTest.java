package tests;

import java.io.IOException;
import org.testng.annotations.Test;
import testBase.AccessibilityBase;
import testBase.FrameworkBase;

public class HaconTest extends FrameworkBase {

    AccessibilityBase a11y;

    public HaconTest() {
    }

    @Test
    public void testHacon() throws IOException {
        webDriver().get("https://www.hacon.de");
        AccessibilityBase var10000 = this.a11y;
        AccessibilityBase.checkAccessibilityViolations();
    }
}
