PImage pepperoni;
PImage olive;
PImage mushroom;
void setup() {
   pepperoni = loadImage("pepperoni.png");
   olive = loadImage("olive.png");
   mushroom = loadImage("mushroom.png");
   olive.resize (30, 30);
   pepperoni.resize (42, 42);
   mushroom.resize (46, 46);
    size (500, 500);
    fill (#F0B33A);
    ellipse (250, 210, 300, 300);
    fill(#F54343);
    ellipse (250, 210, 260, 260);
    fill(#FAE41C);
    ellipse (250, 210, 240, 240);
}
void draw() {
   image(mushroom, 200, 100);
   image(pepperoni, 229, 170);
   image(olive, 180, 179);
   image(mushroom, 150, 200);
   if (mousePressed && (mouseButton == RIGHT)) {
     image(pepperoni, 280, 180);
     image(olive, 270, 100);
     image(mushroom, mouseX, mouseY);
   }
   if (mousePressed && (mouseButton == LEFT)) {
     image(pepperoni, mouseX, mouseY);
     image(pepperoni, 250, 110);
     image(olive, 230, 300);
   }
   if (mousePressed && (mouseButton == CENTER)) {
     image(olive, mouseX, mouseY);
     image(pepperoni, 140, 140);
    }
}
