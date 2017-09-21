package com.service;

import java.util.List;

import com.PO.Score;

public interface ScoreService {

	boolean saveOrUpdateScore(Score score);
	List<Score> findScore();
	boolean deleteScore(Score score );
	List<Score> find(String type,Object value);
}
