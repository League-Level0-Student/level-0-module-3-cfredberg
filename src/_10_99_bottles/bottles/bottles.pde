void setup(){
  for (int i = 99; i > -1; i--){
    if (i > 0){
      println(i + " bottles of beer on the wall, " + i + " bottles of beer.");
      println("Take one down and pass it around, " + (i - 1) + " bottles of beer on the wall.");
      println(" ");
    }else{
      println("No more bottles of beer on the wall, no more bottles of beer.");
      println("Go to the store and buy some more, 99 bottles of beer on the wall");
    }
  }
}
