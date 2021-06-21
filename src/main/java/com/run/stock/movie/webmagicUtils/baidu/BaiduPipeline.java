package com.run.stock.movie.webmagicUtils.baidu;


import com.run.stock.movie.entity.Video;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

import java.util.ArrayList;

public class BaiduPipeline implements Pipeline {

    private ArrayList<Video> videos;
    public void process(ResultItems resultItems, Task task) {

        videos = new ArrayList<Video>();
        ArrayList<String> srcs = resultItems.get("movie_srcs");
        ArrayList<String> titles = resultItems.get("movie_titles");
        ArrayList<String> covers = resultItems.get("movie_covers");
        ArrayList<String> durations = resultItems.get("movie_durations");

        String s;
        int size = srcs.size();
        for (int i = 0; i < size; i++) {
            Video video = new Video();

            video.setCover(covers.get(i));
            video.setDuration(durations.get(i));
            video.setTitle(titles.get(i));

            s = srcs.get(i);
            if(s.startsWith("/link")) {
                video.setSrc("http://v.baidu.com"+s);
            } else {
                video.setSrc(s);
            }



            videos.add(video);

        }

        System.out.println(videos);
    }

    public ArrayList<Video> getVideos() {
        return videos;
    }
}
