package org.tensorflow.demo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by jj on 12/06/18.
 */

public class Datos_Usuario extends SQLiteOpenHelper {
    String tabla="CREATE TABLE Usuario(Nombre TEXT, Nacimiento TEXT,Discapacidad TEXT,Numero TEXT,Frase TEXT)";
    String Palabras_rapidas="CREATE TABLE PalabrasR (Frase TEXT)";
    public Datos_Usuario(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(tabla);
        db.execSQL(Palabras_rapidas);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL(Palabras_rapidas);
    }
}
