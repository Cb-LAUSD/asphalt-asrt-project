import org.code.neighborhood.*;
public class hillPainter extends MuralPainter{
  public void paintHill(String color, int size){
    turnRight();
    while(canMove()){
      move();
    }
    turnLeft();
    paintLine(color, size);
    turnLeft();
    move();
    turnLeft();
    paintLine(color, size);
    turnRight();
    move();
    turnRight();
    move();
    paintLine("SpringGreen", 3);
    move();
    move();
    paintLine("SpringGreen", 4);
    move();
    move();
    paintLine("SpringGreen", 3);
    turnLeft();
    move();
    turnLeft();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    paintLine("SpringGreen", 2);
      while(canMove()){
      move();
      }
    turnLeft();
          while(canMove()){
      move();
      }
  }
}