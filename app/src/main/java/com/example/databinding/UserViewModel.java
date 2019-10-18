package com.example.databinding;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;


public class UserViewModel extends AndroidViewModel {
    public MutableLiveData<String > mName = new MutableLiveData<>();

    public UserViewModel(@NonNull Application application) {
        super(application);
    }

    public LiveData<String> getName() {
        return mName;
    }
}
