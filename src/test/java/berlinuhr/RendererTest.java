package berlinuhr;

import org.junit.Test;

import static org.junit.Assert.*;

public class RendererTest {

    @Test
    public void renderAsText() {
        String expectedNoLights = "_\n" +
                "____\n" +
                "____\n" +
                "___________\n" +
                "____\n";
        assertEquals("No lights", expectedNoLights, Renderer.renderAsText(new int[]{0, 0, 0, 0, 0}));

        String expectedAllLights = "Y\n" +
                "RRRR\n" +
                "RRRR\n" +
                "YYRYYRYYRYY\n" +
                "YYYY\n";
        assertEquals("All lights", expectedAllLights, Renderer.renderAsText(new int[]{1, 4, 4, 11, 4}));
    }
}