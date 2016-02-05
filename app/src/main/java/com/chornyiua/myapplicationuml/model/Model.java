package com.chornyiua.myapplicationuml.model;

import com.chornyiua.myapplicationuml.model.data.Question;

import java.util.List;

/**
 * Created by ChornyiUA on 02.02.2016.
 */
public interface Model {

    List<Question> getListQuestion(int count);
}
