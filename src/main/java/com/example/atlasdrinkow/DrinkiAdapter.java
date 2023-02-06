package com.example.atlasdrinkow;
import android.content.Context;
import android.widget.ArrayAdapter;
import android.content.Intent;
public class DrinkiAdapter extends ArrayAdapter{

    private Context context;
    private String[] mDrinki;
    private String[] mSkladniki;


    public DrinkiAdapter(Context context, int resource, String[] mDrinki, String[]mSkladniki){
        super(context, resource);
        this.context = context;
        this.mDrinki = mDrinki;
        this.mSkladniki = mSkladniki;
    }
    @Override
    public int getCount(){
        return mSkladniki.length;
    }
    @Override
    public Object getItem(int position){
        String drinki = mDrinki[position];
        String skladniki = mSkladniki[position];
        return String.format("Drinki: "+drinki+ "\n" + skladniki);
    }
}
