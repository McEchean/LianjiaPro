package com.echean.pojo;

import java.util.Date;

public class Lianjia extends LianjiaKey {
    private String starturl;

    private String community;

    private String room;

    private String area;

    private String heading;

    private String addrs;

    private String floor;

    private String buildYearInfo;

    private String rent;

    private String visitorNum;

    private String transportation;

    private String rentType;

    private String payType;

    private String hourseStatus;

    private Date updateDate;

    public String getStarturl() {
        return starturl;
    }

    public void setStarturl(String starturl) {
        this.starturl = starturl == null ? null : starturl.trim();
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community == null ? null : community.trim();
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room == null ? null : room.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading == null ? null : heading.trim();
    }

    public String getAddrs() {
        return addrs;
    }

    public void setAddrs(String addrs) {
        this.addrs = addrs == null ? null : addrs.trim();
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor == null ? null : floor.trim();
    }

    public String getBuildYearInfo() {
        return buildYearInfo;
    }

    public void setBuildYearInfo(String buildYearInfo) {
        this.buildYearInfo = buildYearInfo == null ? null : buildYearInfo.trim();
    }

    public String getRent() {
        return rent;
    }

    public void setRent(String rent) {
        this.rent = rent == null ? null : rent.trim();
    }

    public String getVisitorNum() {
        return visitorNum;
    }

    public void setVisitorNum(String visitorNum) {
        this.visitorNum = visitorNum == null ? null : visitorNum.trim();
    }

    public String getTransportation() {
        return transportation;
    }

    public void setTransportation(String transportation) {
        this.transportation = transportation == null ? null : transportation.trim();
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType == null ? null : rentType.trim();
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public String getHourseStatus() {
        return hourseStatus;
    }

    public void setHourseStatus(String hourseStatus) {
        this.hourseStatus = hourseStatus == null ? null : hourseStatus.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}