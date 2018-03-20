package net.pandikapinata.formprogmob;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.f2prateek.dart.Dart;
import com.f2prateek.dart.InjectExtra;
import com.f2prateek.dart.Nullable;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * Created by Pandika on 3/20/2018.
 */

public class ResultActivity extends AppCompatActivity {

    @BindView(R.id.hasil_nama)
    TextView hasilNama;
    @BindView(R.id.hasil_nim)
    TextView hasilNim;
    @BindView(R.id.hasil_alamat)
    TextView hasilAlamat;
    @BindView(R.id.hasil_agama)
    TextView hasilAgama;
    @BindView(R.id.hasil_gender)
    TextView hasilGender;

    @InjectExtra
    User user;
    @Nullable
    @InjectExtra
    String fromScreen;
    @InjectExtra
    boolean isSuccess = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultform);
        ButterKnife.bind(this);

        Dart.inject(this);

        updateFields();
    }

    private void updateFields() {

        hasilNama.setText(user.getNama());
        hasilNim.setText(user.getNim());
        hasilAlamat.setText(user.getAlamat());
        hasilGender.setText(user.getGender());
        hasilAgama.setText(user.getAgama());

    }
}
