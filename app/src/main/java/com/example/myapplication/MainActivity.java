package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void sendMessage(View view) {
        EditText message = (EditText)findViewById(R.id.message);

    Intent intent = new Intent(this, DisplayMessageActivity.class);
    intent.putExtra("MESSAGE", message.getText().toString());
        startActivity(intent);
        message.setText("");}
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.hassan_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(this, "Selected Item: " +item.getTitle(), Toast.LENGTH_SHORT).show();
        switch (item.getItemId()) {
            case R.id.menuItem1:
                startActivity(new Intent(this,hassan1.class));
                return true;
            case R.id.menuItem2:

                startActivity(new Intent(this,hassan2.class));
                return true;
                      default:
                return super.onOptionsItemSelected(item);

        }
    }
}

