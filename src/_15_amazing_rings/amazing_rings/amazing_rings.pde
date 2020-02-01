Ring Ring1;
Ring Ring2;

void setup(){
  Ring1 = new Ring();
  Ring2 = new Ring();
  size(1000, 500);
}

int x1 = 250;
int x2 = 750;
Boolean fob = true;
Boolean fob1 = false;
void draw(){
  background(255);
  Ring1.run(x1);
  Ring2.run(x2);
  if (x1 == 1000){
    fob = false;
  }else if (x1 == 0){
    fob = true;
  }
  if (fob == true){
    x1++;
  }else if (fob == false){
    x1--;
  }
  
  if (x2 == 0){
    fob1 = true;
  }else if (x2 == 1000){
    fob1 = false;
  }
  if (fob1 == true){
    x2++;
  }else if (fob1 == false){
    x2--;
  }
}
