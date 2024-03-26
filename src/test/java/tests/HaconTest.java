package tests;

import org.testng.annotations.Test;
import testBase.AccessibilityBase;
import testBase.FrameworkBase;

import java.io.IOException;

public class HaconTest extends FrameworkBase
{
    AccessibilityBase a11y;

    @Test
    public void testHacon() throws IOException {
        webDriver().get("https://www.hacon.de");
        a11y.checkAccessibilityViolations();
    }
}
