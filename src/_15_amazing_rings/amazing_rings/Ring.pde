class Ring{
  void run(int x){
    int size = 10;
    for(int i = 0; i < 30; i++){
      noFill();
      stroke(0, 0, 0);
      ellipse(x, 250, size, size);
      size = size + 10;
    }
  }
}
