import java.util.*;

public class Album {

	public static class SongList {
		private ArrayList<Song> songs;
		
		private SongList() {
			songs = new ArrayList<Song>();
		}
		
		private Song findSong(String title) {
			for(Song song : this.songs) {
				if(song.getTitle() == title) {
					return song;
				}
			}
			return null;
		}
		
		private Song findSong(int trackNumber) {
			if(trackNumber > 0 && trackNumber <= this.songs.size()) {
				return this.songs.get(trackNumber);
			}
			return null;
		}
		
		private boolean add(Song song) {
			if(this.findSong(song.getTitle()) == null) {
				this.songs.add(song);
				return true;
			}
			return false;
		}
	}
	
	private String name, artist;
	private SongList songs;
	
	public Album(String nameAlbum, String nameArtist) {
		this.name = nameAlbum;
		this.artist = nameArtist;
		songs = new SongList();
	}
		
	public boolean addSong(String title, double duration) {
		if(this.songs.findSong(title) == null) {
			this.songs.add(new Song(title, duration));
			return true;
		}
		return false;
	}
	
	public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
		if(this.songs.findSong(trackNumber-1) != null) {
			boolean found = false;
			for(int i = 0; i < playlist.size(); i++) {
				if(playlist.get(i).getTitle() == this.songs.findSong(trackNumber-1).getTitle()) {
					found = true;
					break;
				}
			}
			if(found == false) {
				playlist.add(this.songs.findSong(trackNumber-1));
				return true;				
			} else {
				return false;
			}
		}
		return false;
	}
	
	public boolean addToPlayList(String title, LinkedList<Song> playlist) {
		Song song = this.songs.findSong(title);
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
