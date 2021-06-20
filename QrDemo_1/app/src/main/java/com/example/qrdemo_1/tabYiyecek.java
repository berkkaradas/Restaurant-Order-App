package com.example.qrdemo_1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link tabYiyecek#newInstance} factory method to
 * create an instance of this fragment.
 */
public class tabYiyecek extends Fragment {

    TextView txtMsg1;

    //Menü içeriği için array

    String[] items = { "Hamburger", "Cheese Burger", "Ceaser Salad", "BBQ Beef",
            "Finger Chicken" ,"Rice Bowl","Pineapple Cake ", "Tiramisu", "İce-Cream" };



    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public tabYiyecek() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment tabYiyecek.
     */
    // TODO: Rename and change types and number of parameters
    public static tabYiyecek newInstance(String param1, String param2) {
        tabYiyecek fragment = new tabYiyecek();
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

        View view=inflater.inflate(R.layout.fragment_tab_yiyecek, container, false);
        //Yiyecek menüsü array i
        String[] arrayYiyecek={
                "Kremalı Tavuk                                                       28 TL",
                "Fesleğenli Tavuk                                                  28 TL",
                "Şinitzel                                                                   26 TL",
                "Bonfile Et                                                               50 TL",
                "Antrikot                                                                  43 TL",
                "Kremalı Makarna                                                 19 TL",
                "Penne Arabiata                                                     18 TL",
                "Fettucini Alfredo                                                  24 TL",
                "Cheese Burger                                                      23 TL",
                "Burger                                                                    22 TL",
                "Steak Burger                                                         27 TL"


        };
        //tanımlar

        ListView listView =(ListView) view.findViewById(R.id.listView);
        ArrayAdapter<String>listViewAdapter= new ArrayAdapter<String>(
                getActivity(),android.R.layout.simple_list_item_1,arrayYiyecek
        );

        listView.setAdapter(listViewAdapter);




        // Inflate the layout for this fragment
        return view;
    }
}