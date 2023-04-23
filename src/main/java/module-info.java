module com.example.ucajavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ucajavafx to javafx.fxml;
    exports com.example.ucajavafx;
}