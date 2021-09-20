package com.wGladstarGTSchool_9279984.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Gladstar Gifted and Talented School");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
