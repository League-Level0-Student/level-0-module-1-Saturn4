
void setup() {
  PImage catface = loadImage ("catface.png");
  catface.resize (500, 500);
  size(500, 500);
  background (catface);
}
void draw() {
  fill (mouseX, mouseY, 100);
  ellipse (220, 300, 70, 90);
  ellipse (310, 290, 60, 83);
  
  
  fill (#242423);
 ellipse (220, 300, 40, 55);
 ellipse (310, 290, 35, 50);
 
}
