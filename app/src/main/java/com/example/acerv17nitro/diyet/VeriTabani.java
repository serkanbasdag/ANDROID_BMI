package com.example.acerv17nitro.diyet;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class VeriTabani extends SQLiteOpenHelper {
    private static final String TabloAd = "DiyetListesi";
    private static final String ROW_CINS = "cins";
    private static final String ROW_BOY = "boy";
    private static final String ROW_KILO = "kilo";
    private static final String ROW_YAS = "yas";
    private static final String ROW_ENDEKS = "endeks";
    private static final String ROW_VUCUTYUZEY = "vucutyuzey";
    private static final String ROW_YAGSIZVUCUT = "yagsizvucut";
    private static final String ROW_VUCUTSUYU = "vucutsuyu";
    private static final String ROW_IDEALKILO = "idealkilo";


    public VeriTabani(Context context) {
        super(context, "Diyet", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(" CREATE TABLE " + TabloAd + "("
                + ROW_CINS + " INTEGER NOT NULL, "
                + ROW_BOY + " INTEGER NOT NULL, "
                + ROW_KILO + " INTEGER NOT NULL, "
                + ROW_YAS + " INTEGER NOT NULL, "
                + ROW_ENDEKS + " INTEGER NOT NULL,"
                + ROW_VUCUTYUZEY + " INTEGER NOT NULL,"
                + ROW_YAGSIZVUCUT + " INTEGER NOT NULL,"
                + ROW_VUCUTSUYU + " INTEGER NOT NULL,"
                + ROW_IDEALKILO + " INTEGER NOT NULL)");
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TabloAd);
        onCreate(db);
    }

    public void VeriEkle(String cins,double boy,double kilo,double yas,double endeks,double vucutyuzey,double yagsizvucut,double vucutsuyu,double idealkilo){
        SQLiteDatabase db = this.getWritableDatabase();
        try {
            ContentValues cv = new ContentValues();
            cv.put(ROW_CINS,cins);
            cv.put(ROW_BOY,boy);
            cv.put(ROW_KILO,kilo);
            cv.put(ROW_YAS,yas);
            cv.put(ROW_ENDEKS,endeks);
            cv.put(ROW_VUCUTYUZEY,endeks);
            cv.put(ROW_YAGSIZVUCUT,endeks);
            cv.put(ROW_VUCUTSUYU,endeks);
            cv.put(ROW_IDEALKILO,endeks);
            db.insertOrThrow(TabloAd,null,cv);
        }catch (Exception e){
            e.printStackTrace();
        }
        db.close();
    }
    public void VeriSil(String endeks){
        SQLiteDatabase db = this.getWritableDatabase();
        try
        {
            String where = ROW_ENDEKS+"="+endeks;
            db.delete(TabloAd,where,null);
        }catch (Exception e){
            db.close();
        }
    }
}
