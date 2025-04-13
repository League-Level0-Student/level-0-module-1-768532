
void setup() {
PImage face = loadImage("face.jpeg");
size(300,300);
face.resize(300,300);
image(face,0,0);
}
void draw() {
fill(mouseX, mouseY);
ellipse(110,115,35,35);
ellipse(175,115,35,35);
fill(0,0,0);
ellipse(110,115,7,7);
ellipse(175,115,7,7);
}
