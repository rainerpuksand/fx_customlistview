module com.example.fx_customlistview {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fx_customlistview to javafx.fxml;
    exports com.example.fx_customlistview;
}