/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by yossim on 4/9/15.
 */
public class JenkinsFetcher extends TimerTask {
    private Timer timer;
    private Settings settings;

    /**
     *
     */
    public void Start(){
        timer = new Timer();
        timer.scheduleAtFixedRate(this,0,10000);
    }

    @Override
    public void run() {
        URL url = null;
        try {
            url = new URL("https://builds.apache.org/api/json?pretty=true");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        JSONObject obj = null;
        try {
            obj = (JSONObject) JSONValue.parse(new InputStreamReader(url.openStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(obj.toJSONString());

    }
}
