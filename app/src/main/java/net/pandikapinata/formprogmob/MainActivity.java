package net.pandikapinata.formprogmob;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import butterknife.BindView;
import butterknife.ButterKnife;



public class MainActivity extends AppCompatActivity {


    @BindView(R.id.input_nama)
    EditText inputNama;
    @BindView(R.id.input_nim)
    EditText inputNim;
    @BindView(R.id.input_alamat)
    EditText inputAlamat;
    @BindView(R.id.input_agama)
    Spinner inputAgama;
    @BindView(R.id.gender)
    RadioGroup inputGender;

    @BindView(R.id.simpan_button)
    Button simpan_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        simpan_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int genders = inputGender.getCheckedRadioButtonId();
                RadioButton jk = (RadioButton) findViewById(genders);

                User user = new User();
                user.setNama(inputNama.getText().toString());
                user.setNim(inputNim.getText().toString());
                user.setAlamat(inputAlamat.getText().toString());
                user.setAgama(inputAgama.getSelectedItem().toString());
                user.setGender(jk.getText().toString());


                Intent intent = Henson.with(MainActivity.this)
                        .gotoResultActivity()
                        .isSuccess(true)
                        .user(user)
                        .build();

                startActivity(intent);




            }
        });
    }
}
