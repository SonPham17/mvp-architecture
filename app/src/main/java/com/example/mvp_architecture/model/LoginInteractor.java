package com.example.mvp_architecture.model;

import android.os.Handler;
import android.text.TextUtils;

public class LoginInteractor {

    public void login(final String username, final String password, final OnLoginFinishedListener listener) {
        new Handler().postDelayed(() -> {
            if (TextUtils.isEmpty(username)) {
                listener.onUsernameError();
                return;
            }
            if (TextUtils.isEmpty(password)) {
                listener.onPasswordError();
                return;
            }
            listener.onSuccess();
        }, 2000);
    }

    public interface OnLoginFinishedListener {
        void onUsernameError();

        void onPasswordError();

        void onSuccess();
    }
}
