import java.awt.Color;
/**
 * An image filter to make the image a bit darker.
 * 
 * @author Michael Kölling and David J. Barnes.
 * @version 1.0
 */
public class RedTintFilter extends Filter
{
    /**
     * Constructor for objects of class DarkerFilter.
     * @param name The name of the filter.
     */
    public RedTintFilter(String name)
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
                int red = pix.getRed();
                //if(red <= 127) {
                 //   red = 255 - red;
                //}
                image.setPixel(x, y, new Color(red,0,0));
            }
        }
    }
}