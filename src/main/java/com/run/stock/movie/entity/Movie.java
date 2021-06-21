package com.run.stock.movie.entity;


public class Movie {

    // 电影 id
    private int m_id;
    // 电影名
    private String title;
    // 电影封面
    private String cover;
    // 电影评分
    private String rate_nums;
    // 主演
    private String stars;
    // 电影链接
    private String movie_detail_src;
    // 电影简介
    private String movie_introduction;

    private Search search;

    public Search getSearch() {
        return search;
    }

    public void setSearch(Search search) {
        this.search = search;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getRate_nums() {
        return rate_nums;
    }

    public void setRate_nums(String rate_nums) {
        this.rate_nums = rate_nums;
    }

    public String getStars() {
        return stars;
    }

    public void setStars(String stars) {
        this.stars = stars;
    }

    public String getMovie_detail_src() {
        return movie_detail_src;
    }

    public void setMovie_detail_src(String movie_detail_src) {
        this.movie_detail_src = movie_detail_src;
    }

    public String getMovie_introduction() {
        return movie_introduction;
    }

    public void setMovie_introduction(String movie_introduction) {
        this.movie_introduction = movie_introduction;
    }

    public int getM_id() {
        return m_id;
    }

    public void setM_id(int m_id) {
        this.m_id = m_id;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "m_id=" + m_id +
                ", title='" + title + '\'' +
                ", cover='" + cover + '\'' +
                ", rate_nums='" + rate_nums + '\'' +
                ", stars='" + stars + '\'' +
                ", movie_detail_src='" + movie_detail_src + '\'' +
                ", movie_introduction='" + movie_introduction + '\'' +
                ", search=" + search +
                '}';
    }
}
