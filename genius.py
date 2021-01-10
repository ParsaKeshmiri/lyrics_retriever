## api taken from https://github.com/johnwmillr/LyricsGenius

## the following is written by me
import lyricsgenius
genius = lyricsgenius.Genius("cJcMSaSMdTgEWsy-alL5dR_kdO_KRZxGWg-gIq4BTf5lWMDCGzWViDRQFLCav66V")
artist = genius.search_artist("The Weeknd", max_songs = 0)
song = artist.song("Kiss Land")
print(song.lyrics)
artist.save_lyrics()