package com.ihandy.a2014011446.dao;
/**
 * Created by Starry Sky on 2017/9/9.
 */
import android.content.Context;
import android.util.Log;

import com.ihandy.a2014011446.bean.NewsItemSeen;
import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.j256.ormlite.stmt.DeleteBuilder;

import java.sql.SQLException;
import java.util.List;

public class NewsItemSeenDao {
    private RuntimeExceptionDao<NewsItemSeen,Integer> mNewsItemSeenDao;
    private DataBaseHelper mDataBaseHelpter;

    public NewsItemSeenDao(Context context) {
        mDataBaseHelpter = DataBaseHelper.getHelper(context);
        this.mNewsItemSeenDao = mDataBaseHelpter.getNewsItemSeenRuntimeDao();
    }

    public void createOrUpdate(NewsItemSeen newsItemSeen){
        try {
            mNewsItemSeenDao.createOrUpdate(newsItemSeen);
        }catch (Exception e){
            Log.i("CreatException",e.getMessage());
        }
       // mNewsItemSeenDao.createOrUpdate(newsItemSeen);
    }

    public List<NewsItemSeen> queryAll(){
        List<NewsItemSeen> itemSeen = mNewsItemSeenDao.queryForAll();
        return itemSeen;
    }
//    public int deleteByNewsId(String newsId) throws SQLException {
//        DeleteBuilder<NewsItemSeen, Integer> deleteBuilder = mNewsItemSeenDao.deleteBuilder();
//        deleteBuilder.where().eq("news_ID",newsId);
//        return deleteBuilder.delete();
//    }
    public boolean searchIsExistByNewsId(String newsId) throws SQLException {
        List<NewsItemSeen> NewsItemSeen = mNewsItemSeenDao.queryBuilder().where().eq("news_ID",newsId).query();
        return (NewsItemSeen.size() > 0);
    }
}
