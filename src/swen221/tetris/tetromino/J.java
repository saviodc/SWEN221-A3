package swen221.tetris.tetromino;

import swen221.tetris.logic.Color;

public class J extends Tetromino{
int rot = 1;//This has 4 possible rotation states so using int 

  public J(int x, int y, Color color) {
    super(x, y, color);/*TODO: complete this code*/
  }

  @Override
  public int x(int i) {/*TODO: complete this code*/
	  
	  return switch(rot) {
	  	case 1 -> centerX() + xOffset(i);
	  	case 2 -> centerX() + yOffset(i);
	  	case 3 -> centerX() - xOffset(i);
	  	case 0 -> centerX() - yOffset(i);
	default -> throw new IllegalArgumentException("Unexpected value: " + i);
	  };
  }

  @Override
  public int y(int i) {/*TODO: complete this code*/
	 int mult = 1;
    if(rot >1)mult = -1;

    if(rot %2 == 1) {
    	return centerY() + yOffset(i)*mult;
    }else {
    	return centerY() + xOffset(i)*mult;
    }
  }

  @Override
  public void rotateRight() {/*TODO: complete this code*/
	  int thisRot = rot;
	  rot = (thisRot+1) % 4;
  }
  
  //TODO: add more methods if needed
  /**
   * @return How far is the ith cell from the Tetromino center.
   * */
  public int yOffset(int i) {
	if(i==3)return -1;
	return 0;
   
  }
  
  /**
   * @return How far is the ith cell from the Tetromino center.
   * */
  public int xOffset(int i) {
    if (i == 3) { return 1; }
    return i-1;
  }
  
  
}