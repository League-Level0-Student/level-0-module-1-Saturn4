void setup() {
    size(500, 500);
}

void draw() {
    background(200, 200, 200);
    noStroke();
    fill(#FC3912);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(#12C110);
    rect(176, 103, 12, 32);
    if (mousePressed) {
      fill(#CECECE);
     ellipse(90, 200, 50, 50);
    }
 
}
