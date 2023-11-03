module com.example.java_task01 {
    requires javafx.controls;
    requires javafx.fxml;



    opens com.example.java_task01 to javafx.fxml;
    exports com.example.java_task01;
    exports com.example.java_task01.ui;
    opens com.example.java_task01.ui to javafx.fxml;
    exports com.example.java_task01.controllers;
    opens com.example.java_task01.controllers to javafx.fxml;
    exports com.example.java_task01.ui.builder;
    opens com.example.java_task01.ui.builder to javafx.fxml;
    exports com.example.java_task01.IMT;
    opens com.example.java_task01.IMT to javafx.fxml;
}