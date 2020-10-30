package com.example.sapt5temaaa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class TestActivity extends AppCompatActivity {


    private EditText editnameTxt;
    private EditText editfirstNameTxt;
    private Button stergereButton;
    private Button adaugareButton;

    private RecyclerView FridayRv;
    private FridayAdapter FridayAdapter;
    private List<FridayModel> FridayModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        FridayRv=findViewById(R.id.rv_test_list);

        initializeButtons();
        initializeList();
        onClickers();
        setRecyclerView();
    }
    private void initializeButtons(){
        stergereButton =findViewById(R.id.stergereButton);
        adaugareButton = findViewById(R.id.adaugareButton);
        editnameTxt = findViewById(R.id.editnameTxt);
        editfirstNameTxt = findViewById(R.id.editfirstnameTxt);
    }

    private void initializeList(){
        FridayModelList=new ArrayList<>();
        FridayModelList.add(new FridayModel( "Ana","Trae"));
        FridayModelList.add(new FridayModel( "Iustin","Gigi"));
        FridayModelList.add(new FridayModel( "Ema","Fzoa"));
        FridayModelList.add(new FridayModel( "Cristian","Lorem"));
        FridayModelList.add(new FridayModel( "Docif","Cria"));
        FridayModelList.add(new FridayModel( "Iosif","Bata"));


        /*fridayAdapter=new FridayAdapter(fridayModelList);
        fridayRv.setLayoutManager(new LinearLayoutManager(this));
        fridayRv.setAdapter(fridayAdapter);*/
    }

    private void onClickers(){

        stergereButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String nametxt = editnameTxt.getText().toString();
                String firstnametxt=editfirstNameTxt.getText().toString();
                stergere(nametxt);
                stergere(firstnametxt);
                editnameTxt.getText().clear();
                editfirstNameTxt.getText().clear();
                FridayAdapter.notifyDataSetChanged();
            }
        });

        adaugareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nametxt = editnameTxt.getText().toString();
                String firstnametxt=editfirstNameTxt.getText().toString();
                FridayModelList.add(new FridayModel(nametxt,firstnametxt));
                editnameTxt.getText().clear();
                editfirstNameTxt.getText().clear();
                FridayAdapter.notifyDataSetChanged();
            }
        });
    }

    private void setRecyclerView(){
        FridayAdapter=new FridayAdapter(FridayModelList);
        FridayRv.setLayoutManager(new LinearLayoutManager(this));
        FridayRv.setAdapter(FridayAdapter);
    }

    private void stergere(String s){
        for(int i=0;i<FridayModelList.size();i++){
            if(FridayModelList.get(i).getName().equals(s)){
                FridayModelList.remove(i);
            }
        }
    }
}