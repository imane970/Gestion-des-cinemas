package io.imane.cinemaapi.dao;

import java.util.List;
import io.imane.cinemaapi.entity.Cinema;
import io.imane.cinemaapi.entity.City;

import io.imane.cinemaapi.entity.Cinema;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface CinemaRepository extends JpaRepository<Cinema, Long> {

    List<Cinema> findByCityId(Long id);

    long deleteCinemaByIdAndCityId(Long id, Long cityId);

//    Cinema findCinemaByIdAndCityId(Long id, Long cityId);


}
