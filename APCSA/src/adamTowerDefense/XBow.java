package adamTowerDefense;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
public class XBow extends DamagingBuilding{
	public XBow(int x, int y, int hp, int dmg, int range){
		super(x,y,hp,dmg, range);
		try{
			image = ImageIO.read(new File(System.getProperty("user.dir")+"\\src\\adamTowerDefense\\xbow.png"));
		}
		catch(Exception e){
			System.out.println("CANT LOAD XBOW.PNG");
		}
		
	}
	public void draw(Graphics window){
		window.drawImage(image, X-30, Y-30, 90, 90, null);
	}
}
