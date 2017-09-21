package com.scoreDao;

import java.util.List;

import com.PO.Score;

public interface ScoreDao {

	void saveOrUpdateScore(Score score);
	List<Score> findScore(String hql);
	void deleteScore(Score score);
}
