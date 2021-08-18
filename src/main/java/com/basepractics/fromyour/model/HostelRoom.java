package com.basepractics.fromyour.model;
import javax.persistence.*;
import java.io.Serializable;

@Entity
public class HostelRoom implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column(nullable = false)
    private String numberRoom;
    private String status;
    private String numberSleepingPlace;
    private String eliteDush;
    private String airCondition;
    private String miniFreezBox;
    private String tv;
    private String gameBox;
    private String imageUrl;
    @Column(nullable = false, updatable = false)
    private String hostelroomCode;


    public HostelRoom() {}

    public HostelRoom(Long id, String status, String numberRoom, String numberSleepingPlace, String eliteDush, String airCondition, String miniFreezBox, String tv, String gameBox, String imageUrl, String hostelroomCode) {
        this.id = id;
        this.status = status;
        this.numberRoom = numberRoom;
        this.numberSleepingPlace = numberSleepingPlace;
        this.eliteDush = eliteDush;
        this.airCondition = airCondition;
        this.miniFreezBox = miniFreezBox;
        this.tv = tv;
        this.gameBox = gameBox;
        this.imageUrl = imageUrl;
        this.hostelroomCode = hostelroomCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNumberRoom() {
        return numberRoom;
    }

    public void setNumberRoom(String numberRoom) {
        this.numberRoom = numberRoom;
    }

    public String getNumberSleepingPlace() {
        return numberSleepingPlace;
    }

    public void setNumberSleepingPlace(String numberSleepingPlace) {
        this.numberSleepingPlace = numberSleepingPlace;
    }

    public String getEliteDush() {
        return eliteDush;
    }

    public void setEliteDush(String eliteDush) {
        this.eliteDush = eliteDush;
    }

    public String getAirCondition() {
        return airCondition;
    }

    public void setAirCondition(String airCondition) {
        this.airCondition = airCondition;
    }

    public String getMiniFreezBox() {
        return miniFreezBox;
    }

    public void setMiniFreezBox(String miniFreezBox) {
        this.miniFreezBox = miniFreezBox;
    }

    public String getTV() {
        return tv;
    }

    public void setTV(String tv) {
        this.tv = tv;
    }

    public String getGameBox() {
        return gameBox;
    }

    public void setGameBox(String gameBox) {
        this.gameBox = gameBox;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getHostelroomCode() {
        return hostelroomCode;
    }

    public void setHostelroomCode(String hostelroomCode) {
        this.hostelroomCode = hostelroomCode;
    }

    @Override
    public String toString() {
        return "HostelRoom{" + '\'' +
                ", id='" + id + '\'' +
                ", statusRoom='" + status + '\'' +
                ", numberRoom='" + numberRoom + '\'' +
                ", numberSleepingPlace='" + numberSleepingPlace + '\'' +
                ", dush='" + eliteDush + '\'' +
                ", airCondition='" + airCondition + '\'' +
                ", miniFreezBox='" + miniFreezBox + '\'' +
                ", TV='" + tv + '\'' +
                ", GameBox='" + gameBox + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", hostelroomCode='" + hostelroomCode + '\'' +
                '}';
    }
}
