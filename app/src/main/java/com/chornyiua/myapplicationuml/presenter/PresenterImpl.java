package com.chornyiua.myapplicationuml.presenter;

import com.chornyiua.myapplicationuml.model.Model;
import com.chornyiua.myapplicationuml.model.ModelImpl;
import com.chornyiua.myapplicationuml.presenter.viewObjects.BaseTest;

/**
 * Created by ChornyiUA on 02.02.2016.
 */
public class PresenterImpl implements Presenter {
    private BaseTest test;
    private Model model;

    public PresenterImpl() {
        model = new ModelImpl();
    }

    @Override
    public void onClickFAB() {

    }

    @Override
    public BaseTest getTest(TypeTest type) {
        return null;
    }
}
