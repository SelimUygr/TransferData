package homework.example.transferdata;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        final EditText data2 = (EditText) findViewById(R.id.data2);
        Button transferButton2 = (Button) findViewById(R.id.transferButton2);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("Data");
            //The key argument here must match that used in the other activity
            Toast.makeText(SecondActivity.this,"Data: " + value,Toast.LENGTH_SHORT).show();
        }
        transferButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dataString = data2.getText().toString();
                Intent intent = new Intent(SecondActivity.this,MainActivity.class);
                intent.putExtra("Data",dataString);
                startActivity(intent);
            }
        });

    }
}