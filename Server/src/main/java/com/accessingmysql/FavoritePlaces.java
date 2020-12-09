package com.accessingmysql;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;


@Entity
@Table(name = "FavouritePlaces")
public class FavoritePlaces {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(unique = true)
    private Long ID;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "UsersID", nullable = false)
    private Users user;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PlaceID", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Places place;

    public Long getID() {
        return ID;
    }

    public Users getUser() {
        return user;
    }

    public Places getPlace() {
        return place;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public void setPlace(Places place) {
        this.place = place;
    }
}