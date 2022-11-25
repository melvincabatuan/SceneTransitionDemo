module com.example.scenetransitiondemo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.scenetransitiondemo to javafx.fxml;
    exports com.example.scenetransitiondemo;
}