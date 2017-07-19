package com.dhimandasgupta.ditest.main;

import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatEditText;
import android.text.TextUtils;

import com.dhimandasgupta.ditest.R;
import com.dhimandasgupta.ditest.base.BaseActivity;
import com.dhimandasgupta.ditest.second.SecondActivity;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnTextChanged;

public class MainActivity extends BaseActivity implements MainActivityView {
    @Inject
    MainActivityPresenter presenter;

    @BindView(R.id.edit_text)
    AppCompatEditText editText;

    @OnTextChanged(R.id.edit_text)
    void onTextChanged(CharSequence charSequence, int i1, int i2, int i3) {
        int length = charSequence.toString().trim().length();

        button.setEnabled(length > 0);
    }

    @BindView(R.id.button)
    AppCompatButton button;

    @OnClick(R.id.button)
    void onClick() {
        String text = editText.getText().toString().trim();

        if (!TextUtils.isEmpty(text)) {
            startActivity(SecondActivity.newInstancte(getBaseContext(), text));
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        unbinder = ButterKnife.bind(this);

        presenter.doNothing();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void doNothing() {

    }
}
