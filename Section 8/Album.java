import java.util.*;

public class Album {

	private String name, artist;
	private ArrayList<Song> songs;
	
	public Album(String nameAlbum, String nameArtist) {
		this.name = nameAlbum;
		this.artist = nameArtist;
		songs = new ArrayList<Song>();
	}
	
	private Song findSong(String title) {
		for(int i = 0; i < this.songs.size(); i++) {
			if(this.songs.get(i).getTitle() == title) {
				return this.songs.get(i);
			}
		}
		return null;
	}
	
	public boolean addSong(String title, double duration) {
		if(this.findSong(title) == null) {
			this.songs.add(new Song(title, duration));
			return true;
		}
		return false;
	}
	
	public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
		if(trackNumber >0 && trackNumber <= this.songs.size()) {
			boolean found = false;
			for(int i = 0; i < playlist.size(); i++) {
				if(playlist.get(i).getTitle() == this.songs.get(trackNumber-1).getTitle()) {
					found = true;
					break;
				}
			}
			if(found == false) {
				playlist.add(this.songs.get(trackNumber-1));
				return true;				
			} else {
				return false;
			}
		}
		return false;
	}
	
	public boolean addToPlayList(String title, LinkedList<Song> playlist) {
		Song song = this.findSong(title);
		if(song != null) {
			boolean found = false;
			for(int i = 0; i < playlist.size(); i++) {
				if(playlist.get(i).getTitle() == song.getTitle()) {
					found = true;
					break;
				}
			}
			if(found == false) {
				playlist.add(song);
				return true;				
			} else {
				return false;
			}
		}
		return false;
	}
}
