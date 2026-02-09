import java.util.LinkedList;
class Playlist
{
        private LinkedList list = new LinkedList();
        
        list.add("Blinding Lights");
        list.add("Levitating");
        list.add("Shape of You");
        list.add("Uptown Funk");
        list.add("Old Town Road");
        
        public void addSong(String title)
        {
          return title;
        }
        
        public String playNextSong()
        {
            list.remove();
        }
        
   }
}

public class Playlists
{
public static void main(String[] args)
   {
      Playlist playlist = new Playlist();
      
      System.out.println("title: " + Playlist.addSong + "Next Song: " + Playlist.playNextSong);
   }
}