package mcm.edu.ph.wage_calculator_group;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.zip.DeflaterOutputStream;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button calc;

        calc = findViewById(R.id.btnCalc);

        calc.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        EditText Hours;
        TextView TotalSalary, HoursRendered, HoursOvertime, WageOvertime;

        Hours = findViewById(R.id.txtHours);
        TotalSalary = findViewById(R.id.txtTotalSalary);
        HoursRendered = findViewById(R.id.txtHoursRendered);
        WageOvertime = findViewById(R.id.txtWageOvertime);
        HoursOvertime = findViewById(R.id.txtHoursOvertime);

        Double hrs = 0.0;
        Double totalsal = 0.0;
        Double hrsrendered = 0.0;
        Double wageovrtime = 0.0;
        Double hrsovertime = 0.0;

        hrs = Double.parseDouble(Hours.getText().toString());

        if (hrs < 9 ){
            totalsal = hrs * 100;
            hrsrendered = hrs;

            TotalSalary.setText(Double.toString(totalsal));
            HoursRendered.setText(Double.toString(hrsrendered));
        }
        else if (hrs >= 9 ){
            wageovrtime = hrs * 130;
            hrsovertime = hrs;
            WageOvertime.setText(Double.toString(wageovrtime));
            HoursOvertime.setText(Double.toString(hrsovertime));
        }









    }
}