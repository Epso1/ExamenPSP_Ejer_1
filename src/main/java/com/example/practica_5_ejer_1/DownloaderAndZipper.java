package com.example.practica_5_ejer_1;

import javafx.collections.ListChangeListener;
import javafx.util.Pair;

public class DownloaderAndZipper implements ListChangeListener<Pair<String, String>> {

    @Override
    public void onChanged(Change<? extends Pair<String, String>> change) {
        while (change.next()) {
            if (change.wasAdded()) {
                for (Pair<String, String> urlPair : change.getAddedSubList()) {
                    if (urlPair.getKey().isEmpty()) {
                        System.out.println("Se va a proceder a descargar y comprimir los ficheros");
                    } else {
                        System.out.println(urlPair.getKey() + " encolado como " + urlPair.getValue());
                    }
                }
            }
        }
    }
}