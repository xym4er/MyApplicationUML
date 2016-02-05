package com.chornyiua.myapplicationuml.presenter;

import com.chornyiua.myapplicationuml.presenter.viewObjects.BaseTest;

/**
 * Created by ChornyiUA on 02.02.2016.
 */
public interface Presenter {

    void onClickFAB();
    BaseTest getTest(TypeTest type);
}
