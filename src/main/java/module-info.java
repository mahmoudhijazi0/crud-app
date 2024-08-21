module com.mhd.crudapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires mysql.connector.j;
    requires java.sql;


    opens com.mhd.crudapp to javafx.fxml;
    exports com.mhd.crudapp;
}