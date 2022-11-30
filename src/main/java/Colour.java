public class Colour {

    int red;
    int green;
    int blue;

    public Colour(float red, float green, float blue) {
        this.red = (int) (red * 255);
        this.green = (int) (green * 255);
        this.blue = (int) (blue * 255);
    }

    public Colour(String rgb) {
        this.red = Integer.parseInt(rgb.substring(0,8),2);
        this.green = Integer.parseInt(rgb.substring(8,16), 2);
        this.blue = Integer.parseInt(rgb.substring(16,24), 2);
    }

}