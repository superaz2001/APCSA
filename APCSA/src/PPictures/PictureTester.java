package PPictures;
/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture(System.getProperty("user.dir")+"\\src\\pictures\\pixlab\\images\\beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture(System.getProperty("user.dir")+"\\src\\pictures\\pixlab\\images\\caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture(System.getProperty("user.dir")+"\\src\\pictures\\pixlab\\images\\temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture(System.getProperty("user.dir")+"\\src\\pictures\\pixlab\\images\\640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  public static void testKeepOnlyBlue(){
	  Picture beach = new Picture(System.getProperty("user.dir")+"\\src\\pictures\\pixlab\\images\\beach.jpg");
	  beach.explore();
	  beach.keepOnlyBlue();
	  beach.explore();
  }
  
  public static void testFixUnderwater(){
	  Picture water = new Picture(System.getProperty("user.dir")+"\\src\\pictures\\pixlab\\images\\water.jpg");
	  water.explore();
	  water.fixUnderwater();
	  water.explore();
  }
  public static void testNegate(){
	  Picture beach = new Picture(System.getProperty("user.dir")+"\\src\\pictures\\pixlab\\images\\beach.jpg");
	  beach.explore();
	  beach.negate();
	  beach.explore();
  }
  public static void testGrayscale(){
	  Picture beach = new Picture(System.getProperty("user.dir")+"\\src\\pictures\\pixlab\\images\\beach.jpg");
	  beach.explore();
	  beach.grayScale();
	  beach.explore();
  }
  
  public static void testMirrorVerticalRightToLeft(){
	  Picture beach = new Picture(System.getProperty("user.dir")+"\\src\\pictures\\pixlab\\images\\beach.jpg");
	  beach.explore();
	  beach.mirrorVerticalRightToLeft();
	  beach.explore();
	  
  }
  
  public static void testMirrorHorizontal(){
	  Picture beach = new Picture(System.getProperty("user.dir")+"\\src\\pictures\\pixlab\\images\\beach.jpg");
	  beach.explore();
	  beach.mirrorHorizontal();
	  beach.explore();
  }
  
  public static void testMirrorHorizontalBotToTop(){
	  Picture beach = new Picture(System.getProperty("user.dir")+"\\src\\pictures\\pixlab\\images\\beach.jpg");
	  beach.explore();
	  beach.mirrorHorizontalBotToTop();
	  beach.explore();
  }
  
  public static void testMirrorDiagonal(){
	  Picture beach = new Picture(System.getProperty("user.dir")+"\\src\\pictures\\pixlab\\images\\beach.jpg");
	  beach.explore();
	  beach.mirrorDiagonal();
	  beach.explore();
  }
  
  public static void testMirrorArms(){
	  Picture snowman = new Picture(System.getProperty("user.dir")+"\\src\\pictures\\pixlab\\images\\snowman.jpg");
	  snowman.explore();
	  snowman.mirrorArms();
	  snowman.explore();
  }
  
  public static void testMirrorGull(){
	  Picture seagull = new Picture(System.getProperty("user.dir")+"\\src\\pictures\\pixlab\\images\\seagull.jpg");
	  seagull.explore();
	  seagull.mirrorGull();
	  seagull.explore();
  }
  
  public static void testMyCollage(){
	  Picture canvas = new Picture(System.getProperty("user.dir")+"\\src\\pictures\\pixlab\\images\\640x480.jpg");
	  canvas.myCollage();
	  canvas.explore();
  }
  
  public static void testBlur(){
	  Picture beach = new Picture(System.getProperty("user.dir")+"\\src\\pictures\\pixlab\\images\\barbaraS.jpg");
	  beach.explore();
	  beach.blur(0, 0, 100, 100);
	  beach.explore();
	  beach.blur(0, 0, 100, 100);
	  beach.explore();
	  beach.blur(0, 0, 100, 100);
	  beach.explore();
  }
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture(System.getProperty("user.dir")+"\\src\\pictures\\pixlab\\images\\swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
   // testMirrorTemple();
   // testMirrorArms();
    //testMirrorGull();
	  //testMirrorHorizontal();
	  //testMirrorVerticalRightToLeft();
	  //testMirrorHorizontalBotToTop();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
	 // testMyCollage();
	 // testEdgeDetection();
	  testBlur();
  }
}