package swen221.tetris.tetromino;

import swen221.tetris.logic.Color;

public class Z extends S{
  public Z(int x, int y, Color color) {
    super(x, y, color);/*TODO: complete this code*/
    
  }
  //TODO: add more methods if needed
  

  /**
   * @return How far is the ith cell from the Tetromino center.
   * */
  public int yOffset(int i) {
    if (i < 2) { return 1; }
    return 0;
  }
  
  
}
