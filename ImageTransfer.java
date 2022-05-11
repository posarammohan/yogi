import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

class ImageTransfer{

	// Reading the Image from file
	public static Image readImageFile(String fileName) {

		// Defining the Image Object
		Image image = null;
		
		if(fileName != null && !"".equals(fileName)) {
			
			// Source Image from File Location
			File imageFile = new File(fileName);
			
			try {
				// Reading the image from file using ImageIO
				image = ImageIO.read(imageFile);
				
			} catch (IOException e) {
				
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			
		} else {
			
			System.out.println("Please provide the valid path or file name");
		}
		
		return image;
	}
	
	// Displaying the image to window
	public static void displayImage(Image image) {
		
		// Creating the window to display the image
		JFrame window = new JFrame();
		
		if(image != null) {
			window.setTitle("Scan Qr Code");
			window.setSize(700, 500);
			window.setVisible(true);
			
			// Creating the image icon on JLabel
			JLabel label = new JLabel(new ImageIcon(image));
			window.add(label);
		}
	}
	
	public static void main(String[] args) {
		
      
	   
		// You can change the image path accordingly
		final String imagePath = "C:\\Users\\RAM MOHAN\\Desktop\\YOGESH\\yogesh1.jpg";
		
		Image image = readImageFile(imagePath);
		
		displayImage(image);
		
	   
		
	}
	
}
Files.readString(Paths.get(q))