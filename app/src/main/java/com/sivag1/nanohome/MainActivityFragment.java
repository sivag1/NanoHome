package com.sivag1.nanohome;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment implements View.OnClickListener {

    Button btn1, btn2, btn3, btn4, btn5, btn6;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        btn1 = (Button) view.findViewById(R.id.button1);
        btn2 = (Button) view.findViewById(R.id.button2);
        btn3 = (Button) view.findViewById(R.id.button3);
        btn4 = (Button) view.findViewById(R.id.button4);
        btn5 = (Button) view.findViewById(R.id.button5);
        btn6 = (Button) view.findViewById(R.id.button6);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        String templateString = "This button will launch ";
        switch (v.getId()) {
            case R.id.button1:
                templateString = templateString + getResources().getString(R.string.spotify_streamer);
                break;
            case R.id.button2:
                templateString = templateString + getResources().getString(R.string.scores_app);
                break;
            case R.id.button3:
                templateString = templateString + getResources().getString(R.string.library_app);
                break;
            case R.id.button4:
                templateString = templateString + getResources().getString(R.string.build_it_bigger);
                break;
            case R.id.button5:
                templateString = templateString + getResources().getString(R.string.xyz_reader);
                break;
            default:
                templateString = templateString + getResources().getString(R.string.capstone);
        }

        templateString = templateString + " !";

        Toast.makeText(getActivity(), templateString, Toast.LENGTH_SHORT).show();
    }
}
