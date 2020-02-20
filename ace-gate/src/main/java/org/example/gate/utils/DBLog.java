package org.example.gate.utils;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

@Slf4j
public class DBLog extends Thread{
    private static DBLog dbLog = null;
    //private static BlockingQueue<Login>
    public static synchronized DBLog getInstance() {
        if (dbLog == null) {
            dbLog = new DBLog();
        }
        return dbLog;
    }
}
