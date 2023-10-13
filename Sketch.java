import java.util.Random;

import processing.core.PApplet;

public class Sketch extends PApplet {

   Random myRandom = new Random();
int intRandom = myRandom.nextInt(350); 

public void settings() {
	// size
    size(350,350);
  // if statment window size
    if((intRandom < 400) && (intRandom > 150)){
      size(500,500);}

    else{
      size(800,800);}
  }

  public void setup() {
    background(0, 255, 0);
  }

  
  public void draw() {
//if statments background color
if
(intRandom>200){
background(180,0,20);
fill(50);} 

else{
background(20,255,25);
fill(60);}       


//start drawing face
//green
fill(0, 255, 0);

//draw the head
ellipse(intRandom, intRandom, 150, 150);

//white
fill(255);

//draw the eyes
ellipse(intRandom + 20, intRandom, 30, 20);
ellipse(intRandom - 20, intRandom, 30, 20);

//black
fill(0);

//draw the pupils
ellipse(intRandom + 20, intRandom, 10, 10);
ellipse(intRandom - 20, intRandom, 10, 10);

//color of the mouth
if((intRandom < 400) || (intRandom > 150)){
      fill(0, 0, 0);}

    else{
      fill(255, 180, 0);}

//draw the mouth
ellipse(intRandom, intRandom + 40, 80, 40);


//current time
int d = day();    // Values from 1 - 31
int m = month();  // Values from 1 - 12
int y = year();   // 2003, 2004, 2005, etc.

//current time on screen
fill(0,0,0);
String s = String.valueOf(d);
text(s, 10, 28);
s = String.valueOf(m);
text(s, 10, 56); 
s = String.valueOf(y);
text(s, 10, 84);
  }
}

 
 