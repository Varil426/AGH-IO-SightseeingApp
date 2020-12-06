package com.accessingmysql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "UserPlaceVotes")
public class UserPlaceVotes {
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Users_ID", nullable = false)
    private Long UserID;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Places_ID", nullable = false)
    private Long PlaceID;

    public Long getId() {
        return UserID;
    }

    public void setId(Long UserID) {
        this.UserID = UserID;
    }

    public Long getPlaceID() {
        return PlaceID;
    }

    public void setUsername(Long PlaceID) {
        this.PlaceID = PlaceID;
    }


}