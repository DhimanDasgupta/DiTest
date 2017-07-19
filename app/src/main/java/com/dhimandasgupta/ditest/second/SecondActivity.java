package com.dhimandasgupta.ditest.second;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.AppCompatTextView;

import com.dhimandasgupta.ditest.R;
import com.dhimandasgupta.ditest.base.BaseActivity;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SecondActivity extends BaseActivity implements SecondActivityView {
    private static final String EXTRA_TEXT = "text";

    String text;

    @Inject
    SecondActivityPresenter presenter;

    @BindView(R.id.text_view)
    AppCompatTextView textView;

    public static Intent newInstancte(Context context, String text) {
        final Intent intent = new Intent(context, SecondActivity.class);
        intent.putExtra(EXTRA_TEXT, text);

        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        text = getIntent().getStringExtra(EXTRA_TEXT);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        unbinder = ButterKnife.bind(this);

        presenter.showText(text);
    }

    @Override
    public void showText(String text) {
        textView.setText(text);
    }
}
