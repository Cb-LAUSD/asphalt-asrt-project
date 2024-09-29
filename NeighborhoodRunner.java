import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {
MuralPainter mp = new MuralPainter ();
    mp.paintBackground("skyblue", 16);
hillPainter hp = new hillPainter();
  hp.paintHill("SpringGreen", 16);
crossPainter cp = new crossPainter();
    cp.paintCross1("burlyWood", 8);
    cp.paintCross2("burlyWood");
    cp.paintCross3();
  }
}