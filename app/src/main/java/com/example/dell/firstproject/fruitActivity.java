package com.example.dell.firstproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

public class fruitActivity extends AppCompatActivity {
    ListView simpleList;
    String Item[] = {"Apple", "Grape", "Mango", "Jackfruit", "Strawberry", "Banana","Papaya","Cherry","Coconut",
            "Date","Guava","Watermilon"};
    String SubItem[] = {"Apple is a round,sweet & juicy fruit.", "Grapes contain natural sugar", "Mangoes are full of vitamin A.",
            "Jackfruit seeds can also be eaten.","strawberries improve heart health."," It is good to eat a banana everyday.",
            "papaya trees usually lives for four to five years.","Cherries have a unique sour-sweet flavor."
            ,"Coconut is a complete source of protein.",
            "Date is one of the sweetest fruits.","Some guavas are white and some are pink.",
            "Watermelon is a delicious and refreshing fruit."};
    int flags[] = {R.drawable.apple, R.drawable.grape, R.drawable.mango, R.drawable.jackfruit, R.drawable.strawberries,
            R.drawable.bananas,R.drawable.papaya,
    R.drawable.cherreis,R.drawable.coconut,R.drawable.data,R.drawable.guava,R.drawable.watermilon};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);
        simpleList = (ListView) findViewById(R.id.ListView);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), Item, SubItem, flags);
        simpleList.setAdapter(customAdapter);
    }
}
