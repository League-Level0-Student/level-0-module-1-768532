int x = 400; 
int y = 600; 

void setup() {
    size(800, 800);
    
}

void draw() {
    background(0, 0, 40);
    fill(255,255,255);
    ellipse(30,30,100,100);
    ellipse(150,30,10,10);
    ellipse(225,50,10,10);
    ellipse(300,30,10,10);
    ellipse(315,45,10,10);
    ellipse(345,23,10,10);
    ellipse(387,75,10,10);
    ellipse(462,24,10,10);
    ellipse(567,43,10,10);
    ellipse(524,23,10,10);
    ellipse(456,14,10,10);
    ellipse(754,63,10,10);
    ellipse(357,26,10,10);
    ellipse(644,28,10,10);
    ellipse(598,85,10,10);
    fill(random(255), 0, 0);
    ellipse(x, y + 130, 90, 90);
    fill(248, 128, 0);
    ellipse(x, y + 115, 70, 70);
    fill(255, 153, 0);
    ellipse(x, y + 95, 35, 35);
    fill(100, 100, 100);
    triangle(x, y + 10, x + 50, y + 100, x - 50, y + 100);
    y = y - 5;
    if(y<=-180) {
      y = -180;
    }
}
