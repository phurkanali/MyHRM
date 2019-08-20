package del;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Tom2 {
	
	public static void main(String [] args) throws Exception
	{
	//	SimpleDateFormat simpleDate = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
	//	System.out.println(simpleDate.format(new Date()));
		
	//	Dimension desktopSize=Toolkit.getDefaultToolkit().getScreenSize();
	//	BufferedImage image = new Robot().createScreenCapture(new Rectangle(desktopSize));
	//	ImageIO.write(image, "png", new File("D:/Selenium.png"));
		
		System.out.println(new Date());
		System.out.println("Captured Screenshot successfully");
		
		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		BufferedImage image = new Robot().createScreenCapture(new Rectangle(screensize));
		ImageIO.write(image, "png", new File("d:/selne.png"));
	}

}
