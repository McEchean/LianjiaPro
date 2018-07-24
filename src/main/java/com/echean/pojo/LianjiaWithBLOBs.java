package com.echean.pojo;

public class LianjiaWithBLOBs extends Lianjia {
    private String roomFacilities;

    private String around;

    private String images;

    public String getRoomFacilities() {
        return roomFacilities;
    }

    public void setRoomFacilities(String roomFacilities) {
        this.roomFacilities = roomFacilities == null ? null : roomFacilities.trim();
    }

    public String getAround() {
        return around;
    }

    public void setAround(String around) {
        this.around = around == null ? null : around.trim();
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images == null ? null : images.trim();
    }
}