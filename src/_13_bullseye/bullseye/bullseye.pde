void setup() {
  size(500, 500);
  int sizeC = 160;
  for(int i = 0; i < 8; i++){
    if(i % 2 == 0){
      fill(255, 0, 0);
    }else{
      fill(0);
    }
    ellipse(250, 250, sizeC, sizeC);
    sizeC = sizeC - 20;
  }
}

void draw() {
  
}
