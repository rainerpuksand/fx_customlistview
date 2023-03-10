package com.example.fx_customlistview;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;


public class HelloController {

    @FXML
    private Button btn1;

    @FXML
    private ListView<String> lv1;

    @FXML
    private ListView<Person> lv2;
    ObservableList<Person> myList ;//needed by LV2



    @FXML
    void loadSimpleList(ActionEvent event) {
        ObservableList<String> mySimpleList ;
        mySimpleList = FXCollections.observableArrayList(
                "YO", "Mr.Man", "OOPs Concepts", "Nirvana", "OMG" );

        lv1.setItems(mySimpleList);
    }

    @FXML
    void loadCustomList(ActionEvent event) {
        Person obj0 = new Person("YO", "New Man, Street", "111-659", "Nirvana");
        Person obj1 = new Person("Mr Two", "Double Trouble, EST", "22-458-667", "Nirvana");
        Person obj2 = new Person("Root Nine", "Hill 3 Crosses, VIL", "0335-999", "Nirvana");
        Person obj3  =new Person("For-U", "4th Avenue", "161616-0404", "Nirvana");

        myList = FXCollections.observableArrayList(obj0,obj1,obj2,obj3);

        System.out.println("----------");
        lv2.setItems(myList);
        lv2.setCellFactory(new TheCellFactory());

    }

    @FXML
    void change3rd_Name(){
        myList.set( 2,new Person("Mr. THREE","Hill 3 Crosses, VIL", "0335-999", "Nirvana"));
    }

    @FXML
    void change3rd_NameNoIndex(){
        for (int i = 0; i < myList.size(); i++) {
            Person obj = myList.get(i);
            if (obj.name.equals("Root Nine")) {
                myList.set( i,new Person("Mr. THREE","Hill 3 Crosses, VIL", "0335-999", "Nirvana"));
            }
        }
    }

    @FXML
    public void listItemClicked(MouseEvent event){
        Person selectedVal;
        int selectedIndex;

        selectedVal = lv2.getSelectionModel().getSelectedItem();
        selectedIndex = lv2.getSelectionModel().getSelectedIndex();


        System.out.println(selectedVal.name + "\n" + selectedIndex);
    }






}