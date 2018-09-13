package berlinuhr;

public class Renderer {
    private static final String unlit = "___________"; // max of 11 "unlit"
    private static final String[] templates = new String[]{
        "Y",
        "RRRR",
        "RRRR",
        "YYRYYRYYRYY",
        "YYYY"
    };

    /**
     * Render a simple string representation of the lights.
     *
     * @param berlinTime - array indicating number of lights on each of the 5 rows
     * @return simple string representation of the lights
     */
    public static String renderAsText(int []berlinTime) {
        if (berlinTime.length != 5) {
            throw new IllegalArgumentException("Should be exactly 5 rows");
        }
        StringBuffer buffer = new StringBuffer();
        for (int n=0; n<5; n++) {
            buffer.append(chooseLights(berlinTime[n],templates[n]));
            buffer.append("\n");
        }
        return buffer.toString();
    }

    private static String chooseLights(int lit, String template) {
        if (lit < 0 || lit > template.length()) {
            throw new IllegalArgumentException("Too many lights for this row");
        }
        return template.substring(0,lit) + unlit.substring(0,template.length()-lit);
    }
}
