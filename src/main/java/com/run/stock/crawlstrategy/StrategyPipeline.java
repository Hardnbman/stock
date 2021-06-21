package com.run.stock.crawlstrategy;


import com.run.stock.movie.entity.Movie;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;
import us.codecraft.webmagic.selector.Selectable;

import java.util.ArrayList;

public class StrategyPipeline implements Pipeline{

    private ArrayList<Movie> movies;
    public void process(ResultItems resultItems, Task task) {


    }

}
