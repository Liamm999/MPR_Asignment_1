package edu.hanu.a1_2001040108;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView hiraganaView;
    GridView katakanaView;
    TextView title;
    ArrayList<Letter> hLetters;
    ArrayList<Letter> kLetters;

    LetterAdapter hLetterAdapter;
    LetterAdapter kLetterAdapter;

    AppCompatButton hViewBtn;
    AppCompatButton kViewBtn;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getView();
        title.setText("Hiragana");
        this.hLetters = setHiraganaLetters();
        this.kLetters = setKatakanaLetters();

        // set adapter for hiragana
        hLetterAdapter = new LetterAdapter(this, R.layout.letter_layout, this.hLetters);
        hiraganaView.setAdapter(this.hLetterAdapter);

        // set adapter for katakana
        kLetterAdapter = new LetterAdapter(this, R.layout.letter_layout, this.kLetters);
        katakanaView.setAdapter(this.kLetterAdapter);

        // set onclick
        hiraganaView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (hLetters.get(i).getAudio() != 0) {
//                    MediaPlayer mp = MediaPlayer.create(MainActivity.this, hLetters.get(i).getAudio());
                    MediaPlayer.create(MainActivity.this, hLetters.get(i).getAudio()).reset();
                    MediaPlayer.create(MainActivity.this, hLetters.get(i).getAudio()).start();
                }
            }
        });

        katakanaView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (kLetters.get(i).getAudio() != 0) {
                    MediaPlayer.create(MainActivity.this, kLetters.get(i).getAudio()).reset();
                    MediaPlayer.create(MainActivity.this, kLetters.get(i).getAudio()).start();
                }
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        changeView();
    }

    private void getView() {
        hiraganaView = (GridView) findViewById(R.id.hGridView);
        katakanaView = (GridView) findViewById(R.id.kGridView);
        hViewBtn = (AppCompatButton) findViewById(R.id.hiraganaViewBtn);
        kViewBtn = (AppCompatButton) findViewById(R.id.katakanaViewBtn);
        title = (TextView) findViewById(R.id.title);
    }

    private void changeView() {
        hViewBtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                title.setText("Hiragana");
                katakanaView.setVisibility(View.GONE);
                hiraganaView.setVisibility(View.VISIBLE);
                hViewBtn.setTextColor(R.color.white);
                hViewBtn.setBackgroundResource(R.drawable.button_shape_chosen);
                kViewBtn.setTextColor(R.color.pink);
                kViewBtn.setBackgroundResource(R.drawable.button_shape);
                System.out.println("hiragana click");
            }
        });

        kViewBtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                title.setText("Katakana");
                hiraganaView.setVisibility(View.GONE);
                katakanaView.setVisibility(View.VISIBLE);
                hViewBtn.setTextColor(R.color.pink);
                hViewBtn.setBackgroundResource(R.drawable.button_shape);
                kViewBtn.setTextColor(R.color.white);
                kViewBtn.setBackgroundResource(R.drawable.button_shape_chosen);
                System.out.println("katakana click");
            }
        });
    }

    ;

    private ArrayList<Letter> setHiraganaLetters() {
        ArrayList<Letter> letters = new ArrayList<>();

        letters.add(new Letter(R.drawable.h_a, R.raw.a));
        letters.add(new Letter(R.drawable.h_i, R.raw.i));
        letters.add(new Letter(R.drawable.h_u, R.raw.u));
        letters.add(new Letter(R.drawable.h_e, R.raw.e));
        letters.add(new Letter(R.drawable.h_o, R.raw.o));
        letters.add(new Letter(R.drawable.h_ka, R.raw.ka));
        letters.add(new Letter(R.drawable.h_ki, R.raw.ki));
        letters.add(new Letter(R.drawable.h_ku, R.raw.ku));
        letters.add(new Letter(R.drawable.h_ke, R.raw.ke));
        letters.add(new Letter(R.drawable.h_ko, R.raw.ko));
        letters.add(new Letter(R.drawable.h_sa, R.raw.sa));
        letters.add(new Letter(R.drawable.h_shi, R.raw.shi));
        letters.add(new Letter(R.drawable.h_su, R.raw.su));
        letters.add(new Letter(R.drawable.h_se, R.raw.se));
        letters.add(new Letter(R.drawable.h_so, R.raw.so));
        letters.add(new Letter(R.drawable.h_ta, R.raw.ta));
        letters.add(new Letter(R.drawable.h_chi, R.raw.chi));
        letters.add(new Letter(R.drawable.h_tsu, R.raw.tsu));
        letters.add(new Letter(R.drawable.h_te, R.raw.te));
        letters.add(new Letter(R.drawable.h_to, R.raw.to));
        letters.add(new Letter(R.drawable.h_na, R.raw.na));
        letters.add(new Letter(R.drawable.h_ni, R.raw.ni));
        letters.add(new Letter(R.drawable.h_nu, R.raw.nu));
        letters.add(new Letter(R.drawable.h_ne, R.raw.ne));
        letters.add(new Letter(R.drawable.h_no, R.raw.no));
        letters.add(new Letter(R.drawable.h_ha, R.raw.ha));
        letters.add(new Letter(R.drawable.h_hi, R.raw.hi));
        letters.add(new Letter(R.drawable.h_fu, R.raw.fu));
        letters.add(new Letter(R.drawable.h_he, R.raw.he));
        letters.add(new Letter(R.drawable.h_ho, R.raw.ho));
        letters.add(new Letter(R.drawable.h_ma, R.raw.ma));
        letters.add(new Letter(R.drawable.h_mi, R.raw.mi));
        letters.add(new Letter(R.drawable.h_mu, R.raw.mu));
        letters.add(new Letter(R.drawable.h_me, R.raw.me));
        letters.add(new Letter(R.drawable.h_mo, R.raw.mo));
        letters.add(new Letter(R.drawable.h_ya, R.raw.ya));
        letters.add(new Letter(R.drawable.blank, 0));
        letters.add(new Letter(R.drawable.h_yu, R.raw.yu));
        letters.add(new Letter(R.drawable.blank, 0));
        letters.add(new Letter(R.drawable.h_yo, R.raw.yo));
        letters.add(new Letter(R.drawable.h_ra, R.raw.ra));
        letters.add(new Letter(R.drawable.h_ri, R.raw.ri));
        letters.add(new Letter(R.drawable.h_ru, R.raw.ru));
        letters.add(new Letter(R.drawable.h_re, R.raw.re));
        letters.add(new Letter(R.drawable.h_ro, R.raw.ro));
        letters.add(new Letter(R.drawable.h_wa, R.raw.wa));
        letters.add(new Letter(R.drawable.blank, 0));
        letters.add(new Letter(R.drawable.blank, 0));
        letters.add(new Letter(R.drawable.blank, 0));
        letters.add(new Letter(R.drawable.h_wo, R.raw.o));
        letters.add(new Letter(R.drawable.h_n, R.raw.n));
        letters.add(new Letter(R.drawable.blank, 0));
        letters.add(new Letter(R.drawable.blank, 0));
        letters.add(new Letter(R.drawable.blank, 0));
        letters.add(new Letter(R.drawable.blank, 0));

        return letters;
    }

    private ArrayList<Letter> setKatakanaLetters() {
        ArrayList<Letter> letters = new ArrayList<Letter>();

        letters.add(new Letter(R.drawable.k_a, R.raw.a));
        letters.add(new Letter(R.drawable.k_i, R.raw.i));
        letters.add(new Letter(R.drawable.k_u, R.raw.u));
        letters.add(new Letter(R.drawable.k_e, R.raw.e));
        letters.add(new Letter(R.drawable.k_o, R.raw.o));
        letters.add(new Letter(R.drawable.k_ka, R.raw.ka));
        letters.add(new Letter(R.drawable.k_ki, R.raw.ki));
        letters.add(new Letter(R.drawable.k_ku, R.raw.ku));
        letters.add(new Letter(R.drawable.k_ke, R.raw.ke));
        letters.add(new Letter(R.drawable.k_ko, R.raw.ko));
        letters.add(new Letter(R.drawable.k_sa, R.raw.sa));
        letters.add(new Letter(R.drawable.k_shi, R.raw.shi));
        letters.add(new Letter(R.drawable.k_su, R.raw.su));
        letters.add(new Letter(R.drawable.k_se, R.raw.se));
        letters.add(new Letter(R.drawable.k_so, R.raw.so));
        letters.add(new Letter(R.drawable.k_ta, R.raw.ta));
        letters.add(new Letter(R.drawable.k_chi, R.raw.chi));
        letters.add(new Letter(R.drawable.k_tsu, R.raw.tsu));
        letters.add(new Letter(R.drawable.k_te, R.raw.te));
        letters.add(new Letter(R.drawable.k_to, R.raw.to));
        letters.add(new Letter(R.drawable.k_na, R.raw.na));
        letters.add(new Letter(R.drawable.k_ni, R.raw.ni));
        letters.add(new Letter(R.drawable.k_nu, R.raw.nu));
        letters.add(new Letter(R.drawable.k_ne, R.raw.ne));
        letters.add(new Letter(R.drawable.k_no, R.raw.no));
        letters.add(new Letter(R.drawable.k_ha, R.raw.ha));
        letters.add(new Letter(R.drawable.k_hi, R.raw.hi));
        letters.add(new Letter(R.drawable.k_fu, R.raw.fu));
        letters.add(new Letter(R.drawable.k_he, R.raw.he));
        letters.add(new Letter(R.drawable.k_ho, R.raw.ho));
        letters.add(new Letter(R.drawable.k_ma, R.raw.ma));
        letters.add(new Letter(R.drawable.k_mi, R.raw.mi));
        letters.add(new Letter(R.drawable.k_mu, R.raw.mu));
        letters.add(new Letter(R.drawable.k_me, R.raw.me));
        letters.add(new Letter(R.drawable.k_mo, R.raw.mo));
        letters.add(new Letter(R.drawable.k_ya, R.raw.ya));
        letters.add(new Letter(R.drawable.blank, 0));
        letters.add(new Letter(R.drawable.k_yu, R.raw.yu));
        letters.add(new Letter(R.drawable.blank, 0));
        letters.add(new Letter(R.drawable.k_yo, R.raw.yo));
        letters.add(new Letter(R.drawable.k_ra, R.raw.ra));
        letters.add(new Letter(R.drawable.k_ri, R.raw.ri));
        letters.add(new Letter(R.drawable.k_ru, R.raw.ru));
        letters.add(new Letter(R.drawable.k_re, R.raw.re));
        letters.add(new Letter(R.drawable.k_ro, R.raw.ro));
        letters.add(new Letter(R.drawable.k_wa, R.raw.wa));
        letters.add(new Letter(R.drawable.blank, 0));
        letters.add(new Letter(R.drawable.blank, 0));
        letters.add(new Letter(R.drawable.blank, 0));
        letters.add(new Letter(R.drawable.k_wo, R.raw.o));
        letters.add(new Letter(R.drawable.k_n, R.raw.n));
        letters.add(new Letter(R.drawable.blank, 0));
        letters.add(new Letter(R.drawable.blank, 0));
        letters.add(new Letter(R.drawable.blank, 0));
        letters.add(new Letter(R.drawable.blank, 0));

        return letters;
    }
}