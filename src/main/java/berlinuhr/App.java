package berlinuhr;

public class App {

    public static void main(String []args) {
        if (args[0] == null) {
            throw new IllegalArgumentException("No time supplied");
        }
        int[] berlinTime = Parser.fromDigital(args[0]);
        String rendering = Renderer.renderAsText(berlinTime);
        System.out.println(rendering);
    }
}
