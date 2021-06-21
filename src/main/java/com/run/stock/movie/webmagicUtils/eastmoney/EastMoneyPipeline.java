package com.run.stock.movie.webmagicUtils.eastmoney;


import com.run.stock.movie.entity.Movie;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;
import us.codecraft.webmagic.selector.Selectable;

import java.util.ArrayList;

public class EastMoneyPipeline implements Pipeline{

    private ArrayList<Movie> movies;
    public void process(ResultItems resultItems, Task task) {
//        ArrayList<String> movie_titles = resultItems.get("movie_titles");
//        ArrayList<String> movie_details_srcs = resultItems.get("movie_detail_srcs");
//        ArrayList<String> movie_rating_nums = resultItems.get("rating_nums");
//        ArrayList<String> movie_stars = resultItems.get("movie_stars");
//        ArrayList<String> movie_covers = resultItems.get("movie_covers");
//        ArrayList<Selectable> movie_contents = resultItems.get("movie_contents");
//
//        movies = new ArrayList<Movie>();
//
//        int size = movie_titles.size();
//        Selectable selectable;
//        for(int i=0; i<size;i++){
//            Movie movie = new Movie();
//            movie.setTitle(movie_titles.get(i));
//            movie.setCover(movie_covers.get(i));
//            movie.setMovie_detail_src(movie_details_srcs.get(i));
//            movie.setRate_nums(movie_rating_nums.get(i));
//            movie.setStars(movie_stars.get(i));
//
//            selectable = movie_contents.get(i).$("p","text");
//
//            if(selectable.match()){
//                movie.setMovie_introduction(selectable.toString());
//            } else {
//                movie.setMovie_introduction("暂无评价");
//            }
//
//            movies.add(movie);
//        }
//        System.out.println(movies);

    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }
}
