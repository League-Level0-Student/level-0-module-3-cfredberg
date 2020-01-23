void setup(){
  size(500, 500);
  ring1(250, 5);
}

void ring1(int x, int dimension){
  noFill();
  ellipse(x, 250, dimension, dimension);
}
