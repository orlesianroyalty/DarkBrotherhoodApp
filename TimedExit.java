package com.example.orles.darkbrotherhoodlockscreen;

/**
 * Created by orles on 8/7/2017.
 */

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimedExit {
  private Timer timer = new Timer();
   private TimerTask exitApp = new TimerTask() {
        public void run() {
            //System.exit(0);
            
        }
    };

    public void TimedExit() {
        timer.schedule(exitApp, new Date(System.currentTimeMillis()+5*1000));
    }

}
