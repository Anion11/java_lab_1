module com.example.java_task01 {
    requires javafx.controls;
    requires javafx.fxml;



    opens com.example.java_task01 to javafx.fxml;
    exports com.example.java_task01;
    exports com.example.java_task01.builder;
    opens com.example.java_task01.builder to javafx.fxml;
    exports com.example.java_task01.controllers;
    opens com.example.java_task01.controllers to javafx.fxml;
    exports com.example.java_task01.IMT;
    opens com.example.java_task01.IMT to javafx.fxml;
}