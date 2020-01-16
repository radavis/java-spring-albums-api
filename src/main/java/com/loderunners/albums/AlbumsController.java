package com.loderunners.albums;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/albums")
public class AlbumsController {
  @Autowired private AlbumRepository albumRepository;

  @PostMapping
  public @ResponseBody String addNewAlbum(
      @RequestParam String artist, @RequestParam String title, @RequestParam Integer year) {

    Album album = new Album();
    album.setArtist(artist);
    album.setTitle(title);
    album.setYear(year);
    albumRepository.save(album);

    return "" + album + " created.";
  }

  @GetMapping
  public @ResponseBody Iterable<Album> getAllAlbums() {
    return albumRepository.findAll();
  }
}
