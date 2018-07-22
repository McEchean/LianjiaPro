package com.echean.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LianjiaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LianjiaExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andStarturlIsNull() {
            addCriterion("starturl is null");
            return (Criteria) this;
        }

        public Criteria andStarturlIsNotNull() {
            addCriterion("starturl is not null");
            return (Criteria) this;
        }

        public Criteria andStarturlEqualTo(String value) {
            addCriterion("starturl =", value, "starturl");
            return (Criteria) this;
        }

        public Criteria andStarturlNotEqualTo(String value) {
            addCriterion("starturl <>", value, "starturl");
            return (Criteria) this;
        }

        public Criteria andStarturlGreaterThan(String value) {
            addCriterion("starturl >", value, "starturl");
            return (Criteria) this;
        }

        public Criteria andStarturlGreaterThanOrEqualTo(String value) {
            addCriterion("starturl >=", value, "starturl");
            return (Criteria) this;
        }

        public Criteria andStarturlLessThan(String value) {
            addCriterion("starturl <", value, "starturl");
            return (Criteria) this;
        }

        public Criteria andStarturlLessThanOrEqualTo(String value) {
            addCriterion("starturl <=", value, "starturl");
            return (Criteria) this;
        }

        public Criteria andStarturlLike(String value) {
            addCriterion("starturl like", value, "starturl");
            return (Criteria) this;
        }

        public Criteria andStarturlNotLike(String value) {
            addCriterion("starturl not like", value, "starturl");
            return (Criteria) this;
        }

        public Criteria andStarturlIn(List<String> values) {
            addCriterion("starturl in", values, "starturl");
            return (Criteria) this;
        }

        public Criteria andStarturlNotIn(List<String> values) {
            addCriterion("starturl not in", values, "starturl");
            return (Criteria) this;
        }

        public Criteria andStarturlBetween(String value1, String value2) {
            addCriterion("starturl between", value1, value2, "starturl");
            return (Criteria) this;
        }

        public Criteria andStarturlNotBetween(String value1, String value2) {
            addCriterion("starturl not between", value1, value2, "starturl");
            return (Criteria) this;
        }

        public Criteria andCommunityIsNull() {
            addCriterion("community is null");
            return (Criteria) this;
        }

        public Criteria andCommunityIsNotNull() {
            addCriterion("community is not null");
            return (Criteria) this;
        }

        public Criteria andCommunityEqualTo(String value) {
            addCriterion("community =", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityNotEqualTo(String value) {
            addCriterion("community <>", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityGreaterThan(String value) {
            addCriterion("community >", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityGreaterThanOrEqualTo(String value) {
            addCriterion("community >=", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityLessThan(String value) {
            addCriterion("community <", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityLessThanOrEqualTo(String value) {
            addCriterion("community <=", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityLike(String value) {
            addCriterion("community like", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityNotLike(String value) {
            addCriterion("community not like", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityIn(List<String> values) {
            addCriterion("community in", values, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityNotIn(List<String> values) {
            addCriterion("community not in", values, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityBetween(String value1, String value2) {
            addCriterion("community between", value1, value2, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityNotBetween(String value1, String value2) {
            addCriterion("community not between", value1, value2, "community");
            return (Criteria) this;
        }

        public Criteria andRoomIsNull() {
            addCriterion("room is null");
            return (Criteria) this;
        }

        public Criteria andRoomIsNotNull() {
            addCriterion("room is not null");
            return (Criteria) this;
        }

        public Criteria andRoomEqualTo(String value) {
            addCriterion("room =", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotEqualTo(String value) {
            addCriterion("room <>", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomGreaterThan(String value) {
            addCriterion("room >", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomGreaterThanOrEqualTo(String value) {
            addCriterion("room >=", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomLessThan(String value) {
            addCriterion("room <", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomLessThanOrEqualTo(String value) {
            addCriterion("room <=", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomLike(String value) {
            addCriterion("room like", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotLike(String value) {
            addCriterion("room not like", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomIn(List<String> values) {
            addCriterion("room in", values, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotIn(List<String> values) {
            addCriterion("room not in", values, "room");
            return (Criteria) this;
        }

        public Criteria andRoomBetween(String value1, String value2) {
            addCriterion("room between", value1, value2, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotBetween(String value1, String value2) {
            addCriterion("room not between", value1, value2, "room");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andHeadingIsNull() {
            addCriterion("heading is null");
            return (Criteria) this;
        }

        public Criteria andHeadingIsNotNull() {
            addCriterion("heading is not null");
            return (Criteria) this;
        }

        public Criteria andHeadingEqualTo(String value) {
            addCriterion("heading =", value, "heading");
            return (Criteria) this;
        }

        public Criteria andHeadingNotEqualTo(String value) {
            addCriterion("heading <>", value, "heading");
            return (Criteria) this;
        }

        public Criteria andHeadingGreaterThan(String value) {
            addCriterion("heading >", value, "heading");
            return (Criteria) this;
        }

        public Criteria andHeadingGreaterThanOrEqualTo(String value) {
            addCriterion("heading >=", value, "heading");
            return (Criteria) this;
        }

        public Criteria andHeadingLessThan(String value) {
            addCriterion("heading <", value, "heading");
            return (Criteria) this;
        }

        public Criteria andHeadingLessThanOrEqualTo(String value) {
            addCriterion("heading <=", value, "heading");
            return (Criteria) this;
        }

        public Criteria andHeadingLike(String value) {
            addCriterion("heading like", value, "heading");
            return (Criteria) this;
        }

        public Criteria andHeadingNotLike(String value) {
            addCriterion("heading not like", value, "heading");
            return (Criteria) this;
        }

        public Criteria andHeadingIn(List<String> values) {
            addCriterion("heading in", values, "heading");
            return (Criteria) this;
        }

        public Criteria andHeadingNotIn(List<String> values) {
            addCriterion("heading not in", values, "heading");
            return (Criteria) this;
        }

        public Criteria andHeadingBetween(String value1, String value2) {
            addCriterion("heading between", value1, value2, "heading");
            return (Criteria) this;
        }

        public Criteria andHeadingNotBetween(String value1, String value2) {
            addCriterion("heading not between", value1, value2, "heading");
            return (Criteria) this;
        }

        public Criteria andAddrsIsNull() {
            addCriterion("addrs is null");
            return (Criteria) this;
        }

        public Criteria andAddrsIsNotNull() {
            addCriterion("addrs is not null");
            return (Criteria) this;
        }

        public Criteria andAddrsEqualTo(String value) {
            addCriterion("addrs =", value, "addrs");
            return (Criteria) this;
        }

        public Criteria andAddrsNotEqualTo(String value) {
            addCriterion("addrs <>", value, "addrs");
            return (Criteria) this;
        }

        public Criteria andAddrsGreaterThan(String value) {
            addCriterion("addrs >", value, "addrs");
            return (Criteria) this;
        }

        public Criteria andAddrsGreaterThanOrEqualTo(String value) {
            addCriterion("addrs >=", value, "addrs");
            return (Criteria) this;
        }

        public Criteria andAddrsLessThan(String value) {
            addCriterion("addrs <", value, "addrs");
            return (Criteria) this;
        }

        public Criteria andAddrsLessThanOrEqualTo(String value) {
            addCriterion("addrs <=", value, "addrs");
            return (Criteria) this;
        }

        public Criteria andAddrsLike(String value) {
            addCriterion("addrs like", value, "addrs");
            return (Criteria) this;
        }

        public Criteria andAddrsNotLike(String value) {
            addCriterion("addrs not like", value, "addrs");
            return (Criteria) this;
        }

        public Criteria andAddrsIn(List<String> values) {
            addCriterion("addrs in", values, "addrs");
            return (Criteria) this;
        }

        public Criteria andAddrsNotIn(List<String> values) {
            addCriterion("addrs not in", values, "addrs");
            return (Criteria) this;
        }

        public Criteria andAddrsBetween(String value1, String value2) {
            addCriterion("addrs between", value1, value2, "addrs");
            return (Criteria) this;
        }

        public Criteria andAddrsNotBetween(String value1, String value2) {
            addCriterion("addrs not between", value1, value2, "addrs");
            return (Criteria) this;
        }

        public Criteria andFloorIsNull() {
            addCriterion("floor is null");
            return (Criteria) this;
        }

        public Criteria andFloorIsNotNull() {
            addCriterion("floor is not null");
            return (Criteria) this;
        }

        public Criteria andFloorEqualTo(String value) {
            addCriterion("floor =", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotEqualTo(String value) {
            addCriterion("floor <>", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThan(String value) {
            addCriterion("floor >", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThanOrEqualTo(String value) {
            addCriterion("floor >=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThan(String value) {
            addCriterion("floor <", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThanOrEqualTo(String value) {
            addCriterion("floor <=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLike(String value) {
            addCriterion("floor like", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotLike(String value) {
            addCriterion("floor not like", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorIn(List<String> values) {
            addCriterion("floor in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotIn(List<String> values) {
            addCriterion("floor not in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorBetween(String value1, String value2) {
            addCriterion("floor between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotBetween(String value1, String value2) {
            addCriterion("floor not between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andBuildYearInfoIsNull() {
            addCriterion("build_year_info is null");
            return (Criteria) this;
        }

        public Criteria andBuildYearInfoIsNotNull() {
            addCriterion("build_year_info is not null");
            return (Criteria) this;
        }

        public Criteria andBuildYearInfoEqualTo(String value) {
            addCriterion("build_year_info =", value, "buildYearInfo");
            return (Criteria) this;
        }

        public Criteria andBuildYearInfoNotEqualTo(String value) {
            addCriterion("build_year_info <>", value, "buildYearInfo");
            return (Criteria) this;
        }

        public Criteria andBuildYearInfoGreaterThan(String value) {
            addCriterion("build_year_info >", value, "buildYearInfo");
            return (Criteria) this;
        }

        public Criteria andBuildYearInfoGreaterThanOrEqualTo(String value) {
            addCriterion("build_year_info >=", value, "buildYearInfo");
            return (Criteria) this;
        }

        public Criteria andBuildYearInfoLessThan(String value) {
            addCriterion("build_year_info <", value, "buildYearInfo");
            return (Criteria) this;
        }

        public Criteria andBuildYearInfoLessThanOrEqualTo(String value) {
            addCriterion("build_year_info <=", value, "buildYearInfo");
            return (Criteria) this;
        }

        public Criteria andBuildYearInfoLike(String value) {
            addCriterion("build_year_info like", value, "buildYearInfo");
            return (Criteria) this;
        }

        public Criteria andBuildYearInfoNotLike(String value) {
            addCriterion("build_year_info not like", value, "buildYearInfo");
            return (Criteria) this;
        }

        public Criteria andBuildYearInfoIn(List<String> values) {
            addCriterion("build_year_info in", values, "buildYearInfo");
            return (Criteria) this;
        }

        public Criteria andBuildYearInfoNotIn(List<String> values) {
            addCriterion("build_year_info not in", values, "buildYearInfo");
            return (Criteria) this;
        }

        public Criteria andBuildYearInfoBetween(String value1, String value2) {
            addCriterion("build_year_info between", value1, value2, "buildYearInfo");
            return (Criteria) this;
        }

        public Criteria andBuildYearInfoNotBetween(String value1, String value2) {
            addCriterion("build_year_info not between", value1, value2, "buildYearInfo");
            return (Criteria) this;
        }

        public Criteria andRentIsNull() {
            addCriterion("rent is null");
            return (Criteria) this;
        }

        public Criteria andRentIsNotNull() {
            addCriterion("rent is not null");
            return (Criteria) this;
        }

        public Criteria andRentEqualTo(String value) {
            addCriterion("rent =", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentNotEqualTo(String value) {
            addCriterion("rent <>", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentGreaterThan(String value) {
            addCriterion("rent >", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentGreaterThanOrEqualTo(String value) {
            addCriterion("rent >=", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentLessThan(String value) {
            addCriterion("rent <", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentLessThanOrEqualTo(String value) {
            addCriterion("rent <=", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentLike(String value) {
            addCriterion("rent like", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentNotLike(String value) {
            addCriterion("rent not like", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentIn(List<String> values) {
            addCriterion("rent in", values, "rent");
            return (Criteria) this;
        }

        public Criteria andRentNotIn(List<String> values) {
            addCriterion("rent not in", values, "rent");
            return (Criteria) this;
        }

        public Criteria andRentBetween(String value1, String value2) {
            addCriterion("rent between", value1, value2, "rent");
            return (Criteria) this;
        }

        public Criteria andRentNotBetween(String value1, String value2) {
            addCriterion("rent not between", value1, value2, "rent");
            return (Criteria) this;
        }

        public Criteria andVisitorNumIsNull() {
            addCriterion("visitor_num is null");
            return (Criteria) this;
        }

        public Criteria andVisitorNumIsNotNull() {
            addCriterion("visitor_num is not null");
            return (Criteria) this;
        }

        public Criteria andVisitorNumEqualTo(String value) {
            addCriterion("visitor_num =", value, "visitorNum");
            return (Criteria) this;
        }

        public Criteria andVisitorNumNotEqualTo(String value) {
            addCriterion("visitor_num <>", value, "visitorNum");
            return (Criteria) this;
        }

        public Criteria andVisitorNumGreaterThan(String value) {
            addCriterion("visitor_num >", value, "visitorNum");
            return (Criteria) this;
        }

        public Criteria andVisitorNumGreaterThanOrEqualTo(String value) {
            addCriterion("visitor_num >=", value, "visitorNum");
            return (Criteria) this;
        }

        public Criteria andVisitorNumLessThan(String value) {
            addCriterion("visitor_num <", value, "visitorNum");
            return (Criteria) this;
        }

        public Criteria andVisitorNumLessThanOrEqualTo(String value) {
            addCriterion("visitor_num <=", value, "visitorNum");
            return (Criteria) this;
        }

        public Criteria andVisitorNumLike(String value) {
            addCriterion("visitor_num like", value, "visitorNum");
            return (Criteria) this;
        }

        public Criteria andVisitorNumNotLike(String value) {
            addCriterion("visitor_num not like", value, "visitorNum");
            return (Criteria) this;
        }

        public Criteria andVisitorNumIn(List<String> values) {
            addCriterion("visitor_num in", values, "visitorNum");
            return (Criteria) this;
        }

        public Criteria andVisitorNumNotIn(List<String> values) {
            addCriterion("visitor_num not in", values, "visitorNum");
            return (Criteria) this;
        }

        public Criteria andVisitorNumBetween(String value1, String value2) {
            addCriterion("visitor_num between", value1, value2, "visitorNum");
            return (Criteria) this;
        }

        public Criteria andVisitorNumNotBetween(String value1, String value2) {
            addCriterion("visitor_num not between", value1, value2, "visitorNum");
            return (Criteria) this;
        }

        public Criteria andTransportationIsNull() {
            addCriterion("transportation is null");
            return (Criteria) this;
        }

        public Criteria andTransportationIsNotNull() {
            addCriterion("transportation is not null");
            return (Criteria) this;
        }

        public Criteria andTransportationEqualTo(String value) {
            addCriterion("transportation =", value, "transportation");
            return (Criteria) this;
        }

        public Criteria andTransportationNotEqualTo(String value) {
            addCriterion("transportation <>", value, "transportation");
            return (Criteria) this;
        }

        public Criteria andTransportationGreaterThan(String value) {
            addCriterion("transportation >", value, "transportation");
            return (Criteria) this;
        }

        public Criteria andTransportationGreaterThanOrEqualTo(String value) {
            addCriterion("transportation >=", value, "transportation");
            return (Criteria) this;
        }

        public Criteria andTransportationLessThan(String value) {
            addCriterion("transportation <", value, "transportation");
            return (Criteria) this;
        }

        public Criteria andTransportationLessThanOrEqualTo(String value) {
            addCriterion("transportation <=", value, "transportation");
            return (Criteria) this;
        }

        public Criteria andTransportationLike(String value) {
            addCriterion("transportation like", value, "transportation");
            return (Criteria) this;
        }

        public Criteria andTransportationNotLike(String value) {
            addCriterion("transportation not like", value, "transportation");
            return (Criteria) this;
        }

        public Criteria andTransportationIn(List<String> values) {
            addCriterion("transportation in", values, "transportation");
            return (Criteria) this;
        }

        public Criteria andTransportationNotIn(List<String> values) {
            addCriterion("transportation not in", values, "transportation");
            return (Criteria) this;
        }

        public Criteria andTransportationBetween(String value1, String value2) {
            addCriterion("transportation between", value1, value2, "transportation");
            return (Criteria) this;
        }

        public Criteria andTransportationNotBetween(String value1, String value2) {
            addCriterion("transportation not between", value1, value2, "transportation");
            return (Criteria) this;
        }

        public Criteria andRentTypeIsNull() {
            addCriterion("rent_type is null");
            return (Criteria) this;
        }

        public Criteria andRentTypeIsNotNull() {
            addCriterion("rent_type is not null");
            return (Criteria) this;
        }

        public Criteria andRentTypeEqualTo(String value) {
            addCriterion("rent_type =", value, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeNotEqualTo(String value) {
            addCriterion("rent_type <>", value, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeGreaterThan(String value) {
            addCriterion("rent_type >", value, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("rent_type >=", value, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeLessThan(String value) {
            addCriterion("rent_type <", value, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeLessThanOrEqualTo(String value) {
            addCriterion("rent_type <=", value, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeLike(String value) {
            addCriterion("rent_type like", value, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeNotLike(String value) {
            addCriterion("rent_type not like", value, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeIn(List<String> values) {
            addCriterion("rent_type in", values, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeNotIn(List<String> values) {
            addCriterion("rent_type not in", values, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeBetween(String value1, String value2) {
            addCriterion("rent_type between", value1, value2, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeNotBetween(String value1, String value2) {
            addCriterion("rent_type not between", value1, value2, "rentType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("pay_type is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(String value) {
            addCriterion("pay_type =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(String value) {
            addCriterion("pay_type <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(String value) {
            addCriterion("pay_type >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pay_type >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(String value) {
            addCriterion("pay_type <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(String value) {
            addCriterion("pay_type <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLike(String value) {
            addCriterion("pay_type like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotLike(String value) {
            addCriterion("pay_type not like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<String> values) {
            addCriterion("pay_type in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<String> values) {
            addCriterion("pay_type not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(String value1, String value2) {
            addCriterion("pay_type between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(String value1, String value2) {
            addCriterion("pay_type not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andHourseStatusIsNull() {
            addCriterion("hourse_status is null");
            return (Criteria) this;
        }

        public Criteria andHourseStatusIsNotNull() {
            addCriterion("hourse_status is not null");
            return (Criteria) this;
        }

        public Criteria andHourseStatusEqualTo(String value) {
            addCriterion("hourse_status =", value, "hourseStatus");
            return (Criteria) this;
        }

        public Criteria andHourseStatusNotEqualTo(String value) {
            addCriterion("hourse_status <>", value, "hourseStatus");
            return (Criteria) this;
        }

        public Criteria andHourseStatusGreaterThan(String value) {
            addCriterion("hourse_status >", value, "hourseStatus");
            return (Criteria) this;
        }

        public Criteria andHourseStatusGreaterThanOrEqualTo(String value) {
            addCriterion("hourse_status >=", value, "hourseStatus");
            return (Criteria) this;
        }

        public Criteria andHourseStatusLessThan(String value) {
            addCriterion("hourse_status <", value, "hourseStatus");
            return (Criteria) this;
        }

        public Criteria andHourseStatusLessThanOrEqualTo(String value) {
            addCriterion("hourse_status <=", value, "hourseStatus");
            return (Criteria) this;
        }

        public Criteria andHourseStatusLike(String value) {
            addCriterion("hourse_status like", value, "hourseStatus");
            return (Criteria) this;
        }

        public Criteria andHourseStatusNotLike(String value) {
            addCriterion("hourse_status not like", value, "hourseStatus");
            return (Criteria) this;
        }

        public Criteria andHourseStatusIn(List<String> values) {
            addCriterion("hourse_status in", values, "hourseStatus");
            return (Criteria) this;
        }

        public Criteria andHourseStatusNotIn(List<String> values) {
            addCriterion("hourse_status not in", values, "hourseStatus");
            return (Criteria) this;
        }

        public Criteria andHourseStatusBetween(String value1, String value2) {
            addCriterion("hourse_status between", value1, value2, "hourseStatus");
            return (Criteria) this;
        }

        public Criteria andHourseStatusNotBetween(String value1, String value2) {
            addCriterion("hourse_status not between", value1, value2, "hourseStatus");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}