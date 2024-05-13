module com.example.staffgear {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.staffgear to javafx.fxml;
    exports com.example.staffgear;
}