package com.ihandy.a2014011446.utils;

/**
 * 相关API
 */
public class NewsAPIUtils {

    public static String TypeUrl = "1:科技,2:教育,3:军事,4:国内,5:社会,6:文化,7:汽车,8:国际,9:体育,10:财经,11:健康,12:娱乐,";
    public static String getTypeUrl() {
        return TypeUrl;
        //return "http://assignment.crazz.cn/news/en/category?timestamp=" + System.currentTimeMillis();
    }

//    public static String getNewsUrl(String newsType,int maxNewsID){
        //TODO 为了兼容所有带currentPage的函数调用,这里先进行重定位
//        return "http://assignment.crazz.cn/news/query?locale=en&category=" + newsType + "&max_news_id=" + maxNewsID;
//        return getNewsUrl(newsType);
//    }
    public static String getNewsUrl(String newsType, int currrntpage){
        return "http://166.111.68.66:2042/news/action/query/latest?pageNo="+ String.valueOf(currrntpage+1) + "&pageSize=" +
                String.valueOf(currrntpage+5) + "&category=" + newsType;
    }
    public static String getNewsUrlByKey(String keywords, int currrntpage){
        return "http://166.111.68.66:2042/news/action/query/search?keyword=" + keywords;
    }
}
