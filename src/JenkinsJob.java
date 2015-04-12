/**
 * Created by yossim on 4/9/15.
 */

public class JenkinsJob {

    public JenkinsJob(String name, String displayName, String latestBuild, String description, String url) {
        this.name = name;
        this.displayName = displayName;
        this.latestBuild = latestBuild;
        this.description = description;
        this.url = url;
    }

    @Override
    public String toString() {
        return "JenkinsJob{" +
                "name='" + name + '\'' +
                ", displayName='" + displayName + '\'' +
                ", latestBuild='" + latestBuild + '\'' +
                ", description='" + description + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
    public String getDisplayName() {
        return displayName;
    }

    public String getLatestBuild() {
        return latestBuild;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return url;
    }

    private String name;
    private String displayName;
    private String latestBuild;
    private String description;
    private String url;
}
