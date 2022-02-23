package com.devsuperior.movieflix.controllers;

import com.devsuperior.movieflix.dto.MovieDTO;
import com.devsuperior.movieflix.dto.ReviewDTO;
import com.devsuperior.movieflix.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {

    @Autowired
    private MovieService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<MovieDTO> findById(@PathVariable Long id) {
        MovieDTO dto = service.findById(id);
        return ResponseEntity.ok().body(dto);
    }

    @GetMapping
    public ResponseEntity<Page<MovieDTO>> findByGenre(
            @RequestParam(name = "genreId", defaultValue = "0") Long genreId,
            Pageable pageable
    ){
        Page<MovieDTO> page = service.findByGenre(genreId, pageable);
        return ResponseEntity.ok().body(page);
    }

    @GetMapping("/{movieId}/reviews")
    public ResponseEntity<Page<ReviewDTO>> findMovieReviews(
            @PathVariable Long movieId,
            Pageable pageable
    ){
        Page<ReviewDTO> page = service.findMovieReviews(movieId, pageable);
        return ResponseEntity.ok().body(page);
    }
}
