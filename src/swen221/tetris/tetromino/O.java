package swen221.tetris.tetromino;

import swen221.tetris.logic.Color;

public class O extends Tetromino{
  public O(int x, int y, Color color) {
    super(x, y, color);/*TODO: complete this code*/
    
  }

  @Override
  public int x(int i) {/*TODO: complete this code*/
  //HINT you may want to use some paper and
  //make diagrams like those for all the tetrominos
   /* x y
    0 0 0
    1 1 0
    2 0 1
    3 1 1*/  
	  return centerX() + (i % 2); 
    
  }

  @Override
  public int y(int i) {/*TODO: complete this code*/
	 return centerY() + i /2;
  }

  @Override
  public void rotateRight() {/*TODO: complete this code*/
    
  }
  

}
