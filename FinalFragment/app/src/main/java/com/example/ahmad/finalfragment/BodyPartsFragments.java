package com.example.ahmad.finalfragment;

/**
 * Created by ahmad on 27/09/2018.
 */
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ahmad on 14/09/2018.
 */

public class BodyPartsFragments extends Fragment {
    //variable global ??
    private static String   TAG="BodyPartFragment";
    public static final String IMAGE_ID_LIST = "image_ids";
    public static final String LIST_INDEX = "list_index";
    private List<Integer> ImgId;
    private Integer indexImg;
    public BodyPartsFragments() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //membuat tampilan fragment dari fragment layout
        View rootView = inflater.inflate(R.layout.fragment_layout, container, false);
        //menyatakan bahwa gambar akan diletakkan pada id imageviewFragment
        final ImageView imageViewVar = (ImageView) rootView.findViewById(R.id.imageViewFragments);
        if (savedInstanceState!=null){
            ImgId=savedInstanceState.getIntegerArrayList(IMAGE_ID_LIST);
            indexImg=savedInstanceState.getInt(LIST_INDEX);
        }else{
            imageViewVar.setImageResource(ImgId.get(indexImg));
        }

        //Mengisi id imageView dari gambar dari resource
        BodyImageAssets varAssets = new BodyImageAssets();
        //imageViewVar.setImageResource(varAssets.getHeads().get(0));
        //imageViewVar.setImageResource(ImgId.get(0));
        imageViewVar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if (indexImg<ImgId.size()-1){
                    indexImg++;
                }
                else{
                    indexImg=0;
                }
                imageViewVar.setImageResource(ImgId.get(indexImg));
            }
        });
        return rootView;
    }
    //untuk mengisi atau mengeset imgID
    public void setImgId(List<Integer> imgId) {
        ImgId = imgId;
    }
    //untuk mengisi index
    public void setIndexImg(Integer indexImg) {
        this.indexImg = indexImg;
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle currentState) {
        currentState.putIntegerArrayList(IMAGE_ID_LIST, (ArrayList<Integer>)ImgId);
        currentState.putInt(LIST_INDEX,indexImg);
    }



}





