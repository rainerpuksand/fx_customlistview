package com.example.fx_customlistview;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;

import java.io.IOException;

public class PersonCell extends ListCell<Person> {


        @FXML
         Label nameText;

        @FXML
         Label teleText;

        @FXML
         Label addText;

        public PersonCell() {
            loadFXML();
        }

        private void loadFXML() {
            System.out.println("at FXML");
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("listcell_layout.fxml"));
                loader.setController(this);
                loader.setRoot(this);
                loader.load();
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public void updateItem(Person item, boolean empty) {
            System.out.println("AT UPDATE....");
            super.updateItem(item, empty);

            if(empty || item == null) {
                setText(null);
                setContentDisplay(ContentDisplay.TEXT_ONLY);
            }
            else {
                nameText.setText(item.name);
                addText.setText(item.address);
                teleText.setText(item.tele);

                setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
            }
        }


}
