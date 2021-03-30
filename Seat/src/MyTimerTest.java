import java.io.IOException;
import java.util.Scanner;

class MyTimerTest
{
      public static void main(String[] args)
      {
            // Ÿ�̸Ӱ� 1�� �Ŀ� ���ߵ��� �����Ѵ�.
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
                        Thread.sleep(1000);             // 1�ʵ��� ������ �����.
                  } catch(Exception e) {}
                  System.out.println(time);
                  decSecond();
            }
      }

      // �ð��� ���ҽ�Ű�� �Լ�
      void decHour() {
            if(time.getHour() > 0) {
                  time.setHour(time.getHour()-1);
                  time.setMinute(59);
                  time.setSecond(59);
            } else {
                  stop();            
            }

      }

      // ���� ���ҽ�Ű�� �Լ�
      void decMinute() {
            if(time.getMinute() > 0) {
                  time.setMinute(time.getMinute()-1);
                  time.setSecond(59);
            } else {
                  // ���� 0�̶� ���ҽ�ų�� ���ٸ� �ð��� ���ҽ�Ų��.
                  decHour();
            }
      }

      // �ʸ� ���ҽ�Ű�� �Լ�
      void decSecond() {
            if(time.getSecond() > 0) {
                  time.setSecond(time.getSecond()-1);
            } else {
                  // �ʰ� 0�̶� ���ҽ�ų�� ���ٸ� ���� ���ҽ�Ų��.
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
    	  		System.out.println("�����ð��� "+time);
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