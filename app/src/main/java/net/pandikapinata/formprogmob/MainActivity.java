package net.pandikapinata.formprogmob;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

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

    @BindView(R.id.simpan_button)
    Button simpan_button;

    @BindView(R.id.hasil_nama)
    TextView hasilNama;
    @BindView(R.id.hasil_nim)
    TextView hasilNim;
    @BindView(R.id.hasil_alamat)
    TextView hasilAlamat;
    @BindView(R.id.hasil_agama)
    TextView hasilAgama;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        simpan_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = inputNama.getText().toString();
                hasilNama.setText(nama);
                String nim = inputNim.getText().toString();
                hasilNim.setText(nim);
                String alamat = inputAlamat.getText().toString();
                hasilAlamat.setText(alamat);
                String agama = inputAgama.getSelectedItem().toString();
                hasilAgama.setText(agama);
            }
        });
    }
}
