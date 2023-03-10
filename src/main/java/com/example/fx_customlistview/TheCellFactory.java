package com.example.fx_customlistview;

import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

public class TheCellFactory implements Callback<ListView<Person>, ListCell<Person>> {

        @Override
        public ListCell<Person> call(ListView<Person> param) {
            System.out.println("At Factory...." + param);
            return new PersonCell();
        }


}
