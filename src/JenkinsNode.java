/**
 * Created by yossim on 4/9/15.
 */
public class JenkinsNode {
    public JenkinsNode(String url, String nodeName, String nodeDescription, JenkinsJobMetaData jobsMetaData) {
        this.url = url;
        this.nodeName = nodeName;
        this.nodeDescription = nodeDescription;
        this.jobsMetaData = jobsMetaData;
    }

    public String getUrl() {
        return url;
    }

    public String getNodeName() {
        return nodeName;
    }

    public String getNodeDescription() {
        return nodeDescription;
    }

    public JenkinsJobMetaData getJobsMetaData() {
        return jobsMetaData;
    }

    private String url;
    private String nodeName;
    private String nodeDescription;
    private JenkinsJobMetaData jobsMetaData;
}
