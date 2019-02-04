package devanir.soaresjunior.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText etNumberOne;
    EditText etNumberTwo;
    Button btnAdd;
    Button btnSubtract;
    Button btnDivide;
    Button btnMultiply;
    Button btnLogs;
    TextView tvResults;

    private List<String> log = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumberOne = findViewById(R.id.etNumber1);
        etNumberTwo = findViewById(R.id.etNumber2);
        btnAdd = findViewById(R.id.btnAdd);
        btnSubtract = findViewById(R.id.btnSubtract);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        tvResults = findViewById(R.id.tvResult);
        btnLogs = findViewById(R.id.btnLogs);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String result = add(etNumberOne.getText().toString(),
                etNumberTwo.getText().toString());

            tvResults.setText(result);
            log.add("Result of Addition: " + result);
            }
        });

        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = subtract(etNumberOne.getText().toString(),
                        etNumberTwo.getText().toString());

                tvResults.setText(result);
                log.add("Result of Subtraction: " + result);
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = multiply(etNumberOne.getText().toString(),
                        etNumberTwo.getText().toString());

                tvResults.setText(result);
                log.add("Result of multiplication " + result);
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = divide(etNumberOne.getText().toString(),
                        etNumberTwo.getText().toString());

                tvResults.setText(result);
                log.add("Result of Division: " + result);
            }
        });

        btnLogs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LogsActivity.class);
                intent.putStringArrayListExtra("LogsResult", (ArrayList<String>)log);
                startActivity(intent);
            }
        });


    }

    private String add(String numberOne, String numberTwo){
        if(numberOne.equals("")|| numberTwo.isEmpty()) {
            Toast.makeText(this,
                    "Please fill the empty gaps with valid numbers pretty pleeaaaaase",
                    Toast.LENGTH_SHORT).show();
            return null;
        }
        int a = Integer.parseInt(numberOne);
        int b = Integer.parseInt(numberTwo);
        int result = a + b;
        /*return Integer.toString(result);*/
        return String.valueOf(result);
    }

    private String subtract(String numberOne, String numberTwo){
        if(numberOne.equals("")|| numberTwo.isEmpty()) {
            Toast.makeText(this,
                    "Please fill the empty gaps with valid numbers pretty pleeaaaaase",
                    Toast.LENGTH_SHORT).show();
            return null;
        }
        int c = Integer.parseInt(numberOne);
        int d = Integer.parseInt(numberTwo);
        int result = c - d;
        /*return Integer.toString(result);*/
        return String.valueOf(result);
    }

    private String multiply(String numberOne, String numberTwo){
        if(numberOne.equals("")|| numberTwo.isEmpty()) {
            Toast.makeText(this,
                    "Please fill the empty gaps with valid numbers pretty pleeaaaaase",
                    Toast.LENGTH_SHORT).show();
            return null;
        }
        int e = Integer.parseInt(numberOne);
        int f = Integer.parseInt(numberTwo);
        int result = (e * f);
        /*return Integer.toString(result);*/
        return String.valueOf(result);
    }
    private String divide(String numberOne, String numberTwo){
        if(numberOne.equals("")|| numberTwo.isEmpty()) {
            Toast.makeText(this,
                    "Please fill the empty gaps with valid numbers pretty pleeaaaaase",
                    Toast.LENGTH_SHORT).show();
            return null;
        }
        int g = Integer.parseInt(numberOne);
        int h = Integer.parseInt(numberTwo);
        int result = (g/ h);
        /*return Integer.toString(result);*/
        return String.valueOf(result);
    }
}