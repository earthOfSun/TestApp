package com.earthsun.testapp.Base;

public interface BaseView<T> {

    void isActive();

    void showProgressDialog();

    void hideProgressDialog();

    void setPresenter(T presenter);
}
