import java.awt.Color;
/**
 * An image filter to make the image with a warholFilter.
 * creates 4 quarter sized images from the original image
 * design by instructor would be :
 * Original image at quartersize         Red Channel image
 * 
 * Green Channel image                   Blue channel image  
 * 
 * @author Ben Adelson
 * @version 2019-11-24
 */
public class WarHolFilter extends Filter
{
    private OFImage original;
    // contains the width and height for the smaller images from the original full size
    private int width;
    private int height;
    
    /**
     * Constructor for objects of class WarHolFilter.
     * @param name The name of the filter.
     */
    public WarHolFilter(String name)
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
        original = new OFImage(image);
        width = original.getWidth()/2;
        height = original.getHeight()/2;

        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
               image.setPixel(x,y,original.getPixel(x*2,y*2));
               // basically copies original at a quarter size, 
               // without it, only had one image cutting the top 1/4 side
               Color pix = image.getPixel(x, y);
               int red = pix.getRed();
               int blue = pix.getBlue();
               int green = pix.getGreen();
               
               //creates the 3 quarter sized images with different colors
               image.setPixel(x+width, y, new Color(red,0,0));
               image.setPixel(x+width, y+height, new Color(0,0,blue));
               image.setPixel(x, y+height, new Color(0,green,0));

            }
        }
    }
}