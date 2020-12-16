
  /*** Go to the recipe to run the demonstration before starting this program ***/

void setup() {
  /* Set the size of your sketch to be a rectangle like in the recipe demonstration */
  size(800,400);
  noFill();
  /* Call the noFill() command so all the ellipses will be transparent */
}
int x2 = 700;
int x = 100;
int y = 200;
int speed = 1;
void draw() {
  background(#3669FC);
     for(int i=0; i<25; i++){
       ellipse(x, y, i*10, i*10);
       
       
     }
     x+=speed;
     for(int i=0; i<25; i++){
       ellipse(x2, y, i*10, i*10);
       
       
     }
     x2-=speed;
     
        /* Use a for loop to make the first set of rings that will start in the left half of the window
        (you can use the code from your Bullseye program).*/          
    
        
        /*Make this set of rings move across the sketch to the right 
        Hint: make two variables, one for x and another for the speed. 
        Then increase x by the amount in speed */
 
        
        /*When the rings reach the right side of the sketch, reverse the direction so they move
        Hint: speed = -speed */
        if(x>=width){
          speed = -speed;
        }
        if(x<=0){
          speed = -speed;
        }
        
        
        /*When the rings reach the left side of the sketch, reverse the direction again */
        
         
 //CHALLENGE - to finish the Amazing Rings 
 
        /*Add another for loop to draw the second set of rings that will start in the right half of the window */
        
        
        /*Make this set of rings move in the opposite direction to the other rings 
        These rings must also "bounce" off the sides of the window.*/
        
}
