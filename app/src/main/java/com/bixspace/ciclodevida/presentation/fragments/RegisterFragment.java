package com.bixspace.ciclodevida.presentation.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.bixspace.ciclodevida.R;

/**
 * Created by junior on 28/11/16.
 */

public class RegisterFragment extends Fragment {



    private Button login_button;
    private EditText et_username;
    private EditText et_password;


    public RegisterFragment() {
        // Requires empty public constructor
    }

    public static RegisterFragment newInstance() {
        return new RegisterFragment();
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onResume() {
        super.onResume();

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_layout_login, container, false);


        return root;


    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        et_password = (EditText)getActivity().findViewById(R.id.et_password);


        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getActivity(), "Hola "+et_username.getText().toString(), Toast.LENGTH_SHORT).show();


            }
        });



    }



}
