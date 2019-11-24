Project "imageviewer-final" (version 3.1)
Authors: David Barnes and Michael Kölling

This project is part of the material for the book

   Objects First with Java - A Practical Introduction using BlueJ
   Sixth edition
   David J. Barnes and Michael Kölling
   Pearson Education, 2016

It is discussed in chapter 13.

This project demonstrates the building of a simple GUI (including labels, 
buttons, layout managers, event handling, menus, dialogs) as well as a bit of 
image processing.

This project is started by creating an object of class ImageViewer. This will 
automatically display the application's GUI - no further interaction with the 
object on the object bench is necessary.

WARNING: 

It sometimes happens (unfortunately) that the image viewer window opens BEHIND the
BlueJ window. This can be confusing, since it initially appears as if nothing 
is happening.



You need to implement the following:
Create 8 new filters:
First, convert the color image in to a gray scale image that shows how much red or green or blue is in each pixel of the image. These are the same thing as the channels in photoshop
red channel filter
green channel filter
blue channel filter


Next, actually give the image the tints of red or blue or green
red tint filter
green tint filter
blue tint filter


Finally, create a warhol filter 
Original image at quarter size			Red channel image
Green channel image				Blue channel image


and flipped warhol filter
Original image at quarter size			Red channel image mirrorred horizontally
Green channel image mirrored vertically		Blue channel image mirrored horizontally and vertically