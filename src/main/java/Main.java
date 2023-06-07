import Playlist.Song;
import User.*;

public class Main {
    public static void main(String[] args) {
        Song s1 = new Song("Rockstar", "SferaEbbasta", 3.14);
        Song s2 = new Song("Hollywood", "SferaEbbasta", 3.40);

        User commonuser = new User("marcomaraglino", "marco", "maraglino", UserType.CommonUser);
        User systemuser = new User("cristinacarbone77", "cristina", "carbone", UserType.SystemUser);
        User creatoruser = new User("marcomaraglino", "marco", "maraglino", UserType.CreatorUser);

        commonuser.addPlaylist("SferaPlay", "TRAP");
        commonuser.getPlaylists().get(0).addSong(s1);
        commonuser.getPlaylists().get(0).addSong(s2);
        System.out.println(commonuser.getPlaylists().get(0).getSongs().toString());

        commonuser.getPlaylists().get(0).getSongs().remove();
        System.out.println(commonuser.getPlaylists().get(0).getSongs().toString());

        //-------------


        creatoruser.addPlaylist("massimoPlay", "DRILL");
        creatoruser.getPlaylists().get(0).addSong(s1);
        creatoruser.getPlaylists().get(0).addSong(s2);

        System.out.println(creatoruser.getPlaylists().get(0).getSongs().toString());

        creatoruser.getPlaylists().get(0).getSongs().remove();
        System.out.println(creatoruser.getPlaylists().get(0).getSongs().toString());
    }
}
