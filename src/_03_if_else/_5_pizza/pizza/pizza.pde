PImage pepperoni;
PImage mushroom;
void setup() {
    background(255, 255, 255, 0);
    size(400, 400);
    pepperoni = loadImage("pepperoni.png");
    pepperoni.resize(30,30);
    mushroom = loadImage("mushroom.png");
}
void draw() {
    fill(235, 235, 0, 500);
    ellipse (200, 200, 400, 400);
    fill(255, 0, 0, 500);
    ellipse (200, 200, 350, 350);
    fill(255, 255, 0, 500);
    ellipse (200, 200, 310, 310);
    image(pepperoni,200,200);

}
