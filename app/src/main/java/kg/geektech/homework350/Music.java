package kg.geektech.homework350;

public class Music {
    private String songNumber;
    private String songName;
    private String singerName;
    private String timestamp;

    public Music(String songNumber, String songName, String singerName, String timestamp) {
        this.songNumber = songNumber;
        this.songName = songName;
        this.singerName = singerName;
        this.timestamp = timestamp;
    }

    public String getSongNumber() {
        return songNumber;
    }

    public void setSongNumber(String songNumber) {
        this.songNumber = songNumber;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
