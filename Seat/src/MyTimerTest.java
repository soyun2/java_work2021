import java.io.IOException;
import java.util.Scanner;

class MyTimerTest
{
      public static void main(String[] args)
      {
            // 타이머가 1분 후에 멈추도록 설정한다.
            MyTimer mt = new MyTimer(0, 0, 3);
            
            mt.start();
            pause();
            mt.stop();
      }
      
      public static void pause() {
    	    try {
    	      System.in.read();
    	    } catch (IOException e) { }
    	  }
}

class MyTimer {
      MyTime time;
      MyTimer(int hour, int min, int sec) {
            time = new MyTime(hour, min, sec);
      }
      String getTime() {
            return time.toString();
      }

      void start() {
            while(true) {
                  try {
                        Thread.sleep(1000);             // 1초동안 수행을 멈춘다.
                  } catch(Exception e) {}
                  System.out.println(time);
                  decSecond();
            }
      }

      // 시간을 감소시키는 함수
      void decHour() {
            if(time.getHour() > 0) {
                  time.setHour(time.getHour()-1);
                  time.setMinute(59);
                  time.setSecond(59);
            } else {
                  stop();            
            }

      }

      // 분을 감소시키는 함수
      void decMinute() {
            if(time.getMinute() > 0) {
                  time.setMinute(time.getMinute()-1);
                  time.setSecond(59);
            } else {
                  // 분이 0이라서 감소시킬수 없다면 시간을 감소시킨다.
                  decHour();
            }
      }

      // 초를 감소시키는 함수
      void decSecond() {
            if(time.getSecond() > 0) {
                  time.setSecond(time.getSecond()-1);
            } else {
                  // 초가 0이라서 감소시킬수 없다면 분을 감소시킨다.
                  decMinute();
            }
      }

      void reset() {
            // time = new MyTime();
            time.setHour(0);
            time.setMinute(0);
            time.setSecond(0);
      }

      void stop() {
    	  	if(time.getMinute()==0 && time.getHour()==0 && time.getSecond()==0) {
    	  		System.out.println("Time out");
    	  	}
    	  	else{
    	  		System.out.println("남은시간은 "+time);
    	  	}
    	  	System.exit(0);
      }
}


class MyTime {
      int hour=0;
      int minute=0;
      int second=0;

      MyTime() {
            this(0,0,0);
      }

      MyTime(int hour, int minute, int second) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
      }

      int getHour() { return hour; }
      int getMinute() { return minute; }
      int getSecond() { return second; }

      void setHour(int hour) {
            if(hour >= 0) {
                  this.hour = hour;
            }      
      }
      void setMinute(int minute) {
            if(minute >= 0 || minute < 60) {
                  this.minute = minute;
            }      
      }
      void setSecond(int second) {
            if(second >= 0 || second < 60) {
                  this.second = second;
            }            
      }

      public String toString() {
            String tmp = "";
            tmp += (hour < 10)? "0"+hour : ""+ hour;
            tmp += ":";
            tmp += (minute < 10)? "0"+minute : ""+ minute;
            tmp += ":";
            tmp += (second < 10)? "0"+second : ""+ second;

            return tmp;
      }
}