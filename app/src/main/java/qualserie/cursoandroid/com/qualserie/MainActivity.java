package qualserie.cursoandroid.com.qualserie;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekBar;
    private ImageView imagemExibicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = (SeekBar) findViewById(R.id.seekBarId);
        imagemExibicao = (ImageView) findViewById(R.id.imagemExibicaoId);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int valorProgresso = progress;

                if(valorProgresso==0){
                    imagemExibicao.setImageDrawable(null);
                } else if(valorProgresso==1){
                    imagemExibicao.setImageResource(R.drawable.pouco);
                }else if (valorProgresso==2){
                    imagemExibicao.setImageResource(R.drawable.medio);
                }else if (valorProgresso==3){
                    imagemExibicao.setImageResource(R.drawable.muito);
                }else if (valorProgresso==4){

                    Intent intent = new Intent(MainActivity.this, SustoActivity.class);
                    startActivity(intent);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}
