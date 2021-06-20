package com.example.qrdemo_1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Objects;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link tabIcecek#newInstance} factory method to
 * create an instance of this fragment.
 */
public class tabIcecek extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public tabIcecek() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment tabIcecek.
     */
    // TODO: Rename and change types and number of parameters
    public static tabIcecek newInstance(String param1, String param2) {
        tabIcecek fragment = new tabIcecek();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab_yiyecek, container, false);
        //Yiyecek menüsü array i
        String[] arrayYiyecek = {
                "Cola                                                                        8 TL",
                "Fanta                                                                       8 TL",
                "Sprite                                                                      8 TL",
                "Ayran                                                                       7 TL",
                "Portakal Suyu                                                       13 TL",
                "Çay                                                                          4 TL",
                "Türk Kahvesi                                                        12 TL",
                "Latte                                                                      13 TL",
                "Su                                                                            4 TL"};
        //tanımlar

        ListView listView = view.findViewById(R.id.listView);
        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                Objects.requireNonNull(getActivity()), android.R.layout.simple_list_item_1, arrayYiyecek
        );

        listView.setAdapter(listViewAdapter);
        return view;


    }
}