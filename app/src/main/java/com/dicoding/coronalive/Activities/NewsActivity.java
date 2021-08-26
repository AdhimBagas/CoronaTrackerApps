package com.dicoding.coronalive.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;
import android.widget.Toast;

import com.dicoding.coronalive.API.ApiClientNews;
import com.dicoding.coronalive.Adapters.NewsAdapter;
import com.dicoding.coronalive.Model.Articles;
import com.dicoding.coronalive.Model.Headlines;
import com.dicoding.coronalive.R;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NewsActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    final String API_KEY = "a0d2323468c64214a35dca44f3b788fb";
    final String category = "health";
    final String country = "id";
    NewsAdapter newsAdapter;
    List<Articles> articles = new ArrayList<>();

    //SwipeRefreshLayout
    SwipeRefreshLayout swipeRefreshLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        swipeRefreshLayout = findViewById(R.id.swipeRefresh);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                retrieveJson(country, category, API_KEY);
            }
        });
        retrieveJson(country, category, API_KEY);
    }

    public void retrieveJson(String country, String category, String apiKey){
        swipeRefreshLayout.setRefreshing(true);
        Call<Headlines> call = ApiClientNews.getInstance().getApi().getHeadlines(country,category,apiKey);
        call.enqueue(new Callback<Headlines>() {
            @Override
            public void onResponse(Call<Headlines> call, Response<Headlines> response) {
                if (response.isSuccessful() && response.body().getArticles() != null){
                    swipeRefreshLayout.setRefreshing(false);
                    articles.clear();
                    articles = response.body().getArticles();
                    newsAdapter = new NewsAdapter(NewsActivity.this, articles);
                    recyclerView.setAdapter(newsAdapter);
                }
            }

            @Override
            public void onFailure(Call<Headlines> call, Throwable t) {

                swipeRefreshLayout.setRefreshing(true);
                Toast.makeText(NewsActivity.this, "Cek Koneksi Internet Anda", Toast.LENGTH_SHORT).show();

            }
        });


    }
}
