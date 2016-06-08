package com.gb_androidteam.habits.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

// Метод привыязывания к активити: onBind
// Метод создания onCreate
// Методы включения и отключения таймера
// ...

public class HabitService extends Service {

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }


}
