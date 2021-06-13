package io.imane.cinemaapi.entity;

import org.springframework.data.rest.core.config.Projection;

import java.util.Collection;
import java.util.Date;

@Projection(name = "p1", types = io.imane.cinemaapi.entity.ProjectionMovie.class)
public interface ProjectionProj {

    Long getId();
    double getPrice();
    Date getDateProjection();
    Room getRoom();
    Movie getMovie();
    Session getSession();
    Collection<Ticket> getTickets();

}
