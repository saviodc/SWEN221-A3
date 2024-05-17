package swen221.tetris.tetromino;

import swen221.tetris.logic.Color;

public class L extends J{
  public L(int x, int y, Color color) {
    super(x, y, color);/*TODO: complete this code*/
   
  }
  
//TODO: add more methods if needed
  /**
   * @return How far is the ith cell from the Tetromino center.
   * */
  public int xOffset(int i) {
	if(i ==3)return -1;
	return i-1;
  }
  
  
}
