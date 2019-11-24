import java.awt.Color;
/**
 * An image filter to make the image with a Blue Filter.
 * 
 * @author Ben Adelson
 * @version 2019-11-24
 */
public class BlueFilter extends Filter
{
    /**
     * Constructor for objects of class BlueFilter.
     * @param name The name of the filter.
     */
    public BlueFilter(String name)
    {
        super(name);
    }

    /**
     * Apply this filter to an image.
     * 
     * @param  image  The image to be changed by this filter.
     */
    public void apply(OFImage image)
    {
        int height = image.getHeight();
        int width = image.getWidth();
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
               Color pix = image.getPixel(x, y);
                int blue = pix.getBlue();
                if(blue <= 127) {
                    blue = 255 - blue;
                }
                image.setPixel(x, y, new Color(0,0,blue));
            }
        }
    }
}