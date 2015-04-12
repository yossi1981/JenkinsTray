/**
 * Created by yossim on 4/9/15.
 */
public class JenkinsBuild {


    @Override
    public String toString() {
        return "JenkinsBuild{" +
                "building=" + building +
                ", fullDisplayName='" + fullDisplayName + '\'' +
                ", id='" + id + '\'' +
                ", number=" + number +
                ", result='" + result + '\'' +
                ", timestamp=" + timestamp +
                ", utl='" + utl + '\'' +
                '}';
    }

    public JenkinsBuild(boolean building, String fullDisplayName, String id, int number, String result, int timestamp, String utl) {
        this.building = building;
        this.fullDisplayName = fullDisplayName;
        this.id = id;
        this.number = number;
        this.result = result;
        this.timestamp = timestamp;
        this.utl = utl;
    }

    public boolean isBuilding() {
        return building;
    }

    public String getFullDisplayName() {
        return fullDisplayName;
    }

    public String getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public String getResult() {
        return result;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public String getUtl() {
        return utl;
    }

    private boolean building;
    private String fullDisplayName;
    private String id;
    private int number;
    private String result;
    private int timestamp;
    private String utl;
}
