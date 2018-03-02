import java.util.*;


public class TrackList {
    
    public HashMap<String, String> trackList = new HashMap<>();
        
    public void addSong(String track, String lyrics) {
        trackList.put(track, lyrics);
    }

    public String getSong(String track){
        System.out.println(track);
        return trackList.get(track);
    }
    public void printTrackList() {
        for(Map.Entry<String, String> entry:trackList.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key+": "+value);
        }
    }     
}
        