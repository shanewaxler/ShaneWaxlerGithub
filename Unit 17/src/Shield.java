import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;

public class Shield {
	private Ship ship;
	private BufferedImage image;
	public Shield(Ship ship){
		try{
			image = ImageIO.read(new File("C:\\Users\\waxlers3186\\Desktop\\ShaneWaxlerGithub\\Unit 17\\831972eb66dc49315ecbe05147c49488.gif"));
		}
		catch(Exception e){
			e.printStackTrace();
		}
		this.ship = ship;
	}
	public boolean hasShield(){
		if (){
			return true;
		}
		else{
			return false;
		}
	}
	public void deleteShield(){
		image = null;
	}
}
