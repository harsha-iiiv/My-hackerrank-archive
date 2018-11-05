import java.util.*;
public class turtle{
    public void turtle(){
        this.dir='N';
        this.x=0;
        this.y=0;
    }

    public void turtle(int x,int y,char dir){
        this.x=x;
        this.y=y;
        this.dir=dir;
    }

    public void turnLeft(){
        if(this.dir=='N'){
            this.dir='W';
        }
        else if(this.dir=='W'){
            this.dir='S';
        }
        else if(this.dir=='E'){
            this.dir='N';
        }
        else {
            this.dir='E';
        }
    }

    public void turnRight(){
        if(this.dir=='N'){
            this.dir='E';
        }
        else if(this.dir=='W'){
            this.dir='N';
        }
        else if(this.dir=='E'){
            this.dir='S';
        }
        else {
            this.dir='W';
        }
    }

    public void advance(int t){
        if(this.dir=='N'){
            this.y=this.y+t;
        }
        else if(this.dir=='W'){
            this.x=this.x-t;
        }
        else if(this.dir=='E'){
            this.x=this.x+t;
        }
        else {
            this.y=this.y-t;
        }
    }

    public void jamClear(){
        if(this.x>1000||this.x<-1000||this.y>1000||this.y<-1000){
            this.x=new Random().nextInt(1000);
            this.y=new Random().nextInt(1000);

        }
    }

    private char dir;
    private int x;
    private int y;
}