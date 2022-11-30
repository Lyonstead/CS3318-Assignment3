
public class Colour {

    String rgb;
    int red;
    int green;
    int blue;

    public Colour(float red, float green, float blue) {
        if (red > 1.0f && green > 1.0f && blue > 1.0f &&
            red < 0.0f && green < 0.0f && blue < 0.0f) {
            throw new IllegalArgumentException("Input variables are not within Bounds");
        }
        if (    !((Object)red).getClass().getSimpleName().equals("Float") &&
                !((Object)blue).getClass().getSimpleName().equals("Float") &&
                !((Object)green).getClass().getSimpleName().equals("Float")) {
            throw new IllegalArgumentException("Invalid input type");
        }
        this.red = (int) (red * 255);
        this.green = (int) (green * 255);
        this.blue = (int) (blue * 255);

    }

    public Colour(String rgb) {
        if (rgb.length() != 24) {
            throw new IllegalArgumentException("Argument must be a 24 bit address");
        }
        for (int i = 0; i < rgb.length(); i++) {
            if (!(rgb.substring(i, i+1).equals("1") || rgb.substring(i, i+1).equals("0"))) {
                throw new IllegalArgumentException("Argument must consist of 1s or 0s");
            }
            this.rgb = rgb;
            this.red = Integer.parseInt(rgb.substring(0, 8), 2);
            this.green = Integer.parseInt(rgb.substring(8, 16), 2);
            this.blue = Integer.parseInt(rgb.substring(16, 24), 2);
        }
    }

}