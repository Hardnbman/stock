package com.run.stock.movie.entity;



public class Video {

    private int v_id;
    private String title;
    private String src;
    private String cover;
    private String duration;
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

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }


    public int getV_id() {
        return v_id;
    }

    public void setV_id(int v_id) {
        this.v_id = v_id;
    }

    @Override
    public String toString() {
        return "Video{" +
                "v_id=" + v_id +
                ", title='" + title + '\'' +
                ", src='" + src + '\'' +
                ", cover='" + cover + '\'' +
                ", duration='" + duration + '\'' +
                ", search=" + search +
                '}';
    }
}
