/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan. 
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna. 
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus. 
 * Vestibulum commodo. Ut rhoncus gravida arcu. 
 */

/**
 * Created by yossim on 4/9/15.
 */
public class JenkinsNodeConnectionInfo {

    public JenkinsNodeConnectionInfo(String url, String userName, String token) {
        this.url = url;
        this.userName = userName;
        this.token = token;
    }

    public String getUrl() {
        return url;
    }

    public String getUserName() {
        return userName;
    }

    public String getToken() {
        return token;
    }

    private String url;
    private String userName;
    private String token;
}
