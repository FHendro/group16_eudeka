package com.eudekagroup16.myapplication.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.eudekagroup16.myapplication.R;
import com.eudekagroup16.myapplication.adapter.DomainAdapter;

public class DomainListActivity extends AppCompatActivity {

    DomainAdapter adapter;
    RecyclerView domainRv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_domain_list);
        initUi();
    }

    private void initUi() {
        adapter = new DomainAdapter();
        domainRv = findViewById(R.id.listDomain);
        domainRv.setAdapter(adapter);
        domainRv.setLayoutManager(new LinearLayoutManager(this));
    }
}
