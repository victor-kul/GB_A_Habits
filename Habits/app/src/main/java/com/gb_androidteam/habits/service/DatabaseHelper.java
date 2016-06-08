package com.gb_androidteam.habits.service;

import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

// Методы создания и апгрейда БД: onCreate и onUpgrade
// Методы получения списка "хороших" и "плохих" привычек: getHabitsList, getNegativeHabitsList
// Метод получения следующего уведомления из таблицы NOTIFIES

public class DatabaseHelper extends SQLiteOpenHelper implements BaseColumns {

}