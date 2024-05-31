module com.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;
    requires transitive java.sql;
    //requires mysql.connector.java;//


    opens com.example to javafx.fxml;
    exports com.example;
}